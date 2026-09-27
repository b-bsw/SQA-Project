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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        org.junit.Assert.assertNotNull(javaType0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._hashMapSuperInterfaceChain(hierarchicType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap6 = typeFactory5._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(classKeyLRUMap6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1);
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
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
// flaky "1) test09(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1);
        typeFactory0.clearCache();
        java.lang.Class<?> wildcardClass5 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        java.lang.reflect.ParameterizedType parameterizedType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9._fromParamType(parameterizedType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        java.lang.Class<?> wildcardClass6 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass1 = simpleType0.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = typeFactory0._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
// flaky "2) test15(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        java.lang.Class<?> wildcardClass14 = classKeyLRUMap13.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        java.lang.Class<?> wildcardClass3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory13.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory0._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        java.lang.reflect.Type type8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0.constructType(type8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray7);
        java.lang.reflect.GenericArrayType genericArrayType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9._fromArrayType(genericArrayType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory0._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
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
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory12.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        java.lang.reflect.GenericArrayType genericArrayType2 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._fromArrayType(genericArrayType2, typeBindings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray7);
        java.lang.reflect.ParameterizedType parameterizedType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory9._fromParamType(parameterizedType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        java.lang.Class<?> wildcardClass13 = typeModifierArray9.getClass();
        java.lang.Class<?> wildcardClass14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructType((java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier21 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser20, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier27 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray28 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier27 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray28);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory29.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray22);
        org.junit.Assert.assertArrayEquals(typeModifierArray22, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray28);
        org.junit.Assert.assertArrayEquals(typeModifierArray28, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.GenericArrayType genericArrayType4 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._fromArrayType(genericArrayType4, typeBindings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, javaType11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory0._cachedHashMapType;
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
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
// flaky "3) test32(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, javaType11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory0._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory0.withModifier(typeModifier14);
        java.lang.reflect.WildcardType wildcardType16 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory0._fromWildcard(wildcardType16, typeBindings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
// flaky "4) test33(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory9._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap11 = typeFactory9._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory9.withModifier(typeModifier12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory9.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap11);
        org.junit.Assert.assertNotNull(typeFactory13);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = typeFactory0._cachedArrayListType;
        java.lang.Class<?> wildcardClass5 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
// flaky "5) test35(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory9._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap11 = typeFactory9._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory9.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory9._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNull(hierarchicType14);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory9._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap11 = typeFactory9._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory9.withModifier(typeModifier12);
        typeFactory13.clearCache();
        java.lang.reflect.WildcardType wildcardType15 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory13._fromWildcard(wildcardType15, typeBindings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap11);
        org.junit.Assert.assertNotNull(typeFactory13);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory12.withModifier(typeModifier14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory12.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.reflect.Type type1 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._constructType(type1, typeBindings2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory9._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap11 = typeFactory9._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory9.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.ArrayType arrayType15 = typeFactory13.constructArrayType(javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap11);
        org.junit.Assert.assertNotNull(typeFactory13);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory12.withModifier(typeModifier14);
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
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory12._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory12.withModifier(typeModifier14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory15.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory12._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory12.withModifier(typeModifier14);
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
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory9._parser;
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(typeParser10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory13._cachedHashMapType;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory13._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType14);
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType1 = typeFactory0._cachedArrayListType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedArrayListType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = hierarchicType2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(hierarchicType1);
        org.junit.Assert.assertNull(hierarchicType2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory12.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType16 = typeFactory12._cachedHashMapType;
        java.lang.reflect.GenericArrayType genericArrayType17 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory12._fromArrayType(genericArrayType17, typeBindings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(hierarchicType16);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory12._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory12._cachedHashMapType;
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
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType13);
        org.junit.Assert.assertNull(hierarchicType14);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray8);
        typeFactory9.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory12.withModifier(typeModifier14);
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
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap8 = typeFactory7._typeCache;
        java.lang.Class<?> wildcardClass9 = typeFactory7.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory0._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(typeModifierArray8);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory12._unknownType();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory12._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNull(hierarchicType14);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        java.lang.Class<?> wildcardClass10 = typeFactory9.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory12._unknownType();
        java.lang.Class<?> wildcardClass14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap14 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory12.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(classKeyLRUMap14);
        org.junit.Assert.assertNotNull(typeParser15);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        java.lang.reflect.GenericArrayType genericArrayType14 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory13._fromArrayType(genericArrayType14, typeBindings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
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
        org.junit.Assert.assertNotNull(typeParser1);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory0._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withModifier(typeModifier9);
        java.lang.reflect.WildcardType wildcardType11 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory0._fromWildcard(wildcardType11, typeBindings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, javaType11);
        java.lang.Class<?> wildcardClass13 = javaType12.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType5 = typeFactory0._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(javaType4);
// flaky "6) test65(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType5);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory12._unknownType();
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
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType13);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap7 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap8 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(classKeyLRUMap7);
        org.junit.Assert.assertNotNull(classKeyLRUMap8);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) simpleType1);
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, javaType11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory0._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
// flaky "7) test69(com.fasterxml.jackson.databind.type.RegressionTest0)":         org.junit.Assert.assertNotNull(hierarchicType13);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        java.lang.Class<?> wildcardClass2 = simpleType0.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory12._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory12._cachedHashMapType;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap15 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap16 = typeFactory12._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType13);
        org.junit.Assert.assertNull(hierarchicType14);
        org.junit.Assert.assertNotNull(classKeyLRUMap15);
        org.junit.Assert.assertNotNull(classKeyLRUMap16);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap13 = typeFactory12._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory12._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap13);
        org.junit.Assert.assertNotNull(typeParser14);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory0._cachedArrayListType = hierarchicType4;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser7);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType2 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType2);
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory1.constructType((java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6.constructType((java.lang.reflect.Type) wildcardClass8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray12);
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(simpleType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap8 = typeFactory7._typeCache;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType9 = typeFactory7._cachedArrayListType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap8);
        org.junit.Assert.assertNull(hierarchicType9);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory9._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap11 = typeFactory9._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory9.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory13._resolveVariableViaSubTypes(hierarchicType14, "", typeBindings16);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(javaType17);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, javaType11);
        java.lang.Class<?> wildcardClass13 = typeFactory0.getClass();
        java.lang.Class<?> wildcardClass14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructType((java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier21 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser20, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType29);
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory28.constructType((java.lang.reflect.Type) wildcardClass30);
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory28._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier40 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray41);
        java.lang.reflect.WildcardType wildcardType44 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings45 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType46 = typeFactory43._fromWildcard(wildcardType44, typeBindings45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray22);
        org.junit.Assert.assertArrayEquals(typeModifierArray22, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(simpleType29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory12._unknownType();
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory12._cachedHashMapType;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNull(hierarchicType14);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, javaType11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory0.withModifier(typeModifier13);
        typeFactory14.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory13._cachedHashMapType;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory13._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory13._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeParser16);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructType((java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier21 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser20, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withModifier(typeModifier27);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = typeFactory28.withModifier(typeModifier29);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray22);
        org.junit.Assert.assertArrayEquals(typeModifierArray22, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory30);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory9._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory9._unknownType();
        java.lang.reflect.ParameterizedType parameterizedType12 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory9._fromParamType(parameterizedType12, typeBindings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType11);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6);
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap8 = typeFactory7._typeCache;
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
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap8);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(javaType2);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier10 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray11);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType14 = typeFactory13._cachedHashMapType;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType15 = typeFactory13._cachedHashMapType;
        java.lang.reflect.WildcardType wildcardType16 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory13._fromWildcard(wildcardType16, typeBindings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType14);
        org.junit.Assert.assertNull(hierarchicType15);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructType((java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier21 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser20, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType29 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType29);
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory28.constructType((java.lang.reflect.Type) wildcardClass30);
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory28._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier34 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray35 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier34 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray35);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier40 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray41);
        java.lang.Class<?> wildcardClass44 = typeModifierArray41.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray22);
        org.junit.Assert.assertArrayEquals(typeModifierArray22, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(simpleType29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeModifierArray35);
        org.junit.Assert.assertArrayEquals(typeModifierArray35, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray1 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType2 = typeFactory0._cachedArrayListType;
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
        org.junit.Assert.assertNull(typeModifierArray1);
        org.junit.Assert.assertNull(hierarchicType2);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory8.constructType((java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, javaType11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory0.withModifier(typeModifier13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory15.constructType((java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier21 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser20, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray22);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray27 = typeFactory26._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray22);
        org.junit.Assert.assertArrayEquals(typeModifierArray22, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray27);
        org.junit.Assert.assertArrayEquals(typeModifierArray27, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType4 = null;
        typeFactory0._cachedArrayListType = hierarchicType4;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withModifier(typeModifier9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.ArrayType arrayType12 = typeFactory0.constructArrayType(javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2.constructType((java.lang.reflect.Type) wildcardClass4);
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray9);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser1, typeModifierArray9);
        com.fasterxml.jackson.databind.type.HierarchicType hierarchicType13 = typeFactory12._cachedHashMapType;
        typeFactory12.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory12._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory12._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(hierarchicType13);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructType((java.lang.reflect.Type) wildcardClass2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier6 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser5, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory9._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<com.fasterxml.jackson.databind.type.ClassKey, com.fasterxml.jackson.databind.JavaType> classKeyLRUMap11 = typeFactory9._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory9.withModifier(typeModifier12);
        java.lang.reflect.WildcardType wildcardType14 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory9._fromWildcard(wildcardType14, typeBindings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray7);
        org.junit.Assert.assertArrayEquals(typeModifierArray7, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray10);
        org.junit.Assert.assertArrayEquals(typeModifierArray10, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(classKeyLRUMap11);
        org.junit.Assert.assertNotNull(typeFactory13);
    }
}
