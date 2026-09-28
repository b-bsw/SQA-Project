package com.fasterxml.jackson.databind.ser.std;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        java.lang.Class<?> wildcardClass1 = stdKeySerializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = stdKeySerializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = wildcardJsonSerializer3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Throwable throwable6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = stdKeySerializer7.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = stdKeySerializer7.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = stdKeySerializer7.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            stdKeySerializer0.wrapAndThrow(serializerProvider5, throwable6, (java.lang.Object) stdKeySerializer7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdKeySerializer0.serialize((java.lang.Object) "", jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stdKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) (short) 1);
        boolean boolean5 = stdKeySerializer0.isEmpty((java.lang.Object) (-1L));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stdKeySerializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = wildcardJsonSerializer2.isUnwrappingSerializer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stdKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) (short) 1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stdKeySerializer0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stdKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) (short) 1);
        boolean boolean5 = stdKeySerializer0.isEmpty((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass6 = stdKeySerializer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stdKeySerializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = wildcardJsonSerializer4.getDelegatee();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = stdKeySerializer5.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = stdKeySerializer5.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = stdKeySerializer5.getDelegatee();
        java.lang.Class<?> wildcardClass9 = stdKeySerializer5.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = stdKeySerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.Throwable throwable3 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = stdKeySerializer4.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            stdKeySerializer0.wrapAndThrow(serializerProvider2, throwable3, (java.lang.Object) wildcardJsonSerializer5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stdKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) (short) 1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = stdKeySerializer5.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = stdKeySerializer5.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = stdKeySerializer5.getDelegatee();
        java.lang.Class<?> wildcardClass9 = stdKeySerializer5.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = stdKeySerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) wildcardClass9, true);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = stdKeySerializer12.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = stdKeySerializer12.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = stdKeySerializer12.getDelegatee();
        java.lang.Class<?> wildcardClass16 = stdKeySerializer12.getClass();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdKeySerializer0.serializeWithType((java.lang.Object) stdKeySerializer12, jsonGenerator17, serializerProvider18, typeSerializer19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Type id handling not implemented for type java.lang.Object");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializer stdKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stdKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = stdKeySerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = objJsonSerializer3.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }
}

