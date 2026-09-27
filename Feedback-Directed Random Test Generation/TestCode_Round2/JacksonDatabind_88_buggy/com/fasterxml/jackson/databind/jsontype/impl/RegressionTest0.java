package com.fasterxml.jackson.databind.jsontype.impl;

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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.databind.DatabindContext databindContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = classNameIdResolver2._typeFromId("", databindContext4);
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
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.databind.DatabindContext databindContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = classNameIdResolver2.typeFromId(databindContext3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2._typeFromId("", databindContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass7 = id6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass6 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", databindContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass6 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass6 = id5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass5 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.Class<?> wildcardClass7 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str6 = classNameIdResolver2.idFromValue((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", databindContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.String" + "'", str6, "java.lang.String");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str6 = classNameIdResolver2.idFromValue((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2._typeFromId("java.lang.String", databindContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.String" + "'", str6, "java.lang.String");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.DatabindContext databindContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        java.lang.Class<?> wildcardClass16 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.databind.DatabindContext databindContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", databindContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2._typeFromId("java.lang.Class", databindContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass9 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.Class<?> wildcardClass12 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2._typeFromId("java.lang.Long", databindContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.databind.DatabindContext databindContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver2._typeFromId("java.lang.String", databindContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2._typeFromId("java.lang.Class", databindContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2._typeFromId("hi!", databindContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2._typeFromId("hi!", databindContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = classNameIdResolver2._typeFromId("java.lang.Byte", databindContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2._typeFromId("", databindContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        classNameIdResolver2.init(javaType6);
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", databindContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2._typeFromId("", databindContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2.typeFromId(databindContext7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2.typeFromId(databindContext9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.databind.DatabindContext databindContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver11._typeFromId("", databindContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2.typeFromId(databindContext7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.databind.DatabindContext databindContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = classNameIdResolver2._typeFromId("java.lang.Double", databindContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2._typeFromId("java.lang.Byte", databindContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass18 = id17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = classNameIdResolver2._typeFromId("", databindContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2.typeFromId(databindContext7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2.typeFromId(databindContext8, "java.lang.String");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        java.lang.Class<?> wildcardClass18 = classNameIdResolver11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        classNameIdResolver2.init(javaType4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + id3 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id3.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str14 = classNameIdResolver2.idFromValue((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.DatabindContext databindContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", databindContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Double" + "'", str14, "java.lang.Double");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass18 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass4 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = classNameIdResolver11.idFromValue(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2.typeFromId(databindContext9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass14 = classNameIdResolver9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass10 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str14 = classNameIdResolver2.idFromValue((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass15 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Double" + "'", str14, "java.lang.Double");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = classNameIdResolver2._typeFromId("java.lang.Short", databindContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2.typeFromId(databindContext9, "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.Class<?> wildcardClass9 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.Class<?> wildcardClass9 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        java.lang.Class<?> wildcardClass10 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        java.lang.Class<?> wildcardClass10 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver9.init(javaType13);
        com.fasterxml.jackson.databind.DatabindContext databindContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver9._typeFromId("java.lang.String", databindContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass10 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = classNameIdResolver2.typeFromId(databindContext4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2._typeFromId("java.lang.Byte", databindContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", databindContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", databindContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.databind.DatabindContext databindContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = classNameIdResolver9.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        java.lang.Class<?> wildcardClass18 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id4 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = classNameIdResolver2._typeFromId("java.lang.Class", databindContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id4 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id4.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str14 = classNameIdResolver2.idFromValue((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.DatabindContext databindContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver2.typeFromId(databindContext15, "java.lang.Class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Double" + "'", str14, "java.lang.Double");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver2.typeFromId(databindContext13, "java.lang.Long");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.Class<?> wildcardClass3 = classNameIdResolver2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2.typeFromId(databindContext10, "java.lang.Class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver2.typeFromId(databindContext17, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = classNameIdResolver2._typeFromId("java.lang.Byte", databindContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        classNameIdResolver2.init(javaType17);
        java.lang.Class<?> wildcardClass19 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        java.lang.String str17 = classNameIdResolver11.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = classNameIdResolver11._typeFromId("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", databindContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.Class<?> wildcardClass12 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", databindContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        java.lang.String str14 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver9._typeFromId("java.lang.Object", databindContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = classNameIdResolver2.typeFromId(databindContext12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        java.lang.String str14 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver9.typeFromId(databindContext15, "class name used as type id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver5 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType3, typeFactory4);
        java.lang.String str7 = classNameIdResolver5.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver5.init(javaType8);
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver5.init(javaType10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        classNameIdResolver5.init(javaType12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = classNameIdResolver2.idFromValue((java.lang.Object) javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Long" + "'", str7, "java.lang.Long");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver11.init(javaType18);
        com.fasterxml.jackson.databind.DatabindContext databindContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType22 = classNameIdResolver11.typeFromId(databindContext20, "java.lang.Double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2._typeFromId("java.lang.Float", databindContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", databindContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = classNameIdResolver11.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id10 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2.typeFromId(databindContext11, "java.lang.Float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver9.init(javaType13);
        com.fasterxml.jackson.databind.DatabindContext databindContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver9._typeFromId("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", databindContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2.typeFromId(databindContext9, "java.lang.String");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str6 = classNameIdResolver2.idFromValue((java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.String" + "'", str6, "java.lang.String");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str14 = classNameIdResolver2.idFromValue((java.lang.Object) 100.0d);
        java.lang.String str15 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Double" + "'", str14, "java.lang.Double");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "class name used as type id" + "'", str15, "class name used as type id");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType18, typeFactory19);
        java.lang.String str21 = classNameIdResolver20.getDescForKnownTypeIds();
        java.lang.String str23 = classNameIdResolver20.idFromValue((java.lang.Object) 10L);
        java.lang.String str24 = classNameIdResolver20.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id25 = classNameIdResolver20.getMechanism();
        java.lang.Class<?> wildcardClass26 = classNameIdResolver20.getClass();
        java.lang.String str27 = classNameIdResolver11.idFromValue((java.lang.Object) classNameIdResolver20);
        java.lang.String str29 = classNameIdResolver20.idFromValue((java.lang.Object) "java.lang.Double");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.Long" + "'", str23, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class name used as type id" + "'", str24, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str27, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.String" + "'", str29, "java.lang.String");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.databind.DatabindContext databindContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver11._typeFromId("java.lang.Class", databindContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = classNameIdResolver2.typeFromId(databindContext21, "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2.typeFromId(databindContext9, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.DatabindContext databindContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2.typeFromId(databindContext6, "java.lang.Float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = classNameIdResolver2.typeFromId(databindContext4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + id3 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id3.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        java.lang.String str11 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class name used as type id" + "'", str11, "class name used as type id");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str6 = classNameIdResolver2.idFromValue((java.lang.Object) "hi!");
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass8 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.String" + "'", str6, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", databindContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver9.init(javaType13);
        com.fasterxml.jackson.databind.DatabindContext databindContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver9.typeFromId(databindContext15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver9.getMechanism();
        java.lang.Class<?> wildcardClass15 = classNameIdResolver9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        java.lang.String str11 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = classNameIdResolver2._typeFromId("", databindContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class name used as type id" + "'", str11, "class name used as type id");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id4 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = classNameIdResolver2.typeFromId(databindContext5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id4 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id4.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        java.lang.String str17 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id21 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = classNameIdResolver2.idFromValue(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        classNameIdResolver2.init(javaType4);
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + id3 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id3.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver2.init(javaType13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id10 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass10 = id9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass9 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver9.init(javaType13);
        com.fasterxml.jackson.databind.DatabindContext databindContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver9._typeFromId("java.lang.Byte", databindContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = classNameIdResolver2._typeFromId("java.lang.Integer", databindContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver2.typeFromId(databindContext13, "class name used as type id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        java.lang.String str18 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class name used as type id" + "'", str18, "class name used as type id");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2._typeFromId("java.lang.Long", databindContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = classNameIdResolver2.idFromValue(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = classNameIdResolver2.idFromValue(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2.typeFromId(databindContext8, "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2.typeFromId(databindContext7, "java.lang.Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        classNameIdResolver2.init(javaType11);
        com.fasterxml.jackson.databind.DatabindContext databindContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver2._typeFromId("java.lang.Integer", databindContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.DatabindContext databindContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2.typeFromId(databindContext6, "java.lang.Byte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id21 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType24 = classNameIdResolver2.typeFromId(databindContext22, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass9 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.databind.DatabindContext databindContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType22 = classNameIdResolver2._typeFromId("java.lang.Class", databindContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver2.typeFromId(databindContext13, "java.lang.Class");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass11 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2.typeFromId(databindContext10, "java.lang.Double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2._typeFromId("java.lang.Double", databindContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = classNameIdResolver9.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        com.fasterxml.jackson.databind.DatabindContext databindContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType25 = classNameIdResolver2._typeFromId("hi!", databindContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass8 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass10 = id9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2._typeFromId("java.lang.Float", databindContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str13 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str4 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class name used as type id" + "'", str4, "class name used as type id");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2._typeFromId("java.lang.Byte", databindContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        classNameIdResolver2.init(javaType15);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        classNameIdResolver2.init(javaType17);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id19 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        classNameIdResolver2.init(javaType20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2._typeFromId("class name used as type id", databindContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass6 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass11 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        classNameIdResolver9.init(javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver9.getMechanism();
        java.lang.Class<?> wildcardClass17 = id16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        classNameIdResolver9.init(javaType14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver9.getMechanism();
        java.lang.Class<?> wildcardClass17 = classNameIdResolver9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2._typeFromId("java.lang.Double", databindContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2.typeFromId(databindContext8, "java.lang.Integer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str21 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType24 = classNameIdResolver2._typeFromId("hi!", databindContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        classNameIdResolver2.init(javaType14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id10 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        classNameIdResolver2.init(javaType11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver9.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver9.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = classNameIdResolver9.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str4 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.DatabindContext databindContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class name used as type id" + "'", str4, "class name used as type id");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver9.getMechanism();
        java.lang.Class<?> wildcardClass15 = id14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = classNameIdResolver2._typeFromId("java.lang.Class", databindContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2.typeFromId(databindContext11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass12 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str21 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str22 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class name used as type id" + "'", str22, "class name used as type id");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = classNameIdResolver2._typeFromId("java.lang.Object", databindContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        java.lang.String str23 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class name used as type id" + "'", str23, "class name used as type id");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = classNameIdResolver2._typeFromId("java.lang.Class", databindContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        java.lang.Class<?> wildcardClass17 = classNameIdResolver11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2._typeFromId("java.lang.Byte", databindContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        classNameIdResolver2.init(javaType15);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        classNameIdResolver2.init(javaType17);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id19 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType22 = classNameIdResolver2.typeFromId(databindContext20, "java.lang.String");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        java.lang.String str17 = classNameIdResolver11.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver11.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver11.init(javaType21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id10 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        classNameIdResolver2.init(javaType11);
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver2.typeFromId(databindContext13, "java.lang.Integer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2.typeFromId(databindContext10, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        classNameIdResolver2.init(javaType15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2.typeFromId(databindContext9, "java.lang.Double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        classNameIdResolver2.init(javaType4);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + id3 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id3.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.databind.DatabindContext databindContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver9._typeFromId("java.lang.Double", databindContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2.typeFromId(databindContext11, "java.lang.Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType11, typeFactory12);
        java.lang.String str15 = classNameIdResolver13.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver13.getMechanism();
        java.lang.String str17 = classNameIdResolver13.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id18 = classNameIdResolver13.getMechanism();
        java.lang.String str19 = classNameIdResolver13.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver13.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id21 = classNameIdResolver13.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        classNameIdResolver13.init(javaType22);
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType24, typeFactory25);
        java.lang.String str27 = classNameIdResolver26.getDescForKnownTypeIds();
        java.lang.String str29 = classNameIdResolver26.idFromValue((java.lang.Object) 10L);
        java.lang.String str30 = classNameIdResolver13.idFromValue((java.lang.Object) classNameIdResolver26);
        java.lang.String str31 = classNameIdResolver2.idFromValue((java.lang.Object) str30);
        java.lang.String str32 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Long" + "'", str15, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class name used as type id" + "'", str19, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "class name used as type id" + "'", str27, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.Long" + "'", str29, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str30, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.String" + "'", str31, "java.lang.String");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class name used as type id" + "'", str32, "class name used as type id");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver11.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver11.init(javaType21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        java.lang.String str23 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str24 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id25 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass26 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class name used as type id" + "'", str23, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class name used as type id" + "'", str24, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str4 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2._typeFromId("java.lang.Float", databindContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class name used as type id" + "'", str4, "class name used as type id");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver11.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver11.getMechanism();
        java.lang.String str21 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str22 = classNameIdResolver11.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class name used as type id" + "'", str22, "class name used as type id");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        classNameIdResolver2.init(javaType15);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        classNameIdResolver2.init(javaType17);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id19 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass21 = id20.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        classNameIdResolver2.init(javaType12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        java.lang.String str17 = classNameIdResolver11.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver11.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = classNameIdResolver11.typeFromId(databindContext21, "class name used as type id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        classNameIdResolver2.init(javaType6);
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2._typeFromId("java.lang.Class", databindContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver2.typeFromId(databindContext17, "java.lang.Integer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        java.lang.String str23 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str24 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType27 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", databindContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class name used as type id" + "'", str23, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class name used as type id" + "'", str24, "class name used as type id");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str11 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class name used as type id" + "'", str11, "class name used as type id");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        classNameIdResolver2.init(javaType17);
        com.fasterxml.jackson.databind.DatabindContext databindContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType21 = classNameIdResolver2.typeFromId(databindContext19, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2.typeFromId(databindContext10, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        java.lang.String str23 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id24 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class name used as type id" + "'", str23, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id24 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id24.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2.typeFromId(databindContext9, "java.lang.Float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver2.getMechanism();
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        java.lang.String str17 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = classNameIdResolver2.typeFromId(databindContext18, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id12 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver2.typeFromId(databindContext13, "java.lang.Double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = classNameIdResolver2.typeFromId(databindContext12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        classNameIdResolver2.init(javaType11);
        java.lang.String str13 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass14 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str21 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver11.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver11.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = classNameIdResolver11.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id10 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2._typeFromId("java.lang.String", databindContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType18, typeFactory19);
        java.lang.String str21 = classNameIdResolver20.getDescForKnownTypeIds();
        java.lang.String str23 = classNameIdResolver20.idFromValue((java.lang.Object) 10L);
        java.lang.String str24 = classNameIdResolver20.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id25 = classNameIdResolver20.getMechanism();
        java.lang.Class<?> wildcardClass26 = classNameIdResolver20.getClass();
        java.lang.String str27 = classNameIdResolver11.idFromValue((java.lang.Object) classNameIdResolver20);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id28 = classNameIdResolver20.getMechanism();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.Long" + "'", str23, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class name used as type id" + "'", str24, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str27, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id28 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id28.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        classNameIdResolver2.init(javaType15);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        classNameIdResolver2.init(javaType17);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id19 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass21 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id19 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id19.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass10 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str14 = classNameIdResolver2.idFromValue((java.lang.Object) 100.0d);
        java.lang.String str15 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Double" + "'", str14, "java.lang.Double");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "class name used as type id" + "'", str15, "class name used as type id");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id23 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id23 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id23.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass11 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        java.lang.String str17 = classNameIdResolver11.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver11.init(javaType18);
        com.fasterxml.jackson.databind.DatabindContext databindContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType22 = classNameIdResolver11.typeFromId(databindContext20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        classNameIdResolver2.init(javaType14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str14 = classNameIdResolver2.idFromValue((java.lang.Object) 100.0d);
        java.lang.String str15 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        java.lang.Class<?> wildcardClass18 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Double" + "'", str14, "java.lang.Double");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "class name used as type id" + "'", str15, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.databind.DatabindContext databindContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver2._typeFromId("java.lang.Long", databindContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        java.lang.String str23 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str24 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType27 = classNameIdResolver2.typeFromId(databindContext25, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class name used as type id" + "'", str23, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class name used as type id" + "'", str24, "class name used as type id");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType18, typeFactory19);
        java.lang.String str21 = classNameIdResolver20.getDescForKnownTypeIds();
        java.lang.String str23 = classNameIdResolver20.idFromValue((java.lang.Object) 10L);
        java.lang.String str24 = classNameIdResolver20.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id25 = classNameIdResolver20.getMechanism();
        java.lang.Class<?> wildcardClass26 = classNameIdResolver20.getClass();
        java.lang.String str27 = classNameIdResolver11.idFromValue((java.lang.Object) classNameIdResolver20);
        java.lang.Class<?> wildcardClass28 = classNameIdResolver11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.Long" + "'", str23, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class name used as type id" + "'", str24, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str27, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver9.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver9.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver9.init(javaType16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        java.lang.String str11 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = classNameIdResolver2.typeFromId(databindContext12, "java.lang.String");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "class name used as type id" + "'", str11, "class name used as type id");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.databind.DatabindContext databindContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType22 = classNameIdResolver2._typeFromId("java.lang.String", databindContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        classNameIdResolver2.init(javaType4);
        com.fasterxml.jackson.databind.DatabindContext databindContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = classNameIdResolver2._typeFromId("", databindContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + id3 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id3.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        classNameIdResolver2.init(javaType6);
        java.lang.Class<?> wildcardClass8 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType11, typeFactory12);
        java.lang.String str15 = classNameIdResolver13.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver13.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver13.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id18 = classNameIdResolver13.getMechanism();
        java.lang.String str19 = classNameIdResolver2.idFromValue((java.lang.Object) id18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Long" + "'", str15, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.fasterxml.jackson.annotation.JsonTypeInfo$Id" + "'", str19, "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id4 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id4 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id4.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2._typeFromId("java.lang.Byte", databindContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType12, typeFactory13);
        java.lang.String str16 = classNameIdResolver14.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver14.getMechanism();
        java.lang.String str18 = classNameIdResolver14.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        classNameIdResolver14.init(javaType19);
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType21, typeFactory22);
        java.lang.String str25 = classNameIdResolver23.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id26 = classNameIdResolver23.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id27 = classNameIdResolver23.getMechanism();
        java.lang.String str28 = classNameIdResolver14.idFromValue((java.lang.Object) classNameIdResolver23);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id29 = classNameIdResolver14.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        classNameIdResolver14.init(javaType30);
        java.lang.String str32 = classNameIdResolver14.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id33 = classNameIdResolver14.getMechanism();
        java.lang.String str34 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver14);
        java.lang.String str35 = classNameIdResolver14.getDescForKnownTypeIds();
        java.lang.String str36 = classNameIdResolver14.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Long" + "'", str16, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class name used as type id" + "'", str18, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.Long" + "'", str25, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id26 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id26.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id27 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id27.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str28, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id29 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id29.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class name used as type id" + "'", str32, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id33 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id33.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str34, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "class name used as type id" + "'", str35, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "class name used as type id" + "'", str36, "class name used as type id");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = classNameIdResolver2.typeFromId(databindContext21, "java.lang.Integer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver11.typeFromId(databindContext17, "class name used as type id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType12, typeFactory13);
        java.lang.String str16 = classNameIdResolver14.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver14.getMechanism();
        java.lang.String str18 = classNameIdResolver14.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        classNameIdResolver14.init(javaType19);
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType21, typeFactory22);
        java.lang.String str25 = classNameIdResolver23.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id26 = classNameIdResolver23.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id27 = classNameIdResolver23.getMechanism();
        java.lang.String str28 = classNameIdResolver14.idFromValue((java.lang.Object) classNameIdResolver23);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id29 = classNameIdResolver14.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        classNameIdResolver14.init(javaType30);
        java.lang.String str32 = classNameIdResolver14.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id33 = classNameIdResolver14.getMechanism();
        java.lang.String str34 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver14);
        java.lang.Class<?> wildcardClass35 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Long" + "'", str16, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class name used as type id" + "'", str18, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.Long" + "'", str25, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id26 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id26.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id27 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id27.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str28, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id29 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id29.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class name used as type id" + "'", str32, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id33 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id33.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str34, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType11, typeFactory12);
        java.lang.String str15 = classNameIdResolver13.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver13.getMechanism();
        java.lang.String str17 = classNameIdResolver13.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id18 = classNameIdResolver13.getMechanism();
        java.lang.String str19 = classNameIdResolver13.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver13.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id21 = classNameIdResolver13.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        classNameIdResolver13.init(javaType22);
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType24, typeFactory25);
        java.lang.String str27 = classNameIdResolver26.getDescForKnownTypeIds();
        java.lang.String str29 = classNameIdResolver26.idFromValue((java.lang.Object) 10L);
        java.lang.String str30 = classNameIdResolver13.idFromValue((java.lang.Object) classNameIdResolver26);
        java.lang.String str31 = classNameIdResolver2.idFromValue((java.lang.Object) str30);
        java.lang.Class<?> wildcardClass32 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Long" + "'", str15, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id18 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id18.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class name used as type id" + "'", str19, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "class name used as type id" + "'", str27, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.Long" + "'", str29, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str30, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.String" + "'", str31, "java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        java.lang.String str18 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType21 = classNameIdResolver2.typeFromId(databindContext19, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class name used as type id" + "'", str18, "class name used as type id");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        java.lang.String str23 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str24 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id25 = classNameIdResolver2.getMechanism();
        java.lang.String str26 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class name used as type id" + "'", str23, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class name used as type id" + "'", str24, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "class name used as type id" + "'", str26, "class name used as type id");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str14 = classNameIdResolver2.idFromValue((java.lang.Object) 100.0d);
        java.lang.String str15 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass16 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Double" + "'", str14, "java.lang.Double");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "class name used as type id" + "'", str15, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = classNameIdResolver2.typeFromId(databindContext12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id21 = classNameIdResolver2.getMechanism();
        java.lang.String str22 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str23 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class name used as type id" + "'", str22, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class name used as type id" + "'", str23, "class name used as type id");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id12 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = classNameIdResolver2.typeFromId(databindContext14, "java.lang.Long");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = classNameIdResolver2.typeFromId(databindContext4, "java.lang.Float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + id3 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id3.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = classNameIdResolver2.idFromValue(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        classNameIdResolver2.init(javaType6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver9.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        classNameIdResolver9.init(javaType15);
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver9.typeFromId(databindContext17, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id12 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver2.init(javaType13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.databind.DatabindContext databindContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = classNameIdResolver2._typeFromId("class name used as type id", databindContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        classNameIdResolver2.init(javaType11);
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver2.typeFromId(databindContext13, "java.lang.Float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.DatabindContext databindContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = classNameIdResolver2._typeFromId("", databindContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass8 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id4 = classNameIdResolver2.getMechanism();
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id4 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id4.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        classNameIdResolver2.init(javaType21);
        java.lang.String str23 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str24 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id25 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        classNameIdResolver2.init(javaType26);
        com.fasterxml.jackson.databind.DatabindContext databindContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType30 = classNameIdResolver2._typeFromId("java.lang.Short", databindContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class name used as type id" + "'", str23, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class name used as type id" + "'", str24, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id25 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id25.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver9.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        classNameIdResolver9.init(javaType14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        classNameIdResolver2.init(javaType14);
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = classNameIdResolver2._typeFromId("java.lang.String", databindContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        classNameIdResolver2.init(javaType11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str6 = classNameIdResolver2.idFromValue((java.lang.Object) "hi!");
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.String" + "'", str6, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str4 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class name used as type id" + "'", str4, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = classNameIdResolver2.typeFromId(databindContext10, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2.typeFromId(databindContext9, "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType12, typeFactory13);
        java.lang.String str16 = classNameIdResolver14.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver14.getMechanism();
        java.lang.String str18 = classNameIdResolver14.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        classNameIdResolver14.init(javaType19);
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType21, typeFactory22);
        java.lang.String str25 = classNameIdResolver23.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id26 = classNameIdResolver23.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id27 = classNameIdResolver23.getMechanism();
        java.lang.String str28 = classNameIdResolver14.idFromValue((java.lang.Object) classNameIdResolver23);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id29 = classNameIdResolver14.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        classNameIdResolver14.init(javaType30);
        java.lang.String str32 = classNameIdResolver14.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id33 = classNameIdResolver14.getMechanism();
        java.lang.String str34 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver14);
        com.fasterxml.jackson.databind.DatabindContext databindContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType37 = classNameIdResolver14.typeFromId(databindContext35, "java.lang.Long");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Long" + "'", str16, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class name used as type id" + "'", str18, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.Long" + "'", str25, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id26 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id26.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id27 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id27.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str28, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id29 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id29.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class name used as type id" + "'", str32, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id33 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id33.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str34, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str4 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class name used as type id" + "'", str4, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class name used as type id" + "'", str5, "class name used as type id");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        classNameIdResolver2.init(javaType20);
        java.lang.Class<?> wildcardClass22 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        java.lang.String str17 = classNameIdResolver11.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = classNameIdResolver11.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str8 = classNameIdResolver2.idFromValue((java.lang.Object) 10.0f);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Float" + "'", str8, "java.lang.Float");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id21 = classNameIdResolver2.getMechanism();
        java.lang.String str22 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id21 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id21.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class name used as type id" + "'", str22, "class name used as type id");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str4 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class name used as type id" + "'", str4, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        classNameIdResolver2.init(javaType11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = classNameIdResolver2.typeFromId(databindContext21, "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver2.init(javaType13);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass16 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType12, typeFactory13);
        java.lang.String str16 = classNameIdResolver14.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver14.getMechanism();
        java.lang.String str18 = classNameIdResolver14.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        classNameIdResolver14.init(javaType19);
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver23 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType21, typeFactory22);
        java.lang.String str25 = classNameIdResolver23.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id26 = classNameIdResolver23.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id27 = classNameIdResolver23.getMechanism();
        java.lang.String str28 = classNameIdResolver14.idFromValue((java.lang.Object) classNameIdResolver23);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id29 = classNameIdResolver14.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        classNameIdResolver14.init(javaType30);
        java.lang.String str32 = classNameIdResolver14.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id33 = classNameIdResolver14.getMechanism();
        java.lang.String str34 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver14);
        java.lang.String str35 = classNameIdResolver14.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = classNameIdResolver14.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Long" + "'", str16, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class name used as type id" + "'", str18, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.Long" + "'", str25, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id26 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id26.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id27 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id27.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str28, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id29 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id29.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "class name used as type id" + "'", str32, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id33 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id33.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str34, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "class name used as type id" + "'", str35, "class name used as type id");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        classNameIdResolver2.init(javaType9);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass12 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType15, typeFactory16);
        java.lang.String str19 = classNameIdResolver17.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver17.getMechanism();
        java.lang.String str21 = classNameIdResolver17.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        classNameIdResolver17.init(javaType22);
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType24, typeFactory25);
        java.lang.String str28 = classNameIdResolver26.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id29 = classNameIdResolver26.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id30 = classNameIdResolver26.getMechanism();
        java.lang.String str31 = classNameIdResolver17.idFromValue((java.lang.Object) classNameIdResolver26);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id32 = classNameIdResolver17.getMechanism();
        java.lang.String str33 = classNameIdResolver17.getDescForKnownTypeIds();
        java.lang.String str34 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver17);
        com.fasterxml.jackson.databind.DatabindContext databindContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType37 = classNameIdResolver17._typeFromId("java.lang.Object", databindContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.Long" + "'", str19, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.Long" + "'", str28, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id29 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id29.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id30 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id30.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str31, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id32 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id32.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "class name used as type id" + "'", str33, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str34, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str3 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str5 = classNameIdResolver2.idFromValue((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType6, typeFactory7);
        java.lang.String str9 = classNameIdResolver8.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id10 = classNameIdResolver8.getMechanism();
        java.lang.Class<?> wildcardClass11 = classNameIdResolver8.getClass();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver8);
        com.fasterxml.jackson.databind.DatabindContext databindContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = classNameIdResolver8.typeFromId(databindContext13, "java.lang.Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class name used as type id" + "'", str3, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Long" + "'", str5, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = classNameIdResolver2.typeFromId(databindContext11, "java.lang.String");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str6 = classNameIdResolver2.idFromValue((java.lang.Object) "hi!");
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.String" + "'", str6, "java.lang.String");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        classNameIdResolver2.init(javaType14);
        java.lang.String str16 = classNameIdResolver2.getDescForKnownTypeIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "class name used as type id" + "'", str16, "class name used as type id");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id12 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id13 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = classNameIdResolver2.typeFromId(databindContext14, "class name used as type id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id12 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id12.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id13 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id13.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = classNameIdResolver2._typeFromId("java.lang.Integer", databindContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + id3 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id3.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        classNameIdResolver2.init(javaType8);
        java.lang.String str10 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass11 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        java.lang.String str7 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str8 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = classNameIdResolver2._typeFromId("java.lang.Double", databindContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class name used as type id" + "'", str7, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class name used as type id" + "'", str8, "class name used as type id");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        classNameIdResolver2.init(javaType14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        classNameIdResolver2.init(javaType16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = classNameIdResolver11.typeFromId(databindContext18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id20 = classNameIdResolver2.getMechanism();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id20 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id20.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id8 = classNameIdResolver2.getMechanism();
        java.lang.String str9 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id10 = classNameIdResolver2.getMechanism();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id6 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id6.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id8 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id8.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class name used as type id" + "'", str9, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id10 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id10.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        java.lang.String str6 = classNameIdResolver2.idFromValue((java.lang.Object) "hi!");
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id7 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = classNameIdResolver2._typeFromId("java.lang.Float", databindContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.String" + "'", str6, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id7 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id7.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver9.getDescForKnownTypeIds();
        java.lang.String str14 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = classNameIdResolver9._typeFromId("java.lang.Byte", databindContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id14 = classNameIdResolver11.getMechanism();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id15 = classNameIdResolver11.getMechanism();
        java.lang.String str16 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver11);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id17 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        classNameIdResolver2.init(javaType18);
        java.lang.String str20 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.String str21 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id22 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.DatabindContext databindContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType25 = classNameIdResolver2._typeFromId("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", databindContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id14 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id14.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertTrue("'" + id15 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id15.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str16, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertTrue("'" + id17 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id17.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class name used as type id" + "'", str20, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class name used as type id" + "'", str21, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id22 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id22.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        classNameIdResolver2.init(javaType5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id9 = classNameIdResolver2.getMechanism();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        classNameIdResolver2.init(javaType10);
        java.lang.String str12 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver2.init(javaType13);
        java.lang.String str15 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.DatabindContext databindContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType18 = classNameIdResolver2._typeFromId("class name used as type id", databindContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id9 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id9.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class name used as type id" + "'", str12, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "class name used as type id" + "'", str15, "class name used as type id");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver2.getMechanism();
        java.lang.String str17 = classNameIdResolver2.getDescForKnownTypeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = classNameIdResolver2.idFromBaseType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class name used as type id" + "'", str17, "class name used as type id");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        java.lang.String str13 = classNameIdResolver2.getDescForKnownTypeIds();
        java.lang.Class<?> wildcardClass14 = classNameIdResolver2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class name used as type id" + "'", str13, "class name used as type id");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        classNameIdResolver2.init(javaType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType9, typeFactory10);
        java.lang.String str13 = classNameIdResolver11.idFromValue((java.lang.Object) 1L);
        java.lang.String str14 = classNameIdResolver11.getDescForKnownTypeIds();
        java.lang.String str15 = classNameIdResolver2.idFromValue((java.lang.Object) str14);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id16 = classNameIdResolver2.getMechanism();
        java.lang.Class<?> wildcardClass17 = id16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Long" + "'", str13, "java.lang.Long");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class name used as type id" + "'", str14, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.String" + "'", str15, "java.lang.String");
        org.junit.Assert.assertTrue("'" + id16 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id16.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType0, typeFactory1);
        java.lang.String str4 = classNameIdResolver2.idFromValue((java.lang.Object) 1L);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = classNameIdResolver2.getMechanism();
        java.lang.String str6 = classNameIdResolver2.getDescForKnownTypeIds();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = null;
        com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver classNameIdResolver9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(javaType7, typeFactory8);
        java.lang.String str10 = classNameIdResolver9.getDescForKnownTypeIds();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id11 = classNameIdResolver9.getMechanism();
        java.lang.String str12 = classNameIdResolver2.idFromValue((java.lang.Object) classNameIdResolver9);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        classNameIdResolver9.init(javaType13);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        classNameIdResolver9.init(javaType15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Long" + "'", str4, "java.lang.Long");
        org.junit.Assert.assertTrue("'" + id5 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id5.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "class name used as type id" + "'", str6, "class name used as type id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "class name used as type id" + "'", str10, "class name used as type id");
        org.junit.Assert.assertTrue("'" + id11 + "' != '" + com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS + "'", id11.equals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver" + "'", str12, "com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver");
    }
}

