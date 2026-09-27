package com.fasterxml.jackson.databind.type;

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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = typeFactory0._hashMapSuperInterfaceChain(hierarchicType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = hierarchicType1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._hashMapSuperInterfaceChain(hierarchicType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._constructType(type4, typeBindings5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1._constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructType((java.lang.reflect.Type) javaType4);
        java.lang.reflect.GenericArrayType genericArrayType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._fromArrayType(genericArrayType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        java.lang.Class<?> wildcardClass5 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        java.lang.reflect.ParameterizedType parameterizedType13 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory0._fromParamType(parameterizedType13, typeBindings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        java.lang.Class<?> wildcardClass13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType12);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        java.lang.Class<?> wildcardClass5 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        java.lang.reflect.WildcardType wildcardType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromWildcard(wildcardType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        java.lang.Class<?> wildcardClass13 = javaType9.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        java.lang.reflect.WildcardType wildcardType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromWildcard(wildcardType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1._constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructType((java.lang.reflect.Type) javaType4);
        java.lang.reflect.ParameterizedType parameterizedType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._fromParamType(parameterizedType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1._constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructType((java.lang.reflect.Type) javaType4);
        java.lang.Class<?> wildcardClass6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType5);
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType5);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        java.lang.reflect.Type type6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType(type6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1._constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructType((java.lang.reflect.Type) javaType4);
        java.lang.Class<?> wildcardClass6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType4);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        java.lang.reflect.WildcardType wildcardType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._fromWildcard(wildcardType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.reflect.WildcardType wildcardType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromWildcard(wildcardType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(typeModifierArray4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.reflect.WildcardType wildcardType1 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._fromWildcard(wildcardType1, typeBindings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        java.lang.reflect.ParameterizedType parameterizedType16 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15._fromParamType(parameterizedType16, typeBindings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._resolveVariableViaSubTypes(hierarchicType4, "", typeBindings6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(javaType7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.ArrayType arrayType4 = typeFactory0.constructArrayType(javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        java.lang.reflect.ParameterizedType parameterizedType28 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory27._fromParamType(parameterizedType28, typeBindings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory3._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory0.constructArrayType(javaType12);
        typeFactory0.clearCache();
        java.lang.reflect.WildcardType wildcardType15 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0._fromWildcard(wildcardType15, typeBindings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNull(hierarchicType2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.ArrayType arrayType10 = typeFactory8.constructArrayType(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory14._parser;
        java.lang.reflect.GenericArrayType genericArrayType16 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory14._fromArrayType(genericArrayType16, typeBindings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        java.lang.reflect.ParameterizedType parameterizedType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromParamType(parameterizedType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory5.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory5._modifiers;
        java.lang.reflect.WildcardType wildcardType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory5._fromWildcard(wildcardType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory15._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        java.lang.reflect.WildcardType wildcardType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._fromWildcard(wildcardType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        java.lang.reflect.GenericArrayType genericArrayType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromArrayType(genericArrayType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNull(typeModifierArray3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._unknownType();
        java.lang.reflect.GenericArrayType genericArrayType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._fromArrayType(genericArrayType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        java.lang.reflect.GenericArrayType genericArrayType20 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15._fromArrayType(genericArrayType20, typeBindings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        java.lang.reflect.Type type2 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructType(type2, typeBindings3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray1 = typeFactory0._modifiers;
        java.lang.reflect.WildcardType wildcardType2 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._fromWildcard(wildcardType2, typeBindings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(typeModifierArray1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.HierarchicType hierarchicType33 = typeFactory31._arrayListSuperInterfaceChain(hierarchicType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory14._parser;
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory14._unknownType();
        java.lang.reflect.WildcardType wildcardType17 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory14._fromWildcard(wildcardType17, typeBindings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(javaType16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory3._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory0.constructArrayType(javaType12);
        java.lang.reflect.GenericArrayType genericArrayType14 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory0._fromArrayType(genericArrayType14, typeBindings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNull(hierarchicType2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass10 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.reflect.GenericArrayType genericArrayType1 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._fromArrayType(genericArrayType1, typeBindings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        typeFactory0.clearCache();
        java.lang.reflect.GenericArrayType genericArrayType3 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._fromArrayType(genericArrayType3, typeBindings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
// flaky "1) test051(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory5.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory18._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory18.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeParser19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.reflect.GenericArrayType genericArrayType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromArrayType(genericArrayType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(typeModifierArray4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        java.lang.Class<?> wildcardClass23 = typeFactory22.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1._constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructType((java.lang.reflect.Type) javaType4);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap6 = typeFactory0._typeCache;
        java.lang.reflect.WildcardType wildcardType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._fromWildcard(wildcardType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(classKeyLRUMap6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass7 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        java.lang.reflect.ParameterizedType parameterizedType4 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._fromParamType(parameterizedType4, typeBindings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        java.lang.reflect.GenericArrayType genericArrayType19 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory18._fromArrayType(genericArrayType19, typeBindings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.reflect.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
// flaky "2) test062(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType3);
        org.junit.Assert.assertNull(typeModifierArray4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        java.lang.Class<?> wildcardClass4 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = typeFactory0._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(hierarchicType8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = typeFactory15._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType18 = null;
        typeFactory15._cachedHashMapType = hierarchicType18;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType17);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9._constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory8.constructType((java.lang.reflect.Type) javaType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._constructType((java.lang.reflect.Type) javaType12, typeBindings14);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap16 = typeFactory7._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(classKeyLRUMap16);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        java.lang.reflect.GenericArrayType genericArrayType3 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._fromArrayType(genericArrayType3, typeBindings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
// flaky "3) test068(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.reflect.GenericArrayType genericArrayType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6._fromArrayType(genericArrayType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
// flaky "4) test069(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeModifierArray5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType34 = null;
        typeFactory33._cachedArrayListType = hierarchicType34;
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType41 = null;
        typeFactory40._cachedArrayListType = hierarchicType41;
        com.fasterxml.jackson.databind.type.TypeParser typeParser43 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray45 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier44 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser43, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray45);
        java.lang.reflect.ParameterizedType parameterizedType51 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings52 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType53 = typeFactory50._fromParamType(parameterizedType51, typeBindings52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeParser43);
        org.junit.Assert.assertNotNull(typeModifierArray45);
        org.junit.Assert.assertArrayEquals(typeModifierArray45, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType2 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(javaType2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        java.lang.reflect.ParameterizedType parameterizedType3 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._fromParamType(parameterizedType3, typeBindings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
// flaky "5) test073(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap16 = typeFactory15._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap16);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory18._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap20 = typeFactory18._typeCache;
        java.lang.Class<?> wildcardClass21 = classKeyLRUMap20.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(classKeyLRUMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory0._typeCache;
        java.lang.reflect.WildcardType wildcardType14 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory0._fromWildcard(wildcardType14, typeBindings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        java.lang.reflect.WildcardType wildcardType2 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._fromWildcard(wildcardType2, typeBindings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
// flaky "6) test078(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
        org.junit.Assert.assertNull(typeModifierArray3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass7 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory16.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._resolveVariableViaSubTypes(hierarchicType3, "hi!", typeBindings5);
        java.lang.reflect.ParameterizedType parameterizedType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._fromParamType(parameterizedType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
// flaky "7) test081(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        typeFactory15.clearCache();
        java.lang.reflect.GenericArrayType genericArrayType21 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory15._fromArrayType(genericArrayType21, typeBindings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory12.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory14._parser;
        java.lang.reflect.ParameterizedType parameterizedType16 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory14._fromParamType(parameterizedType16, typeBindings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory8._cachedArrayListType;
        java.lang.reflect.GenericArrayType genericArrayType12 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory8._fromArrayType(genericArrayType12, typeBindings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(hierarchicType11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        java.lang.Class<?> wildcardClass3 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory7._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory15._unknownType();
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory15._constructType(type17, typeBindings18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType16);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory7._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = null;
        typeFactory2._cachedArrayListType = hierarchicType3;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray7);
        java.lang.reflect.GenericArrayType genericArrayType11 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory10._fromArrayType(genericArrayType11, typeBindings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        java.lang.reflect.ParameterizedType parameterizedType13 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory12._fromParamType(parameterizedType13, typeBindings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType3);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        java.lang.reflect.WildcardType wildcardType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._fromWildcard(wildcardType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNull(hierarchicType4);
        org.junit.Assert.assertNotNull(typeParser5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType0);
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        java.lang.Class<?> wildcardClass3 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
// flaky "8) test096(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = typeFactory8._cachedHashMapType;
        java.lang.reflect.GenericArrayType genericArrayType13 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory8._fromArrayType(genericArrayType13, typeBindings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(hierarchicType11);
        org.junit.Assert.assertNull(hierarchicType12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = typeFactory27._cachedArrayListType;
        typeFactory27.clearCache();
        java.lang.reflect.ParameterizedType parameterizedType30 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory27._fromParamType(parameterizedType30, typeBindings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(hierarchicType28);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier31 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType37 = null;
        typeFactory36._cachedArrayListType = hierarchicType37;
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeFactory36._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray40 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray40);
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType44 = null;
        typeFactory43._cachedArrayListType = hierarchicType44;
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory43._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray48 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier47 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser42, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray48);
        java.lang.reflect.ParameterizedType parameterizedType54 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory53._fromParamType(parameterizedType54, typeBindings55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray32);
        org.junit.Assert.assertArrayEquals(typeModifierArray32, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeModifierArray40);
        org.junit.Assert.assertArrayEquals(typeModifierArray40, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeModifierArray48);
        org.junit.Assert.assertArrayEquals(typeModifierArray48, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        java.lang.reflect.ParameterizedType parameterizedType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromParamType(parameterizedType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        java.lang.reflect.ParameterizedType parameterizedType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromParamType(parameterizedType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        java.lang.Class<?> wildcardClass3 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        java.lang.reflect.ParameterizedType parameterizedType11 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory0._fromParamType(parameterizedType11, typeBindings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._resolveVariableViaSubTypes(hierarchicType12, "", typeBindings14);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory0.constructType((java.lang.reflect.Type) javaType15, typeBindings16);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(hierarchicType6);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType17);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray15);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = typeFactory16._cachedArrayListType;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory16._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType17);
        org.junit.Assert.assertNotNull(javaType18);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.reflect.ParameterizedType parameterizedType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromParamType(parameterizedType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(typeModifierArray4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        java.lang.reflect.GenericArrayType genericArrayType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8._fromArrayType(genericArrayType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = typeFactory8._cachedHashMapType;
        java.lang.reflect.ParameterizedType parameterizedType13 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory8._fromParamType(parameterizedType13, typeBindings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(hierarchicType11);
        org.junit.Assert.assertNull(hierarchicType12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._resolveVariableViaSubTypes(hierarchicType3, "hi!", typeBindings5);
        java.lang.Class<?> wildcardClass7 = javaType6.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
// flaky "9) test112(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier31 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray32);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap37 = typeFactory36._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray32);
        org.junit.Assert.assertArrayEquals(typeModifierArray32, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap37);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
// flaky "10) test114(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        java.lang.Class<?> wildcardClass28 = typeModifierArray25.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory0._cachedArrayListType;
        java.lang.reflect.GenericArrayType genericArrayType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._fromArrayType(genericArrayType5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNull(hierarchicType4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNull(typeModifierArray5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser31 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType34 = null;
        typeFactory33._cachedArrayListType = hierarchicType34;
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier37 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser31, typeModifierArray38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray38);
        java.lang.reflect.ParameterizedType parameterizedType43 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory42._fromParamType(parameterizedType43, typeBindings44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeParser31);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray32);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType35 = typeFactory33.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        java.lang.reflect.WildcardType wildcardType9 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory6._fromWildcard(wildcardType9, typeBindings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        java.lang.Class<?> wildcardClass9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType8);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9._constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory8.constructType((java.lang.reflect.Type) javaType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._constructType((java.lang.reflect.Type) javaType12, typeBindings14);
        java.lang.Class<?> wildcardClass16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType12);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory0._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        java.lang.reflect.GenericArrayType genericArrayType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory7._fromArrayType(genericArrayType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(typeModifierArray6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._cachedHashMapType;
        java.lang.Class<?> wildcardClass7 = null; // flaky "11) test127(com.fasterxml.jackson.databind.type.RegressionTest0)": hierarchicType6.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
// flaky "1) test127(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType6);
// flaky "1) test127(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory3._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory0.constructArrayType(javaType12);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory0._unknownType();
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNull(hierarchicType2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(javaType15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        java.lang.reflect.WildcardType wildcardType27 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory26._fromWildcard(wildcardType27, typeBindings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray15);
        typeFactory16.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = typeFactory27._cachedHashMapType;
        java.lang.reflect.ParameterizedType parameterizedType29 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory27._fromParamType(parameterizedType29, typeBindings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(hierarchicType28);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory0._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(javaType8);
// flaky "12) test133(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory14._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap16 = typeFactory14._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory14._unknownType();
        java.lang.Class<?> wildcardClass18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType17);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(classKeyLRUMap16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        java.lang.reflect.GenericArrayType genericArrayType11 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory8._fromArrayType(genericArrayType11, typeBindings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = typeFactory22._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType23);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType27 = null;
        typeFactory26._cachedHashMapType = hierarchicType27;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap29 = typeFactory26._typeCache;
        typeFactory26.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap29);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        java.lang.reflect.GenericArrayType genericArrayType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromArrayType(genericArrayType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = typeFactory6._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNull(hierarchicType8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = typeFactory7._cachedHashMapType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory7.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(hierarchicType8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.reflect.GenericArrayType genericArrayType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._fromArrayType(genericArrayType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory8._modifiers;
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType34 = null;
        typeFactory33._cachedArrayListType = hierarchicType34;
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType41 = null;
        typeFactory40._cachedArrayListType = hierarchicType41;
        com.fasterxml.jackson.databind.type.TypeParser typeParser43 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray45 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier44 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser43, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray45);
        java.lang.reflect.WildcardType wildcardType51 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings52 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType53 = typeFactory50._fromWildcard(wildcardType51, typeBindings52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeParser43);
        org.junit.Assert.assertNotNull(typeModifierArray45);
        org.junit.Assert.assertArrayEquals(typeModifierArray45, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withModifier(typeModifier7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap5 = typeFactory0._typeCache;
        java.lang.Class<?> wildcardClass6 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(classKeyLRUMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1._constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructType((java.lang.reflect.Type) javaType4);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
// flaky "13) test150(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType3);
        org.junit.Assert.assertNull(hierarchicType4);
        org.junit.Assert.assertNull(hierarchicType5);
        org.junit.Assert.assertNotNull(typeParser6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = typeFactory7._cachedHashMapType;
        java.lang.reflect.GenericArrayType genericArrayType9 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory7._fromArrayType(genericArrayType9, typeBindings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(hierarchicType8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        typeFactory31.clearCache();
        typeFactory31.clearCache();
        java.lang.reflect.WildcardType wildcardType34 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory31._fromWildcard(wildcardType34, typeBindings35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType27 = null;
        typeFactory26._cachedHashMapType = hierarchicType27;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap29 = typeFactory26._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory26._unknownType();
        java.lang.Class<?> wildcardClass31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType30);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap5 = typeFactory0._typeCache;
        java.lang.reflect.WildcardType wildcardType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._fromWildcard(wildcardType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(classKeyLRUMap5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory0._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNull(hierarchicType9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass3 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.type.ArrayType arrayType12 = typeFactory2.constructArrayType(javaType11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory2.withModifier(typeModifier14);
        java.lang.Class<?> wildcardClass16 = typeFactory2.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(arrayType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = typeFactory6._cachedHashMapType;
        java.lang.reflect.GenericArrayType genericArrayType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6._fromArrayType(genericArrayType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(hierarchicType7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory15._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        java.lang.Class<?> wildcardClass19 = typeFactory15.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = typeFactory22._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = typeFactory22._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType24);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = typeFactory27._cachedArrayListType;
        java.lang.reflect.ParameterizedType parameterizedType29 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory27._fromParamType(parameterizedType29, typeBindings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(hierarchicType28);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType34 = null;
        typeFactory33._cachedArrayListType = hierarchicType34;
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType41 = null;
        typeFactory40._cachedArrayListType = hierarchicType41;
        com.fasterxml.jackson.databind.type.TypeParser typeParser43 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray45 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier44 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser43, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray45);
        com.fasterxml.jackson.databind.JavaType javaType51 = typeFactory50._unknownType();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType52 = typeFactory50._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeParser43);
        org.junit.Assert.assertNotNull(typeModifierArray45);
        org.junit.Assert.assertArrayEquals(typeModifierArray45, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNull(hierarchicType52);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = typeFactory15._cachedHashMapType;
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory15.withModifier(typeModifier19);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType17);
        org.junit.Assert.assertNotNull(typeFactory20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType27 = null;
        typeFactory26._cachedHashMapType = hierarchicType27;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap29 = typeFactory26._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory26._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = typeFactory26._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory26._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType32);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap19 = typeFactory15._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(classKeyLRUMap19);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.reflect.WildcardType wildcardType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._fromWildcard(wildcardType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        java.lang.Class<?> wildcardClass6 = typeFactory5.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap15 = typeFactory14._typeCache;
        java.lang.Class<?> wildcardClass16 = typeFactory14.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType34 = null;
        typeFactory33._cachedArrayListType = hierarchicType34;
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType41 = null;
        typeFactory40._cachedArrayListType = hierarchicType41;
        com.fasterxml.jackson.databind.type.TypeParser typeParser43 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray45 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier44 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser43, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray45);
        com.fasterxml.jackson.databind.JavaType javaType51 = typeFactory50._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory50._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeParser43);
        org.junit.Assert.assertNotNull(typeModifierArray45);
        org.junit.Assert.assertArrayEquals(typeModifierArray45, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(javaType52);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = typeFactory22._modifiers;
        java.lang.reflect.ParameterizedType parameterizedType24 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory22._fromParamType(parameterizedType24, typeBindings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap20 = typeFactory15._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(classKeyLRUMap20);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.type.ArrayType arrayType12 = typeFactory2.constructArrayType(javaType11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory2.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = typeFactory15._cachedHashMapType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(arrayType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(hierarchicType16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory0.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap17 = typeFactory0._typeCache;
        java.lang.Class<?> wildcardClass18 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(hierarchicType16);
        org.junit.Assert.assertNotNull(classKeyLRUMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        java.lang.reflect.ParameterizedType parameterizedType2 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._fromParamType(parameterizedType2, typeBindings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        java.lang.reflect.WildcardType wildcardType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromWildcard(wildcardType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier9 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser8, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory13._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray14);
        org.junit.Assert.assertArrayEquals(typeModifierArray14, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        java.lang.reflect.ParameterizedType parameterizedType13 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory0._fromParamType(parameterizedType13, typeBindings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType31 = null;
        typeFactory30._cachedArrayListType = hierarchicType31;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = typeFactory38._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType43 = typeFactory42._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType43);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = typeFactory27._cachedArrayListType;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap29 = typeFactory27._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap30 = typeFactory27._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(hierarchicType28);
        org.junit.Assert.assertNotNull(classKeyLRUMap29);
        org.junit.Assert.assertNotNull(classKeyLRUMap30);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        java.lang.reflect.WildcardType wildcardType16 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15._fromWildcard(wildcardType16, typeBindings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType31 = null;
        typeFactory30._cachedArrayListType = hierarchicType31;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = typeFactory38._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        java.lang.Class<?> wildcardClass41 = typeModifierArray39.getClass();
        java.lang.Class<?> wildcardClass42 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass41);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory2._cachedHashMapType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = hierarchicType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNull(hierarchicType4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = typeFactory0._cachedArrayListType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
// flaky "14) test186(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType1);
// flaky "2) test186(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
// flaky "2) test186(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory8._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap14 = typeFactory8._typeCache;
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(hierarchicType11);
        org.junit.Assert.assertNull(hierarchicType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(classKeyLRUMap14);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray15);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType18 = null;
        typeFactory17._cachedArrayListType = hierarchicType18;
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = typeFactory17._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier21 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser20, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray22);
        java.lang.Class<?> wildcardClass25 = typeModifierArray22.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser20);
        org.junit.Assert.assertNotNull(typeModifierArray22);
        org.junit.Assert.assertArrayEquals(typeModifierArray22, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory18._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap20 = typeFactory18._typeCache;
        java.lang.reflect.ParameterizedType parameterizedType21 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory18._fromParamType(parameterizedType21, typeBindings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(classKeyLRUMap20);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap8 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory6._cachedArrayListType;
        java.lang.reflect.GenericArrayType genericArrayType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory6._fromArrayType(genericArrayType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(classKeyLRUMap8);
        org.junit.Assert.assertNull(hierarchicType9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory2._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory2._parser;
        java.lang.reflect.Type type6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory2.constructType(type6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNull(hierarchicType4);
        org.junit.Assert.assertNotNull(typeParser5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = typeFactory8._cachedHashMapType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory8.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(hierarchicType11);
        org.junit.Assert.assertNull(hierarchicType12);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier9 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser8, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray10);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory13._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = null;
        typeFactory8._cachedArrayListType = hierarchicType9;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory14._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray15);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory18._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser19);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        java.lang.reflect.GenericArrayType genericArrayType9 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory0._fromArrayType(genericArrayType9, typeBindings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier9 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser8, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType15 = null;
        typeFactory14._cachedArrayListType = hierarchicType15;
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier18 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser17, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = typeFactory20._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = typeFactory22._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser17);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser23);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory0.withModifier(typeModifier14);
        java.lang.reflect.ParameterizedType parameterizedType16 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15._fromParamType(parameterizedType16, typeBindings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType29 = null;
        typeFactory28._cachedArrayListType = hierarchicType29;
        com.fasterxml.jackson.databind.type.TypeParser typeParser31 = typeFactory28._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier32 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray33 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier32 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser31, typeModifierArray33);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray33);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray33);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = typeFactory36._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory36._unknownType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings39 = null;
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory20.constructType((java.lang.reflect.Type) javaType38, typeBindings39);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeParser31);
        org.junit.Assert.assertNotNull(typeModifierArray33);
        org.junit.Assert.assertArrayEquals(typeModifierArray33, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(javaType40);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5);
        java.lang.reflect.ParameterizedType parameterizedType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6._fromParamType(parameterizedType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.type.ArrayType arrayType12 = typeFactory2.constructArrayType(javaType11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory2.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory2._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(arrayType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(typeModifierArray16);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = typeFactory0._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(hierarchicType5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory0.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(typeModifierArray16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray1 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._resolveVariableViaSubTypes(hierarchicType2, "", typeBindings4);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(typeModifierArray1);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        java.lang.reflect.ParameterizedType parameterizedType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._fromParamType(parameterizedType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory22._unknownType();
        java.lang.reflect.GenericArrayType genericArrayType24 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory22._fromArrayType(genericArrayType24, typeBindings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType23);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray32);
        typeFactory33.clearCache();
        java.lang.reflect.ParameterizedType parameterizedType35 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory33._fromParamType(parameterizedType35, typeBindings36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap15 = typeFactory14._typeCache;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = typeFactory14._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = typeFactory14._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap15);
        org.junit.Assert.assertNull(hierarchicType16);
        org.junit.Assert.assertNull(hierarchicType17);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap23 = typeFactory22._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory22._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap23);
        org.junit.Assert.assertNotNull(typeParser24);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType31 = null;
        typeFactory30._cachedArrayListType = hierarchicType31;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = typeFactory38._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = typeFactory40._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        typeFactory31.clearCache();
        typeFactory31.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory31._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory31.withModifier(typeModifier35);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType37 = typeFactory31._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(hierarchicType37);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory0._unknownType();
        java.lang.reflect.GenericArrayType genericArrayType12 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory0._fromArrayType(genericArrayType12, typeBindings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType20 = typeFactory15._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType21 = typeFactory15._cachedHashMapType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType22);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory15._constructType((java.lang.reflect.Type) wildcardClass23, typeBindings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(hierarchicType20);
        org.junit.Assert.assertNull(hierarchicType21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        typeFactory4._cachedArrayListType = hierarchicType5;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withModifier(typeModifier9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = null;
        typeFactory12._cachedArrayListType = hierarchicType13;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray17 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier16 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray17);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = typeFactory18._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray19);
        java.lang.reflect.GenericArrayType genericArrayType22 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory21._fromArrayType(genericArrayType22, typeBindings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeModifierArray17);
        org.junit.Assert.assertArrayEquals(typeModifierArray17, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap5 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory0._modifiers;
        java.lang.reflect.WildcardType wildcardType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._fromWildcard(wildcardType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(classKeyLRUMap5);
        org.junit.Assert.assertNull(typeModifierArray6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray15);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = typeFactory16._cachedArrayListType;
        java.lang.reflect.GenericArrayType genericArrayType18 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory16._fromArrayType(genericArrayType18, typeBindings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType17);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        java.lang.reflect.WildcardType wildcardType3 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0._fromWildcard(wildcardType3, typeBindings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory2._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType31 = null;
        typeFactory30._cachedArrayListType = hierarchicType31;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = typeFactory38._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        java.lang.reflect.ParameterizedType parameterizedType41 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory40._fromParamType(parameterizedType41, typeBindings42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory3._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory0.constructArrayType(javaType12);
        java.lang.Class<?> wildcardClass14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) arrayType13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNull(hierarchicType2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory8._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory8._modifiers;
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(hierarchicType11);
        org.junit.Assert.assertNull(hierarchicType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(typeModifierArray14);
        org.junit.Assert.assertArrayEquals(typeModifierArray14, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap10 = typeFactory8._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNotNull(classKeyLRUMap10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.reflect.ParameterizedType parameterizedType3 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._fromParamType(parameterizedType3, typeBindings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = typeFactory8._cachedHashMapType;
        java.lang.reflect.WildcardType wildcardType13 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory8._fromWildcard(wildcardType13, typeBindings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(hierarchicType11);
        org.junit.Assert.assertNull(hierarchicType12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.type.ArrayType arrayType12 = typeFactory2.constructArrayType(javaType11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory2.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = typeFactory15._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory15._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(arrayType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(hierarchicType16);
        org.junit.Assert.assertNotNull(typeParser17);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeParser9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap10 = typeFactory8._typeCache;
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap3 = typeFactory0._typeCache;
        java.lang.reflect.ParameterizedType parameterizedType4 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._fromParamType(parameterizedType4, typeBindings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap8 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory6._cachedArrayListType;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap10 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory6._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(classKeyLRUMap8);
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNotNull(classKeyLRUMap10);
        org.junit.Assert.assertNotNull(typeParser11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType31 = null;
        typeFactory30._cachedArrayListType = hierarchicType31;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = typeFactory38._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        typeFactory40.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType42 = typeFactory40._unknownType();
        java.lang.reflect.ParameterizedType parameterizedType43 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory40._fromParamType(parameterizedType43, typeBindings44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType42);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap7 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
// flaky "15) test234(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(classKeyLRUMap7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._unknownType();
        java.lang.reflect.GenericArrayType genericArrayType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._fromArrayType(genericArrayType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory5._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(typeModifierArray6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        typeFactory15.clearCache();
        java.lang.reflect.WildcardType wildcardType21 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory15._fromWildcard(wildcardType21, typeBindings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        typeFactory12.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType10 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9._constructType((java.lang.reflect.Type) simpleType10, typeBindings11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory8.constructType((java.lang.reflect.Type) javaType12);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._constructType((java.lang.reflect.Type) javaType12, typeBindings14);
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory7._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(simpleType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory12._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory12._cachedArrayListType;
        java.lang.reflect.ParameterizedType parameterizedType15 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory12._fromParamType(parameterizedType15, typeBindings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(hierarchicType13);
        org.junit.Assert.assertNull(hierarchicType14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        typeFactory31.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType33 = typeFactory31._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType33);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory15.constructType((java.lang.reflect.Type) simpleType21, typeBindings22);
        java.lang.Class<?> wildcardClass24 = simpleType21.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType10 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(arrayType10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory2._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        typeFactory11.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser20, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType34 = null;
        typeFactory33._cachedArrayListType = hierarchicType34;
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType40 = null;
        typeFactory39._cachedArrayListType = hierarchicType40;
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory39._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray43 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser42, typeModifierArray43);
        com.fasterxml.jackson.databind.type.TypeParser typeParser45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType47 = null;
        typeFactory46._cachedArrayListType = hierarchicType47;
        com.fasterxml.jackson.databind.type.TypeParser typeParser49 = typeFactory46._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier50 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray51 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier50 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser49, typeModifierArray51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser45, typeModifierArray51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser42, typeModifierArray51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray51);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNull(hierarchicType4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeParser20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeModifierArray43);
        org.junit.Assert.assertArrayEquals(typeModifierArray43, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeParser49);
        org.junit.Assert.assertNotNull(typeModifierArray51);
        org.junit.Assert.assertArrayEquals(typeModifierArray51, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap12 = typeFactory8._typeCache;
        java.lang.Class<?> wildcardClass13 = classKeyLRUMap12.getClass();
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(typeParser11);
        org.junit.Assert.assertNotNull(classKeyLRUMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = typeFactory2._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(hierarchicType3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = typeFactory0._cachedArrayListType;
        java.lang.reflect.ParameterizedType parameterizedType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._fromParamType(parameterizedType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(hierarchicType6);
        org.junit.Assert.assertNull(hierarchicType7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = typeFactory14._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNull(hierarchicType16);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.reflect.WildcardType wildcardType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6._fromWildcard(wildcardType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = typeFactory26._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory6.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15._constructType((java.lang.reflect.Type) simpleType16, typeBindings17);
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory14.constructType((java.lang.reflect.Type) javaType18);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory13._constructType((java.lang.reflect.Type) javaType18, typeBindings20);
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory0.constructType((java.lang.reflect.Type) javaType21, javaType22);
        java.lang.reflect.WildcardType wildcardType24 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory0._fromWildcard(wildcardType24, typeBindings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = typeFactory0._cachedArrayListType;
        java.lang.reflect.ParameterizedType parameterizedType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._fromParamType(parameterizedType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNull(hierarchicType7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
        org.junit.Assert.assertNull(typeModifierArray3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = typeFactory15._cachedHashMapType;
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory15._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap20 = typeFactory15._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory15.withModifier(typeModifier21);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = typeFactory22._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType17);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(classKeyLRUMap20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory12._cachedHashMapType;
        java.lang.reflect.ParameterizedType parameterizedType14 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory12._fromParamType(parameterizedType14, typeBindings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(hierarchicType13);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        java.lang.reflect.ParameterizedType parameterizedType19 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory18._fromParamType(parameterizedType19, typeBindings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
// flaky "16) test259(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray15);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withModifier(typeModifier17);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap5 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(classKeyLRUMap5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = typeFactory15._cachedHashMapType;
        java.lang.reflect.WildcardType wildcardType18 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory15._fromWildcard(wildcardType18, typeBindings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType17);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        typeFactory31.clearCache();
        typeFactory31.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory31._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory31.withModifier(typeModifier35);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType37 = typeFactory36._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(hierarchicType37);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType20 = typeFactory15._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = typeFactory15._arrayListSuperInterfaceChain(hierarchicType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(hierarchicType20);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory9._resolveVariableViaSubTypes(hierarchicType10, "", typeBindings12);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
// flaky "17) test266(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType13);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = typeFactory27._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType29 = typeFactory27._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(hierarchicType28);
        org.junit.Assert.assertNull(hierarchicType29);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier9 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser8, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType15 = null;
        typeFactory14._cachedArrayListType = hierarchicType15;
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier18 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser17, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = typeFactory20._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        typeFactory23.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType29 = null;
        typeFactory28._cachedArrayListType = hierarchicType29;
        com.fasterxml.jackson.databind.type.TypeParser typeParser31 = typeFactory28._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory28._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType35 = null;
        typeFactory34._cachedArrayListType = hierarchicType35;
        com.fasterxml.jackson.databind.type.TypeParser typeParser37 = typeFactory34._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier38 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser37, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType45 = null;
        typeFactory44._cachedArrayListType = hierarchicType45;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser17);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeParser31);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeParser37);
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory14._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap16 = typeFactory14._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory14._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType21 = null;
        typeFactory20._cachedArrayListType = hierarchicType21;
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = typeFactory20._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier24 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier24 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser23, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray25);
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory28._unknownType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory14.constructType((java.lang.reflect.Type) javaType29, typeBindings30);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(classKeyLRUMap16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeParser23);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType31);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = typeFactory0._cachedArrayListType;
        java.lang.reflect.ParameterizedType parameterizedType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._fromParamType(parameterizedType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
// flaky "18) test270(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType3);
        org.junit.Assert.assertNull(hierarchicType4);
        org.junit.Assert.assertNull(hierarchicType5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory20.withModifier(typeModifier21);
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory22._unknownType();
        java.lang.reflect.Type type24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory22.constructType(type24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(javaType23);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray13);
        org.junit.Assert.assertNotNull(javaType14);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        java.lang.reflect.ParameterizedType parameterizedType19 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory15._fromParamType(parameterizedType19, typeBindings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.type.ArrayType arrayType12 = typeFactory2.constructArrayType(javaType11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory2.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = typeFactory15._cachedHashMapType;
        typeFactory15.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(arrayType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(hierarchicType16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType31 = null;
        typeFactory30._cachedArrayListType = hierarchicType31;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = typeFactory38._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray43);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType46 = null;
        typeFactory45._cachedArrayListType = hierarchicType46;
        com.fasterxml.jackson.databind.type.TypeParser typeParser48 = typeFactory45._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray49 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser48, typeModifierArray49);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType52 = null;
        typeFactory51._cachedArrayListType = hierarchicType52;
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory51._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray55 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser54, typeModifierArray55);
        com.fasterxml.jackson.databind.type.TypeParser typeParser57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType59 = null;
        typeFactory58._cachedArrayListType = hierarchicType59;
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = typeFactory58._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier62 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray63 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier62 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser61, typeModifierArray63);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser57, typeModifierArray63);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory66 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser54, typeModifierArray63);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser48, typeModifierArray63);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray68 = typeFactory67._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray68);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeParser48);
        org.junit.Assert.assertNotNull(typeModifierArray49);
        org.junit.Assert.assertArrayEquals(typeModifierArray49, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeParser54);
        org.junit.Assert.assertNotNull(typeModifierArray55);
        org.junit.Assert.assertArrayEquals(typeModifierArray55, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeParser61);
        org.junit.Assert.assertNotNull(typeModifierArray63);
        org.junit.Assert.assertArrayEquals(typeModifierArray63, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray68);
        org.junit.Assert.assertArrayEquals(typeModifierArray68, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
// flaky "19) test276(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap7 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
// flaky "20) test277(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType6);
        org.junit.Assert.assertNotNull(classKeyLRUMap7);
        org.junit.Assert.assertNull(typeModifierArray8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier31 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray32);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType37 = typeFactory36._cachedHashMapType;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory36._unknownType();
        java.lang.Class<?> wildcardClass39 = typeFactory36.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray32);
        org.junit.Assert.assertArrayEquals(typeModifierArray32, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType37);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        typeFactory4._cachedArrayListType = hierarchicType5;
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType10 = null;
        typeFactory9._cachedArrayListType = hierarchicType10;
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory9._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory9._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray20 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier19 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray20);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray20);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray20);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser8, typeModifierArray20);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType26 = null;
        typeFactory25._cachedArrayListType = hierarchicType26;
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser8, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType34 = null;
        typeFactory33._cachedArrayListType = hierarchicType34;
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser37 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType39 = null;
        typeFactory38._cachedArrayListType = hierarchicType39;
        com.fasterxml.jackson.databind.type.TypeParser typeParser41 = typeFactory38._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory38._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType45 = null;
        typeFactory44._cachedArrayListType = hierarchicType45;
        com.fasterxml.jackson.databind.type.TypeParser typeParser47 = typeFactory44._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier48 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray49 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier48 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser47, typeModifierArray49);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser43, typeModifierArray49);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser42, typeModifierArray49);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser37, typeModifierArray49);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType55 = null;
        typeFactory54._cachedArrayListType = hierarchicType55;
        com.fasterxml.jackson.databind.type.TypeParser typeParser57 = typeFactory54._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser58 = typeFactory54._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType61 = null;
        typeFactory60._cachedArrayListType = hierarchicType61;
        com.fasterxml.jackson.databind.type.TypeParser typeParser63 = typeFactory60._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier64 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray65 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier64 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory66 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser63, typeModifierArray65);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser59, typeModifierArray65);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser58, typeModifierArray65);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType70 = null;
        typeFactory69._cachedArrayListType = hierarchicType70;
        com.fasterxml.jackson.databind.type.TypeParser typeParser72 = typeFactory69._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray73 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser72, typeModifierArray73);
        com.fasterxml.jackson.databind.type.TypeParser typeParser75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType77 = null;
        typeFactory76._cachedArrayListType = hierarchicType77;
        com.fasterxml.jackson.databind.type.TypeParser typeParser79 = typeFactory76._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier80 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray81 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier80 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory82 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser79, typeModifierArray81);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory83 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser75, typeModifierArray81);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory84 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser72, typeModifierArray81);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory85 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser58, typeModifierArray81);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory86 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser37, typeModifierArray81);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory87 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray81);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray20);
        org.junit.Assert.assertArrayEquals(typeModifierArray20, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeParser37);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(typeParser41);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeParser47);
        org.junit.Assert.assertNotNull(typeModifierArray49);
        org.junit.Assert.assertArrayEquals(typeModifierArray49, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory54);
        org.junit.Assert.assertNotNull(typeParser57);
        org.junit.Assert.assertNotNull(typeParser58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeParser63);
        org.junit.Assert.assertNotNull(typeModifierArray65);
        org.junit.Assert.assertArrayEquals(typeModifierArray65, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory69);
        org.junit.Assert.assertNotNull(typeParser72);
        org.junit.Assert.assertNotNull(typeModifierArray73);
        org.junit.Assert.assertArrayEquals(typeModifierArray73, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory76);
        org.junit.Assert.assertNotNull(typeParser79);
        org.junit.Assert.assertNotNull(typeModifierArray81);
        org.junit.Assert.assertArrayEquals(typeModifierArray81, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory22._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray24 = typeFactory22._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(typeModifierArray24);
        org.junit.Assert.assertArrayEquals(typeModifierArray24, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        typeFactory4._cachedArrayListType = hierarchicType5;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray8);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray14);
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType18 = null;
        typeFactory17._cachedArrayListType = hierarchicType18;
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = typeFactory17._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier21 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser20, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray22);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap27 = typeFactory26._typeCache;
        java.lang.Class<?> wildcardClass28 = typeFactory26.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory0._constructType((java.lang.reflect.Type) wildcardClass28, typeBindings29);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray8);
        org.junit.Assert.assertArrayEquals(typeModifierArray8, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeModifierArray14);
        org.junit.Assert.assertArrayEquals(typeModifierArray14, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser20);
        org.junit.Assert.assertNotNull(typeModifierArray22);
        org.junit.Assert.assertArrayEquals(typeModifierArray22, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(javaType30);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedHashMapType;
        java.lang.Class<?> wildcardClass2 = null; // flaky "21) test282(com.fasterxml.jackson.databind.type.RegressionTest0)": hierarchicType1.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
// flaky "3) test282(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType1);
// flaky "3) test282(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory22.withModifier(typeModifier23);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory24);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap8 = typeFactory7._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory7._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(classKeyLRUMap8);
        org.junit.Assert.assertNull(typeModifierArray9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withModifier(typeModifier7);
        java.lang.reflect.GenericArrayType genericArrayType9 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory0._fromArrayType(genericArrayType9, typeBindings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory6.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = null;
        typeFactory8._cachedArrayListType = hierarchicType9;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory14._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory16._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory16._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(javaType18);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier31 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType37 = null;
        typeFactory36._cachedArrayListType = hierarchicType37;
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeFactory36._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray40 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray40);
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType44 = null;
        typeFactory43._cachedArrayListType = hierarchicType44;
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory43._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray48 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier47 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser42, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray48);
        com.fasterxml.jackson.databind.JavaType javaType54 = typeFactory53._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray32);
        org.junit.Assert.assertArrayEquals(typeModifierArray32, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeModifierArray40);
        org.junit.Assert.assertArrayEquals(typeModifierArray40, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeModifierArray48);
        org.junit.Assert.assertArrayEquals(typeModifierArray48, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType54);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        typeFactory31.clearCache();
        typeFactory31.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory31._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory31.withModifier(typeModifier35);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType37 = typeFactory36._cachedArrayListType;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory36._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(hierarchicType37);
        org.junit.Assert.assertNotNull(javaType38);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory5._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(hierarchicType6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType31 = null;
        typeFactory30._cachedArrayListType = hierarchicType31;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = typeFactory38._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap43 = typeFactory42._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap43);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        typeFactory0.clearCache();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(typeParser4);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap6 = typeFactory5._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(classKeyLRUMap6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        java.lang.Class<?> wildcardClass16 = typeFactory15.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory18._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap20 = typeFactory18._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = typeFactory18._modifiers;
        typeFactory18.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(classKeyLRUMap20);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        java.lang.reflect.ParameterizedType parameterizedType2 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._fromParamType(parameterizedType2, typeBindings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        java.lang.Class<?> wildcardClass13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeParser7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = null;
        typeFactory2._cachedArrayListType = hierarchicType3;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withModifier(typeModifier11);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory6._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory8._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = typeFactory8._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory8._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNull(hierarchicType11);
        org.junit.Assert.assertNull(hierarchicType12);
        org.junit.Assert.assertNull(hierarchicType13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap10 = typeFactory8._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap11 = typeFactory8._typeCache;
        java.lang.reflect.GenericArrayType genericArrayType12 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory8._fromArrayType(genericArrayType12, typeBindings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNotNull(classKeyLRUMap10);
        org.junit.Assert.assertNotNull(classKeyLRUMap11);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5);
        java.lang.reflect.GenericArrayType genericArrayType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6._fromArrayType(genericArrayType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory0.withModifier(typeModifier14);
        java.lang.Class<?> wildcardClass16 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType10 = null;
        typeFactory9._cachedArrayListType = hierarchicType10;
        typeFactory9.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory9._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType15 = null;
        typeFactory14._cachedArrayListType = hierarchicType15;
        typeFactory14.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType20 = null;
        typeFactory19._cachedArrayListType = hierarchicType20;
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser23 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType26 = null;
        typeFactory25._cachedArrayListType = hierarchicType26;
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser23, typeModifierArray30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType37 = null;
        typeFactory36._cachedArrayListType = hierarchicType37;
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeFactory36._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser40 = typeFactory36._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType43 = null;
        typeFactory42._cachedArrayListType = hierarchicType43;
        com.fasterxml.jackson.databind.type.TypeParser typeParser45 = typeFactory42._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier46 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray47 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier46 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser45, typeModifierArray47);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser41, typeModifierArray47);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser40, typeModifierArray47);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray47);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser8, typeModifierArray47);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType53 = typeFactory52._cachedArrayListType;
        typeFactory52.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory52._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNull(hierarchicType7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeParser23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeParser40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeParser45);
        org.junit.Assert.assertNotNull(typeModifierArray47);
        org.junit.Assert.assertArrayEquals(typeModifierArray47, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType53);
        org.junit.Assert.assertNotNull(javaType55);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory0.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory12._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory12._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory12.withModifier(typeModifier15);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(hierarchicType13);
        org.junit.Assert.assertNull(hierarchicType14);
        org.junit.Assert.assertNotNull(typeFactory16);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = null;
        typeFactory27._cachedArrayListType = hierarchicType28;
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier31 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser30, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray32);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType37 = typeFactory36._cachedHashMapType;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory36._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap39 = typeFactory36._typeCache;
        java.lang.Class<?> wildcardClass40 = typeFactory36.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser30);
        org.junit.Assert.assertNotNull(typeModifierArray32);
        org.junit.Assert.assertArrayEquals(typeModifierArray32, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType37);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(classKeyLRUMap39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
// flaky "22) test309(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap10 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(classKeyLRUMap10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._unknownType();
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
// flaky "23) test311(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType6);
        org.junit.Assert.assertNotNull(javaType7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        typeFactory15.clearCache();
        java.lang.reflect.ParameterizedType parameterizedType21 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory15._fromParamType(parameterizedType21, typeBindings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedHashMapType;
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
// flaky "24) test313(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory15.withModifier(typeModifier21);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = typeFactory15._cachedArrayListType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory15.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNull(hierarchicType23);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = typeFactory27._cachedArrayListType;
        typeFactory27.clearCache();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory31._constructType((java.lang.reflect.Type) simpleType32, typeBindings33);
        com.fasterxml.jackson.databind.JavaType javaType35 = typeFactory30.constructType((java.lang.reflect.Type) javaType34);
        java.lang.Class<?> wildcardClass36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType35);
        com.fasterxml.jackson.databind.type.ArrayType arrayType37 = typeFactory27.constructArrayType(javaType35);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType38 = typeFactory27._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(hierarchicType28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(simpleType32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(arrayType37);
        org.junit.Assert.assertNull(hierarchicType38);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory27.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory5._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
// flaky "25) test317(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withModifier(typeModifier9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        typeFactory31.clearCache();
        typeFactory31.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory31._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory31.withModifier(typeModifier35);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory31.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(typeFactory36);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        java.lang.reflect.ParameterizedType parameterizedType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory7._fromParamType(parameterizedType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._constructType((java.lang.reflect.Type) simpleType6, typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4.constructType((java.lang.reflect.Type) javaType8);
        java.lang.Class<?> wildcardClass10 = javaType9.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._constructType((java.lang.reflect.Type) javaType9, typeBindings11);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory0.withModifier(typeModifier14);
        typeFactory15.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        typeFactory0.clearCache();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        java.lang.reflect.GenericArrayType genericArrayType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5._fromArrayType(genericArrayType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(typeFactory5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = typeFactory6._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory6._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory6._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(hierarchicType7);
        org.junit.Assert.assertNull(typeModifierArray8);
        org.junit.Assert.assertNull(hierarchicType9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap1 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType3 = typeFactory0._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(classKeyLRUMap1);
        org.junit.Assert.assertNull(typeModifierArray2);
        org.junit.Assert.assertNull(hierarchicType3);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory5._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap7 = typeFactory5._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(classKeyLRUMap7);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap10 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(classKeyLRUMap10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory22._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap24 = typeFactory22._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(classKeyLRUMap24);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        typeFactory15.clearCache();
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory15.constructType((java.lang.reflect.Type) simpleType21, typeBindings22);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = typeFactory15._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNull(hierarchicType24);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = null;
        typeFactory8._cachedArrayListType = hierarchicType9;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory14._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory16._unknownType();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType18 = typeFactory16._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNull(hierarchicType18);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory8._cachedHashMapType;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap10 = typeFactory8._typeCache;
        java.lang.reflect.WildcardType wildcardType11 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory8._fromWildcard(wildcardType11, typeBindings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType9);
        org.junit.Assert.assertNotNull(classKeyLRUMap10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        typeFactory31.clearCache();
        typeFactory31.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType34 = typeFactory31._cachedHashMapType;
        typeFactory31.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType34);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        java.lang.reflect.ParameterizedType parameterizedType9 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8._fromParamType(parameterizedType9, typeBindings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        typeFactory13._cachedArrayListType = hierarchicType14;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier17 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser16, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser12, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = null;
        typeFactory23._cachedArrayListType = hierarchicType24;
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType31 = null;
        typeFactory30._cachedArrayListType = hierarchicType31;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = typeFactory38._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray39);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withModifier(typeModifier43);
        java.lang.reflect.GenericArrayType genericArrayType45 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings46 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType47 = typeFactory44._fromArrayType(genericArrayType45, typeBindings46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeModifierArray18);
        org.junit.Assert.assertArrayEquals(typeModifierArray18, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory44);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = null;
        typeFactory6._cachedArrayListType = hierarchicType7;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = null;
        typeFactory15._cachedArrayListType = hierarchicType16;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = null;
        typeFactory22._cachedArrayListType = hierarchicType23;
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier26 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier26 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray27);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray32);
        typeFactory33.clearCache();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = typeFactory35.withModifier(typeModifier36);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType39 = null;
        typeFactory38._cachedArrayListType = hierarchicType39;
        com.fasterxml.jackson.databind.type.TypeParser typeParser41 = typeFactory38._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory38._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType43 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings45 = null;
        com.fasterxml.jackson.databind.JavaType javaType46 = typeFactory38._resolveVariableViaSubTypes(hierarchicType43, "", typeBindings45);
        com.fasterxml.jackson.databind.type.ArrayType arrayType47 = typeFactory37.constructArrayType(javaType46);
        com.fasterxml.jackson.databind.type.TypeParser typeParser48 = typeFactory37._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType50 = null;
        typeFactory49._cachedArrayListType = hierarchicType50;
        com.fasterxml.jackson.databind.type.TypeParser typeParser52 = typeFactory49._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray53 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser52, typeModifierArray53);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType56 = null;
        typeFactory55._cachedArrayListType = hierarchicType56;
        com.fasterxml.jackson.databind.type.TypeParser typeParser58 = typeFactory55._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray59 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser58, typeModifierArray59);
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType63 = null;
        typeFactory62._cachedArrayListType = hierarchicType63;
        com.fasterxml.jackson.databind.type.TypeParser typeParser65 = typeFactory62._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier66 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray67 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier66 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser65, typeModifierArray67);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser61, typeModifierArray67);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser58, typeModifierArray67);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser52, typeModifierArray67);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray72 = typeFactory71._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray73 = typeFactory71._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser48, typeModifierArray73);
        com.fasterxml.jackson.databind.JavaType javaType75 = typeFactory74._unknownType();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings76 = null;
        com.fasterxml.jackson.databind.JavaType javaType77 = typeFactory33._constructType((java.lang.reflect.Type) javaType75, typeBindings76);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(typeParser41);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(arrayType47);
        org.junit.Assert.assertNotNull(typeParser48);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(typeParser52);
        org.junit.Assert.assertNotNull(typeModifierArray53);
        org.junit.Assert.assertArrayEquals(typeModifierArray53, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeParser58);
        org.junit.Assert.assertNotNull(typeModifierArray59);
        org.junit.Assert.assertArrayEquals(typeModifierArray59, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(typeParser65);
        org.junit.Assert.assertNotNull(typeModifierArray67);
        org.junit.Assert.assertArrayEquals(typeModifierArray67, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray72);
        org.junit.Assert.assertArrayEquals(typeModifierArray72, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray73);
        org.junit.Assert.assertArrayEquals(typeModifierArray73, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType75);
        org.junit.Assert.assertNotNull(javaType77);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory15._unknownType();
        java.lang.Class<?> wildcardClass18 = javaType17.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = typeFactory0._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
// flaky "26) test336(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap5 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(classKeyLRUMap5);
        org.junit.Assert.assertNull(typeModifierArray6);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory3._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory3._resolveVariableViaSubTypes(hierarchicType8, "", typeBindings10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory3._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory0.constructArrayType(javaType12);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNull(hierarchicType2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(typeModifierArray15);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory4._constructType(type5, typeBindings6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNull(hierarchicType2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withModifier(typeModifier9);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = typeFactory10._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(hierarchicType11);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = typeFactory6._cachedHashMapType;
        java.lang.reflect.ParameterizedType parameterizedType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6._fromParamType(parameterizedType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(hierarchicType7);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._resolveVariableViaSubTypes(hierarchicType5, "", typeBindings7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType22 = null;
        typeFactory21._cachedArrayListType = hierarchicType22;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray25);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType28 = typeFactory27._cachedArrayListType;
        typeFactory27.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap30 = typeFactory27._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory27._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(hierarchicType28);
        org.junit.Assert.assertNotNull(classKeyLRUMap30);
        org.junit.Assert.assertNotNull(javaType31);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = typeFactory0._arrayListSuperInterfaceChain(hierarchicType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory15._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory15.withModifier(typeModifier17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType20 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory18._resolveVariableViaSubTypes(hierarchicType20, "", typeBindings22);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(javaType23);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        typeFactory6.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
// flaky "27) test346(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = null;
        typeFactory1._cachedArrayListType = hierarchicType2;
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withModifier(typeModifier17);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1._constructType((java.lang.reflect.Type) simpleType2, typeBindings3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructType((java.lang.reflect.Type) javaType4);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = typeFactory7._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(hierarchicType8);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedHashMapType;
        java.lang.reflect.WildcardType wildcardType2 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._fromWildcard(wildcardType2, typeBindings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
// flaky "28) test349(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType8 = null;
        typeFactory7._cachedArrayListType = hierarchicType8;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray12);
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory15._unknownType();
        java.lang.Class<?> wildcardClass17 = typeFactory15.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray4);
        org.junit.Assert.assertArrayEquals(typeModifierArray4, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory0._modifiers;
        java.lang.reflect.ParameterizedType parameterizedType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._fromParamType(parameterizedType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(typeModifierArray6);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType((java.lang.reflect.Type) simpleType1, typeBindings2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap5 = typeFactory0._typeCache;
        java.lang.reflect.GenericArrayType genericArrayType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._fromArrayType(genericArrayType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(classKeyLRUMap5);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType12 = null;
        typeFactory11._cachedArrayListType = hierarchicType12;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier15 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray16);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory20.withModifier(typeModifier21);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType23 = typeFactory22._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType24 = typeFactory22._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNull(hierarchicType23);
        org.junit.Assert.assertNull(hierarchicType24);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = null;
        typeFactory5._cachedArrayListType = hierarchicType6;
        typeFactory5.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType11 = null;
        typeFactory10._cachedArrayListType = hierarchicType11;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType17 = null;
        typeFactory16._cachedArrayListType = hierarchicType17;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray21);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType27 = null;
        typeFactory26._cachedHashMapType = hierarchicType27;
        typeFactory26.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        typeFactory0._cachedArrayListType = hierarchicType1;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap6 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(classKeyLRUMap6);
        org.junit.Assert.assertNull(typeModifierArray7);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType6 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(hierarchicType6);
        org.junit.Assert.assertNotNull(javaType7);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType7 = typeFactory6._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(classKeyLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(hierarchicType7);
    }
}
