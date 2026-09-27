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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_CLASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.wrapAndThrow(serializerProvider2, throwable3, (java.lang.Object) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass4 = stringKeySerializer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serializeWithType((java.lang.Object) (short) 1, jsonGenerator5, serializerProvider6, typeSerializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.wrapAndThrow(serializerProvider2, throwable3, (java.lang.Object) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.wrapAndThrow(serializerProvider2, throwable3, (java.lang.Object) 0.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(serializerProvider4, (java.lang.Object) 0);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = stringKeySerializer7.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = stringKeySerializer10.properties();
        boolean boolean12 = stringKeySerializer7.isEmpty(serializerProvider9, (java.lang.Object) propertyWriterItor11);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serializeWithType((java.lang.Object) propertyWriterItor11, jsonGenerator13, serializerProvider14, typeSerializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = stringKeySerializer3.properties();
        boolean boolean5 = stringKeySerializer0.isEmpty(serializerProvider2, (java.lang.Object) propertyWriterItor4);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.wrapAndThrow(serializerProvider6, throwable7, (java.lang.Object) false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.wrapAndThrow(serializerProvider1, throwable2, (java.lang.Object) false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_CALENDAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(serializerProvider4, (java.lang.Object) 0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) (-1L), jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.String (java.lang.Long and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_ENUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default.TYPE_TO_STRING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj2 = dynamic1.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj2, jsonGenerator3, serializerProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = stringKeySerializer3.properties();
        boolean boolean5 = stringKeySerializer0.isEmpty(serializerProvider2, (java.lang.Object) propertyWriterItor4);
        java.lang.Class<?> wildcardClass6 = stringKeySerializer0.getClass();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Class<?> wildcardClass3 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider3, throwable4, (java.lang.Object) "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        boolean boolean2 = objJsonSerializer0.isEmpty((java.lang.Object) 0.0d);
        boolean boolean3 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objJsonSerializer0.serializeWithType((java.lang.Object) "", jsonGenerator5, serializerProvider6, typeSerializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = stringKeySerializer0.withFilterId((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass6 = wildcardJsonSerializer5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = objJsonSerializer2.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer6.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = objJsonSerializer3.withFilterId((java.lang.Object) objJsonSerializer6);
        boolean boolean11 = objJsonSerializer6.isEmpty((java.lang.Object) 100.0f);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) objJsonSerializer6, jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) (short) 100, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = null;
        dynamic0._dynamicSerializers = propertySerializerMap4;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) (-1.0f), jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        boolean boolean5 = stringKeySerializer2.isEmpty(serializerProvider3, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean8 = stringKeySerializer2.isEmpty(serializerProvider6, (java.lang.Object) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = stringKeySerializer2.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) nameTransformer9, jsonGenerator11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        java.lang.Class<?> wildcardClass2 = stringKeySerializer0.getClass();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(serializerProvider4, (java.lang.Object) 0);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = null;
        dynamic0._dynamicSerializers = propertySerializerMap4;
        java.lang.Class<?> wildcardClass6 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = stringKeySerializer5.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = stringKeySerializer8.properties();
        boolean boolean10 = stringKeySerializer5.isEmpty(serializerProvider7, (java.lang.Object) propertyWriterItor9);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serializeWithType((java.lang.Object) propertyWriterItor9, jsonGenerator11, serializerProvider12, typeSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = dynamic5.properties();
        java.lang.Object obj7 = dynamic5.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic5, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) stringKeySerializer1, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(serializerProvider4, (java.lang.Object) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = stringKeySerializer0.unwrappingSerializer(nameTransformer7);
        boolean boolean9 = stringKeySerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass5 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic4._dynamicSerializers;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) propertySerializerMap6, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj4 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass6 = dynamic5.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic5._dynamicSerializers;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) propertySerializerMap7, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider4, throwable5, (java.lang.Object) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        boolean boolean2 = objJsonSerializer0.isEmpty((java.lang.Object) 0.0d);
        boolean boolean3 = objJsonSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer0.properties();
        java.lang.Class<?> wildcardClass5 = objJsonSerializer0.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj6 = dynamic5.readResolve();
        java.lang.Class<java.lang.Object> objClass7 = dynamic5.handledType();
        boolean boolean8 = dynamic5.isUnwrappingSerializer();
        java.lang.Object obj9 = dynamic5.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic5, jsonGenerator10, serializerProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.Throwable throwable5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = stringKeySerializer6.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = stringKeySerializer9.properties();
        boolean boolean11 = stringKeySerializer6.isEmpty(serializerProvider8, (java.lang.Object) propertyWriterItor10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = objJsonSerializer15.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = objJsonSerializer12.withFilterId((java.lang.Object) objJsonSerializer15);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = objJsonSerializer15.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = stringKeySerializer6.withFilterId((java.lang.Object) propertyWriterItor19);
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider4, throwable5, (java.lang.Object) wildcardJsonSerializer20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj4 = dynamic3.readResolve();
        java.lang.Object obj5 = dynamic3.readResolve();
        java.lang.Object obj6 = dynamic3.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj6, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        boolean boolean7 = stringKeySerializer0.isEmpty((java.lang.Object) objJsonSerializer6);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) 52, jsonGenerator9, serializerProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = dynamic0.unwrappingSerializer(nameTransformer2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = stringKeySerializer0.withFilterId((java.lang.Object) 100.0d);
        boolean boolean6 = wildcardJsonSerializer5.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        boolean boolean7 = objJsonSerializer3.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = stringKeySerializer0.withFilterId((java.lang.Object) 100.0d);
        java.lang.Object obj6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj6, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        boolean boolean7 = stringKeySerializer0.isEmpty(serializerProvider5, (java.lang.Object) 100.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.Throwable throwable9 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean11 = dynamic10.usesObjectId();
        java.lang.Object obj12 = dynamic10.readResolve();
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.wrapAndThrow(serializerProvider8, throwable9, (java.lang.Object) dynamic10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean3 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        java.lang.Class<?> wildcardClass5 = dynamic2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = dynamic0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        boolean boolean7 = stringKeySerializer0.isEmpty(serializerProvider5, (java.lang.Object) 100.0f);
        java.lang.Class<java.lang.Object> objClass8 = stringKeySerializer0.handledType();
        boolean boolean9 = stringKeySerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = stringKeySerializer3.properties();
        boolean boolean5 = stringKeySerializer0.isEmpty(serializerProvider2, (java.lang.Object) propertyWriterItor4);
        boolean boolean6 = stringKeySerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        boolean boolean4 = objJsonSerializer2.isEmpty((java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = dynamic0.withFilterId((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = dynamic6.isEmpty(serializerProvider8, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean13 = dynamic12.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic12.handledType();
        java.lang.Class<?> wildcardClass15 = dynamic12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic6.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean17 = dynamic0.isEmpty(serializerProvider5, (java.lang.Object) jsonNode16);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        java.lang.Object obj2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj2, jsonGenerator3, serializerProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = dynamic0.properties();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer8.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer5.withFilterId((java.lang.Object) objJsonSerializer8);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) objJsonSerializer5, jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        boolean boolean7 = stringKeySerializer0.isEmpty(serializerProvider5, (java.lang.Object) 100.0f);
        java.lang.Class<java.lang.Object> objClass8 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass10 = dynamic9.handledType();
        java.lang.Object obj11 = dynamic9.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj11, jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        boolean boolean8 = objJsonSerializer3.isEmpty((java.lang.Object) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = objJsonSerializer9.withFilterId((java.lang.Object) objJsonSerializer12);
        boolean boolean16 = objJsonSerializer3.isEmpty((java.lang.Object) objJsonSerializer9);
        boolean boolean17 = objJsonSerializer9.usesObjectId();
        boolean boolean18 = objJsonSerializer9.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        java.lang.Class<?> wildcardClass5 = stringKeySerializer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = objJsonSerializer4.withFilterId((java.lang.Object) objJsonSerializer7);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = objJsonSerializer7.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = objJsonSerializer7.unwrappingSerializer(nameTransformer12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = dynamic0.replaceDelegatee(objJsonSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = stringKeySerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = objJsonSerializer3.getDelegatee();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Class<?> wildcardClass5 = propertySerializerMap4.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = stringKeySerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = stringKeySerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = dynamic0.properties();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        boolean boolean5 = dynamic0.isEmpty(serializerProvider3, (java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass6 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = stringKeySerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = objJsonSerializer3.usesObjectId();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        java.lang.Object obj6 = new java.lang.Object();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj6, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNull(propertySerializerMap5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(serializerProvider4, (java.lang.Object) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = stringKeySerializer0.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer8.unwrappingSerializer(nameTransformer9);
        boolean boolean11 = objJsonSerializer8.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        boolean boolean8 = objJsonSerializer3.isEmpty((java.lang.Object) 100.0f);
        boolean boolean9 = objJsonSerializer3.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj13 = dynamic12.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = dynamic12.isEmpty(serializerProvider14, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap17 = dynamic12._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap17;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = dynamic0.properties();
        java.lang.Class<?> wildcardClass3 = propertyWriterItor2.getClass();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = dynamic0.properties();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass3 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objClass3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = stringKeySerializer0.withFilterId((java.lang.Object) 100.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean8 = stringKeySerializer0.isEmpty(serializerProvider6, (java.lang.Object) "hi!");
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        java.lang.Throwable throwable10 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = stringKeySerializer11.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = stringKeySerializer14.properties();
        boolean boolean16 = stringKeySerializer11.isEmpty(serializerProvider13, (java.lang.Object) propertyWriterItor15);
        boolean boolean17 = stringKeySerializer11.usesObjectId();
        java.lang.Class<java.lang.Object> objClass18 = stringKeySerializer11.handledType();
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.wrapAndThrow(serializerProvider9, throwable10, (java.lang.Object) objClass18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objClass18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        java.lang.Object obj6 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj3 = dynamic2.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        boolean boolean5 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass6 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic2._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean12 = dynamic11.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass13 = dynamic11.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = dynamic0.getSchema(serializerProvider10, (java.lang.reflect.Type) objClass13, false);
        java.lang.Class<?> wildcardClass16 = jsonNode15.getClass();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objClass13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) 10.0d, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic0.properties();
        java.lang.Object obj5 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        java.lang.Object obj6 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = stringKeySerializer3.properties();
        boolean boolean5 = stringKeySerializer0.isEmpty(serializerProvider2, (java.lang.Object) propertyWriterItor4);
        java.lang.Object obj6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj6, jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = stringKeySerializer3.properties();
        boolean boolean5 = stringKeySerializer0.isEmpty(serializerProvider2, (java.lang.Object) propertyWriterItor4);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer6.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer9);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = objJsonSerializer9.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = stringKeySerializer0.withFilterId((java.lang.Object) propertyWriterItor13);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) objJsonSerializer15, jsonGenerator16, serializerProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass10 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic6._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap11;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) 1.0d, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stringKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.Throwable throwable3 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.wrapAndThrow(serializerProvider2, throwable3, obj4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        java.lang.Object obj5 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = dynamic0.properties();
        java.lang.Object obj3 = dynamic0.readResolve();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        boolean boolean7 = stringKeySerializer0.isEmpty((java.lang.Object) objJsonSerializer6);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = stringKeySerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj12 = dynamic11.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic13 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass14 = dynamic13.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj16 = dynamic15.readResolve();
        java.lang.Class<java.lang.Object> objClass17 = dynamic15.handledType();
        boolean boolean18 = dynamic15.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass19 = dynamic15.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap20 = dynamic15._dynamicSerializers;
        dynamic13._dynamicSerializers = propertySerializerMap20;
        dynamic11._dynamicSerializers = propertySerializerMap20;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic23 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj24 = dynamic23.readResolve();
        java.lang.Object obj25 = dynamic23.readResolve();
        java.lang.Object obj26 = dynamic23.readResolve();
        boolean boolean27 = dynamic11.isEmpty((java.lang.Object) dynamic23);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) boolean27, jsonGenerator28, serializerProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.String (java.lang.Boolean and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objClass19);
        org.junit.Assert.assertNotNull(propertySerializerMap20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        org.junit.Assert.assertNotNull(objClass1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Object obj4 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj3 = dynamic2.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        boolean boolean5 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass6 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic2._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        boolean boolean9 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj10 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass5 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass10 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic6._dynamicSerializers;
        dynamic4._dynamicSerializers = propertySerializerMap11;
        dynamic0._dynamicSerializers = propertySerializerMap11;
        java.lang.Object obj14 = dynamic0.readResolve();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        boolean boolean7 = stringKeySerializer0.isEmpty((java.lang.Object) objJsonSerializer6);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = objJsonSerializer6.properties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass3 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = dynamic0.properties();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean4 = dynamic3.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass5 = dynamic3.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = dynamic3.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic3._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap8;
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertNotNull(objClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean5 = dynamic4.isUnwrappingSerializer();
        java.lang.Object obj6 = dynamic4.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic4.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass9 = dynamic8.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj11 = dynamic10.readResolve();
        java.lang.Class<java.lang.Object> objClass12 = dynamic10.handledType();
        boolean boolean13 = dynamic10.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic10.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap15 = dynamic10._dynamicSerializers;
        dynamic8._dynamicSerializers = propertySerializerMap15;
        dynamic4._dynamicSerializers = propertySerializerMap15;
        boolean boolean18 = dynamic4.isUnwrappingSerializer();
        boolean boolean19 = dynamic0.isEmpty((java.lang.Object) boolean18);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(propertySerializerMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass6 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = stringKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = stringKeySerializer3.properties();
        boolean boolean5 = stringKeySerializer0.isEmpty(serializerProvider2, (java.lang.Object) propertyWriterItor4);
        boolean boolean6 = stringKeySerializer0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass7 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = stringKeySerializer0.unwrappingSerializer(nameTransformer8);
        boolean boolean10 = stringKeySerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj3 = dynamic2.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        boolean boolean5 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass6 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic2._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        boolean boolean13 = stringKeySerializer10.isEmpty(serializerProvider11, (java.lang.Object) 0.0d);
        boolean boolean14 = stringKeySerializer10.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        boolean boolean17 = stringKeySerializer10.isEmpty(serializerProvider15, (java.lang.Object) 100.0f);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) boolean17, jsonGenerator18, serializerProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = stringKeySerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = stringKeySerializer0.unwrappingSerializer(nameTransformer4);
        java.lang.Class<java.lang.Object> objClass6 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.reflect.Type type8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = stringKeySerializer0.getSchema(serializerProvider7, type8, false);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = dynamic6.isEmpty(serializerProvider8, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean13 = dynamic12.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic12.handledType();
        java.lang.Class<?> wildcardClass15 = dynamic12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic6.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean17 = dynamic0.isEmpty(serializerProvider5, (java.lang.Object) jsonNode16);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = dynamic0._dynamicSerializers;
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj19, jsonGenerator20, serializerProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(propertySerializerMap18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = dynamic0.properties();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean4 = dynamic3.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = dynamic3.properties();
        boolean boolean6 = dynamic3.isUnwrappingSerializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = dynamic0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) dynamic3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        boolean boolean2 = objJsonSerializer0.isEmpty((java.lang.Object) 0.0d);
        boolean boolean3 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer0.unwrappingSerializer(nameTransformer4);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = stringKeySerializer3.properties();
        boolean boolean5 = stringKeySerializer0.isEmpty(serializerProvider2, (java.lang.Object) propertyWriterItor4);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer6.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer9);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = objJsonSerializer9.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = stringKeySerializer0.withFilterId((java.lang.Object) propertyWriterItor13);
        java.lang.Object obj15 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj15, jsonGenerator16, serializerProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj3 = dynamic2.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        boolean boolean5 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass6 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic2._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        java.lang.Object obj10 = null;
        boolean boolean11 = dynamic0.isEmpty(obj10);
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = stringKeySerializer2.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = stringKeySerializer2.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = stringKeySerializer2.unwrappingSerializer(nameTransformer6);
        java.lang.Class<java.lang.Object> objClass8 = stringKeySerializer2.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = dynamic0.withFilterId((java.lang.Object) stringKeySerializer2);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = stringKeySerializer2.properties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj13 = dynamic12.readResolve();
        java.lang.Object obj14 = dynamic12.readResolve();
        java.lang.Object obj15 = dynamic12.readResolve();
        boolean boolean16 = dynamic0.isEmpty((java.lang.Object) dynamic12);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap17 = dynamic12._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(serializerProvider4, (java.lang.Object) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = stringKeySerializer0.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer8.unwrappingSerializer(nameTransformer9);
        java.lang.Object obj11 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objJsonSerializer10.serializeWithType(obj11, jsonGenerator12, serializerProvider13, typeSerializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = dynamic6.isEmpty(serializerProvider8, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean13 = dynamic12.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic12.handledType();
        java.lang.Class<?> wildcardClass15 = dynamic12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic6.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean17 = dynamic0.isEmpty(serializerProvider5, (java.lang.Object) jsonNode16);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = dynamic0._dynamicSerializers;
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = dynamic0.withFilterId(obj19);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(propertySerializerMap18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        java.lang.Class<?> wildcardClass12 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = dynamic0.properties();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        java.lang.Object obj12 = dynamic0.readResolve();
        boolean boolean13 = dynamic0.usesObjectId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean6 = dynamic5.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic5._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass7 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj9 = dynamic8.readResolve();
        java.lang.Class<java.lang.Object> objClass10 = dynamic8.handledType();
        boolean boolean11 = dynamic8.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass12 = dynamic8.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap13 = dynamic8._dynamicSerializers;
        dynamic6._dynamicSerializers = propertySerializerMap13;
        dynamic4._dynamicSerializers = propertySerializerMap13;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic16 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj17 = dynamic16.readResolve();
        java.lang.Object obj18 = dynamic16.readResolve();
        java.lang.Object obj19 = dynamic16.readResolve();
        boolean boolean20 = dynamic4.isEmpty((java.lang.Object) dynamic16);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic21 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean22 = dynamic21.isUnwrappingSerializer();
        java.lang.Object obj23 = dynamic21.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = dynamic21.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic25 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass26 = dynamic25.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic27 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj28 = dynamic27.readResolve();
        java.lang.Class<java.lang.Object> objClass29 = dynamic27.handledType();
        boolean boolean30 = dynamic27.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass31 = dynamic27.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap32 = dynamic27._dynamicSerializers;
        dynamic25._dynamicSerializers = propertySerializerMap32;
        dynamic21._dynamicSerializers = propertySerializerMap32;
        dynamic4._dynamicSerializers = propertySerializerMap32;
        dynamic0._dynamicSerializers = propertySerializerMap32;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap37 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(propertySerializerMap13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(objClass26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(objClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objClass31);
        org.junit.Assert.assertNotNull(propertySerializerMap32);
        org.junit.Assert.assertNotNull(propertySerializerMap37);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass7 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj9 = dynamic8.readResolve();
        java.lang.Class<java.lang.Object> objClass10 = dynamic8.handledType();
        boolean boolean11 = dynamic8.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass12 = dynamic8.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap13 = dynamic8._dynamicSerializers;
        dynamic6._dynamicSerializers = propertySerializerMap13;
        dynamic4._dynamicSerializers = propertySerializerMap13;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic16 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj17 = dynamic16.readResolve();
        java.lang.Object obj18 = dynamic16.readResolve();
        java.lang.Object obj19 = dynamic16.readResolve();
        boolean boolean20 = dynamic4.isEmpty((java.lang.Object) dynamic16);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic16, jsonGenerator21, serializerProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(propertySerializerMap13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        boolean boolean6 = dynamic0.usesObjectId();
        boolean boolean7 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        boolean boolean8 = objJsonSerializer3.isEmpty((java.lang.Object) 100.0f);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = objJsonSerializer3.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = dynamic6.isEmpty(serializerProvider8, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean13 = dynamic12.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic12.handledType();
        java.lang.Class<?> wildcardClass15 = dynamic12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic6.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean17 = dynamic0.isEmpty(serializerProvider5, (java.lang.Object) jsonNode16);
        java.lang.Object obj18 = dynamic0.readResolve();
        java.lang.Class<?> wildcardClass19 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        boolean boolean2 = objJsonSerializer0.isEmpty((java.lang.Object) 0.0d);
        boolean boolean3 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = objJsonSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass3 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objClass3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<?> wildcardClass1 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        boolean boolean6 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic0.properties();
        java.lang.Class<?> wildcardClass5 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj3 = dynamic2.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        boolean boolean5 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass6 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic2._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        java.lang.Throwable throwable10 = null;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider9, throwable10, obj11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj2 = dynamic1.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = null;
        dynamic1._dynamicSerializers = propertySerializerMap3;
        java.lang.Class<java.lang.Object> objClass5 = dynamic1.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic1._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic1._dynamicSerializers;
        boolean boolean8 = stringKeySerializer0.isEmpty((java.lang.Object) propertySerializerMap7);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNull(propertySerializerMap6);
        org.junit.Assert.assertNull(propertySerializerMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj13 = dynamic12.readResolve();
        java.lang.Object obj14 = dynamic12.readResolve();
        java.lang.Object obj15 = dynamic12.readResolve();
        boolean boolean16 = dynamic0.isEmpty((java.lang.Object) dynamic12);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic17 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj18 = dynamic17.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        boolean boolean21 = dynamic17.isEmpty(serializerProvider19, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic23 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean24 = dynamic23.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass25 = dynamic23.handledType();
        java.lang.Class<?> wildcardClass26 = dynamic23.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = dynamic17.getSchema(serializerProvider22, (java.lang.reflect.Type) wildcardClass26);
        java.lang.Object obj28 = dynamic17.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap29 = dynamic17._dynamicSerializers;
        dynamic12._dynamicSerializers = propertySerializerMap29;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap31 = dynamic12._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = dynamic12.getDelegatee();
        java.lang.Class<java.lang.Object> objClass33 = dynamic12.handledType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(propertySerializerMap29);
        org.junit.Assert.assertNotNull(propertySerializerMap31);
        org.junit.Assert.assertNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(objClass33);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        boolean boolean7 = wildcardJsonSerializer6.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stringKeySerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Object obj4 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = stringKeySerializer3.properties();
        boolean boolean5 = stringKeySerializer0.isEmpty(serializerProvider2, (java.lang.Object) propertyWriterItor4);
        boolean boolean6 = stringKeySerializer0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass7 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = stringKeySerializer0.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) 52, jsonGenerator11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) (byte) 0, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.String (java.lang.Byte and java.lang.String are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        java.lang.Object obj3 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        java.lang.Object obj4 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(serializerProvider4, (java.lang.Object) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = stringKeySerializer0.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer8.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = objJsonSerializer10.unwrappingSerializer(nameTransformer11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = dynamic0.unwrappingSerializer(nameTransformer4);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic0.properties();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj6 = dynamic5.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean9 = dynamic5.isEmpty(serializerProvider7, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap10 = dynamic5._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap10;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = dynamic0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = dynamic0.isEmpty(serializerProvider4, obj5);
        java.lang.Object obj7 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        boolean boolean6 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = stringKeySerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass7 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj9 = dynamic8.readResolve();
        java.lang.Class<java.lang.Object> objClass10 = dynamic8.handledType();
        boolean boolean11 = dynamic8.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass12 = dynamic8.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap13 = dynamic8._dynamicSerializers;
        dynamic6._dynamicSerializers = propertySerializerMap13;
        dynamic4._dynamicSerializers = propertySerializerMap13;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic16 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj17 = dynamic16.readResolve();
        java.lang.Object obj18 = dynamic16.readResolve();
        java.lang.Object obj19 = dynamic16.readResolve();
        boolean boolean20 = dynamic4.isEmpty((java.lang.Object) dynamic16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = dynamic4.unwrappingSerializer(nameTransformer21);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) dynamic4, jsonGenerator23, serializerProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(propertySerializerMap13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = dynamic0.properties();
        java.lang.Object obj5 = dynamic0.readResolve();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = stringKeySerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = stringKeySerializer0.unwrappingSerializer(nameTransformer4);
        java.lang.Class<java.lang.Object> objClass6 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = stringKeySerializer0.properties();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj13 = dynamic12.readResolve();
        java.lang.Object obj14 = dynamic12.readResolve();
        java.lang.Object obj15 = dynamic12.readResolve();
        boolean boolean16 = dynamic0.isEmpty((java.lang.Object) dynamic12);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic18 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass19 = dynamic18.handledType();
        java.lang.Object obj20 = dynamic18.readResolve();
        java.lang.Class<java.lang.Object> objClass21 = dynamic18.handledType();
        boolean boolean22 = dynamic0.isEmpty(serializerProvider17, (java.lang.Object) objClass21);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        boolean boolean8 = objJsonSerializer3.isEmpty((java.lang.Object) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = objJsonSerializer9.withFilterId((java.lang.Object) objJsonSerializer12);
        boolean boolean16 = objJsonSerializer3.isEmpty((java.lang.Object) objJsonSerializer9);
        boolean boolean17 = objJsonSerializer9.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = objJsonSerializer9.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass10 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic6._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap11;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj15 = dynamic14.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic16 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass17 = dynamic16.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic18 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj19 = dynamic18.readResolve();
        java.lang.Class<java.lang.Object> objClass20 = dynamic18.handledType();
        boolean boolean21 = dynamic18.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass22 = dynamic18.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap23 = dynamic18._dynamicSerializers;
        dynamic16._dynamicSerializers = propertySerializerMap23;
        dynamic14._dynamicSerializers = propertySerializerMap23;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic26 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj27 = dynamic26.readResolve();
        java.lang.Object obj28 = dynamic26.readResolve();
        java.lang.Object obj29 = dynamic26.readResolve();
        boolean boolean30 = dynamic14.isEmpty((java.lang.Object) dynamic26);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic31 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj32 = dynamic31.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        boolean boolean35 = dynamic31.isEmpty(serializerProvider33, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic37 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean38 = dynamic37.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass39 = dynamic37.handledType();
        java.lang.Class<?> wildcardClass40 = dynamic37.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = dynamic31.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass40);
        java.lang.Object obj42 = dynamic31.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap43 = dynamic31._dynamicSerializers;
        dynamic26._dynamicSerializers = propertySerializerMap43;
        dynamic0._dynamicSerializers = propertySerializerMap43;
        java.lang.Class<java.lang.Object> objClass46 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objClass22);
        org.junit.Assert.assertNotNull(propertySerializerMap23);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(propertySerializerMap43);
        org.junit.Assert.assertNotNull(objClass46);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass3 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass5 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass10 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic6._dynamicSerializers;
        dynamic4._dynamicSerializers = propertySerializerMap11;
        dynamic0._dynamicSerializers = propertySerializerMap11;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap14 = dynamic0._dynamicSerializers;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNotNull(propertySerializerMap14);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        java.lang.Class<?> wildcardClass7 = objJsonSerializer0.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.reflect.Type type6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = dynamic0.getSchema(serializerProvider5, type6);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap8 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(propertySerializerMap8);
        org.junit.Assert.assertNotNull(objClass9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj4 = dynamic0.readResolve();
        java.lang.Object obj5 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.usesObjectId();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj4 = dynamic3.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass6 = dynamic5.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj8 = dynamic7.readResolve();
        java.lang.Class<java.lang.Object> objClass9 = dynamic7.handledType();
        boolean boolean10 = dynamic7.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass11 = dynamic7.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap12 = dynamic7._dynamicSerializers;
        dynamic5._dynamicSerializers = propertySerializerMap12;
        dynamic3._dynamicSerializers = propertySerializerMap12;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj16 = dynamic15.readResolve();
        java.lang.Object obj17 = dynamic15.readResolve();
        java.lang.Object obj18 = dynamic15.readResolve();
        boolean boolean19 = dynamic3.isEmpty((java.lang.Object) dynamic15);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic20 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj21 = dynamic20.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        boolean boolean24 = dynamic20.isEmpty(serializerProvider22, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic26 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean27 = dynamic26.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass28 = dynamic26.handledType();
        java.lang.Class<?> wildcardClass29 = dynamic26.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = dynamic20.getSchema(serializerProvider25, (java.lang.reflect.Type) wildcardClass29);
        java.lang.Object obj31 = dynamic20.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap32 = dynamic20._dynamicSerializers;
        dynamic15._dynamicSerializers = propertySerializerMap32;
        dynamic0._dynamicSerializers = propertySerializerMap32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(propertySerializerMap12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(propertySerializerMap32);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj4 = dynamic0.readResolve();
        java.lang.Object obj5 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj8 = dynamic7.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = dynamic7.isEmpty(serializerProvider9, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap12 = dynamic7._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic13 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj14 = dynamic13.readResolve();
        java.lang.Class<java.lang.Object> objClass15 = dynamic13.handledType();
        boolean boolean16 = dynamic13.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass17 = dynamic13.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = dynamic13._dynamicSerializers;
        dynamic7._dynamicSerializers = propertySerializerMap18;
        boolean boolean20 = dynamic0.isEmpty(serializerProvider6, (java.lang.Object) dynamic7);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(propertySerializerMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass3 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = dynamic0.getSchema(serializerProvider4, type5, false);
        java.lang.Class<?> wildcardClass8 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = stringKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        boolean boolean5 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj4 = dynamic0.readResolve();
        java.lang.Object obj5 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass6 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = stringKeySerializer0.getDelegatee();
        java.lang.Object obj8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj8, jsonGenerator9, serializerProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        boolean boolean5 = objJsonSerializer4.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean5 = dynamic4.isUnwrappingSerializer();
        java.lang.Object obj6 = dynamic4.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic4.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass9 = dynamic8.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj11 = dynamic10.readResolve();
        java.lang.Class<java.lang.Object> objClass12 = dynamic10.handledType();
        boolean boolean13 = dynamic10.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic10.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap15 = dynamic10._dynamicSerializers;
        dynamic8._dynamicSerializers = propertySerializerMap15;
        dynamic4._dynamicSerializers = propertySerializerMap15;
        boolean boolean18 = dynamic4.isUnwrappingSerializer();
        boolean boolean19 = dynamic0.isEmpty((java.lang.Object) boolean18);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap21 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(propertySerializerMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(propertySerializerMap21);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(objClass5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic0._dynamicSerializers;
        boolean boolean7 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj8 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNull(propertySerializerMap5);
        org.junit.Assert.assertNull(propertySerializerMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = null;
        dynamic0._dynamicSerializers = propertySerializerMap3;
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = stringKeySerializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = wildcardJsonSerializer1.isUnwrappingSerializer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        boolean boolean2 = objJsonSerializer0.isEmpty((java.lang.Object) 0.0d);
        boolean boolean3 = objJsonSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer0.properties();
        boolean boolean5 = objJsonSerializer0.isUnwrappingSerializer();
        boolean boolean6 = objJsonSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        java.lang.Object obj5 = dynamic0.readResolve();
        java.lang.Object obj6 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.Throwable throwable8 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj11 = dynamic10.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass13 = dynamic12.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj15 = dynamic14.readResolve();
        java.lang.Class<java.lang.Object> objClass16 = dynamic14.handledType();
        boolean boolean17 = dynamic14.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass18 = dynamic14.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap19 = dynamic14._dynamicSerializers;
        dynamic12._dynamicSerializers = propertySerializerMap19;
        dynamic10._dynamicSerializers = propertySerializerMap19;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic22 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj23 = dynamic22.readResolve();
        java.lang.Object obj24 = dynamic22.readResolve();
        java.lang.Object obj25 = dynamic22.readResolve();
        boolean boolean26 = dynamic10.isEmpty((java.lang.Object) dynamic22);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic27 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean28 = dynamic27.isUnwrappingSerializer();
        java.lang.Object obj29 = dynamic27.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = dynamic27.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic31 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass32 = dynamic31.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic33 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj34 = dynamic33.readResolve();
        java.lang.Class<java.lang.Object> objClass35 = dynamic33.handledType();
        boolean boolean36 = dynamic33.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass37 = dynamic33.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap38 = dynamic33._dynamicSerializers;
        dynamic31._dynamicSerializers = propertySerializerMap38;
        dynamic27._dynamicSerializers = propertySerializerMap38;
        dynamic10._dynamicSerializers = propertySerializerMap38;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer42 = dynamic9.withFilterId((java.lang.Object) propertySerializerMap38);
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider7, throwable8, (java.lang.Object) dynamic9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objClass13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objClass18);
        org.junit.Assert.assertNotNull(propertySerializerMap19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(objClass32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objClass37);
        org.junit.Assert.assertNotNull(propertySerializerMap38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer42);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj13 = dynamic12.readResolve();
        java.lang.Object obj14 = dynamic12.readResolve();
        java.lang.Object obj15 = dynamic12.readResolve();
        boolean boolean16 = dynamic0.isEmpty((java.lang.Object) dynamic12);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic17 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean18 = dynamic17.isUnwrappingSerializer();
        java.lang.Object obj19 = dynamic17.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = dynamic17.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic21 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass22 = dynamic21.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic23 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj24 = dynamic23.readResolve();
        java.lang.Class<java.lang.Object> objClass25 = dynamic23.handledType();
        boolean boolean26 = dynamic23.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass27 = dynamic23.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap28 = dynamic23._dynamicSerializers;
        dynamic21._dynamicSerializers = propertySerializerMap28;
        dynamic17._dynamicSerializers = propertySerializerMap28;
        dynamic0._dynamicSerializers = propertySerializerMap28;
        boolean boolean32 = dynamic0.usesObjectId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(objClass22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(objClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objClass27);
        org.junit.Assert.assertNotNull(propertySerializerMap28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj8 = dynamic7.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = null;
        dynamic7._dynamicSerializers = propertySerializerMap9;
        java.lang.Class<java.lang.Object> objClass11 = dynamic7.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = dynamic0.getSchema(serializerProvider6, (java.lang.reflect.Type) objClass11);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic13 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj14 = dynamic13.readResolve();
        java.lang.Class<java.lang.Object> objClass15 = dynamic13.handledType();
        boolean boolean16 = dynamic13.isUnwrappingSerializer();
        java.lang.Object obj17 = dynamic13.readResolve();
        java.lang.Class<java.lang.Object> objClass18 = dynamic13.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serializeWithType((java.lang.Object) dynamic13, jsonGenerator19, serializerProvider20, typeSerializer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(objClass18);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        java.lang.Class<?> wildcardClass3 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj13 = dynamic12.readResolve();
        java.lang.Object obj14 = dynamic12.readResolve();
        java.lang.Object obj15 = dynamic12.readResolve();
        boolean boolean16 = dynamic0.isEmpty((java.lang.Object) dynamic12);
        boolean boolean17 = dynamic0.usesObjectId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj4 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = dynamic6.isEmpty(serializerProvider8, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic6._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj13 = dynamic12.readResolve();
        java.lang.Class<java.lang.Object> objClass14 = dynamic12.handledType();
        boolean boolean15 = dynamic12.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass16 = dynamic12.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap17 = dynamic12._dynamicSerializers;
        dynamic6._dynamicSerializers = propertySerializerMap17;
        dynamic0._dynamicSerializers = propertySerializerMap17;
        java.lang.Class<java.lang.Object> objClass20 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertySerializerMap17);
        org.junit.Assert.assertNotNull(objClass20);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stringKeySerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        boolean boolean4 = dynamic0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass5 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = dynamic6.isEmpty(serializerProvider8, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean13 = dynamic12.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic12.handledType();
        java.lang.Class<?> wildcardClass15 = dynamic12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic6.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean17 = dynamic0.isEmpty(serializerProvider5, (java.lang.Object) jsonNode16);
        java.lang.Class<java.lang.Object> objClass18 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objClass18);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass10 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic6._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap11;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj15 = dynamic14.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic16 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass17 = dynamic16.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic18 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj19 = dynamic18.readResolve();
        java.lang.Class<java.lang.Object> objClass20 = dynamic18.handledType();
        boolean boolean21 = dynamic18.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass22 = dynamic18.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap23 = dynamic18._dynamicSerializers;
        dynamic16._dynamicSerializers = propertySerializerMap23;
        dynamic14._dynamicSerializers = propertySerializerMap23;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic26 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj27 = dynamic26.readResolve();
        java.lang.Object obj28 = dynamic26.readResolve();
        java.lang.Object obj29 = dynamic26.readResolve();
        boolean boolean30 = dynamic14.isEmpty((java.lang.Object) dynamic26);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic31 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj32 = dynamic31.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        boolean boolean35 = dynamic31.isEmpty(serializerProvider33, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic37 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean38 = dynamic37.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass39 = dynamic37.handledType();
        java.lang.Class<?> wildcardClass40 = dynamic37.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = dynamic31.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass40);
        java.lang.Object obj42 = dynamic31.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap43 = dynamic31._dynamicSerializers;
        dynamic26._dynamicSerializers = propertySerializerMap43;
        dynamic0._dynamicSerializers = propertySerializerMap43;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper46, javaType47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objClass22);
        org.junit.Assert.assertNotNull(propertySerializerMap23);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(propertySerializerMap43);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap3 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = dynamic0.unwrappingSerializer(nameTransformer4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(propertySerializerMap3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = stringKeySerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = stringKeySerializer0.unwrappingSerializer(nameTransformer4);
        java.lang.Class<java.lang.Object> objClass6 = stringKeySerializer0.handledType();
        boolean boolean7 = stringKeySerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Object obj2 = dynamic0.readResolve();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj4 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass3 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = dynamic4.properties();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic4._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap6;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj3 = dynamic2.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        boolean boolean5 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass6 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic2._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        boolean boolean9 = dynamic0.isUnwrappingSerializer();
        boolean boolean10 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean7 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        java.lang.Class<?> wildcardClass9 = dynamic6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Object obj11 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap12 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap13 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(propertySerializerMap12);
        org.junit.Assert.assertNotNull(propertySerializerMap13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj3 = dynamic2.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        boolean boolean5 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass6 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic2._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean12 = dynamic11.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass13 = dynamic11.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = dynamic0.getSchema(serializerProvider10, (java.lang.reflect.Type) objClass13, false);
        java.lang.Object obj16 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic18 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj19 = dynamic18.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic20 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass21 = dynamic20.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic22 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj23 = dynamic22.readResolve();
        java.lang.Class<java.lang.Object> objClass24 = dynamic22.handledType();
        boolean boolean25 = dynamic22.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass26 = dynamic22.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap27 = dynamic22._dynamicSerializers;
        dynamic20._dynamicSerializers = propertySerializerMap27;
        dynamic18._dynamicSerializers = propertySerializerMap27;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic30 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj31 = dynamic30.readResolve();
        java.lang.Object obj32 = dynamic30.readResolve();
        java.lang.Object obj33 = dynamic30.readResolve();
        boolean boolean34 = dynamic18.isEmpty((java.lang.Object) dynamic30);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic35 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj36 = dynamic35.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        boolean boolean39 = dynamic35.isEmpty(serializerProvider37, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic41 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean42 = dynamic41.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass43 = dynamic41.handledType();
        java.lang.Class<?> wildcardClass44 = dynamic41.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = dynamic35.getSchema(serializerProvider40, (java.lang.reflect.Type) wildcardClass44);
        java.lang.Object obj46 = dynamic35.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap47 = dynamic35._dynamicSerializers;
        dynamic30._dynamicSerializers = propertySerializerMap47;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap49 = dynamic30._dynamicSerializers;
        boolean boolean50 = dynamic0.isEmpty(serializerProvider17, (java.lang.Object) propertySerializerMap49);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap51 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objClass13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(objClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objClass26);
        org.junit.Assert.assertNotNull(propertySerializerMap27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(propertySerializerMap47);
        org.junit.Assert.assertNotNull(propertySerializerMap49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap51);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj2 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass5 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass10 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic6._dynamicSerializers;
        dynamic4._dynamicSerializers = propertySerializerMap11;
        dynamic0._dynamicSerializers = propertySerializerMap11;
        boolean boolean14 = dynamic0.isUnwrappingSerializer();
        boolean boolean15 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean7 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        java.lang.Class<?> wildcardClass9 = dynamic6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass9);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean5 = dynamic4.usesObjectId();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = dynamic4._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        java.lang.Class<?> wildcardClass9 = objJsonSerializer8.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = dynamic4.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = jsonNode10.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = dynamic0.withFilterId((java.lang.Object) jsonNode10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        boolean boolean7 = stringKeySerializer0.isEmpty((java.lang.Object) objJsonSerializer6);
        boolean boolean8 = stringKeySerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic9 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean10 = dynamic9.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass11 = dynamic9.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = dynamic9.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        java.lang.reflect.Type type15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic9.getSchema(serializerProvider14, type15);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap17 = dynamic9._dynamicSerializers;
        java.lang.Object obj18 = dynamic9.readResolve();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj18, jsonGenerator19, serializerProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic cannot be cast to class java.lang.String (com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(propertySerializerMap17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Object obj4 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = objJsonSerializer3.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer3.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = objJsonSerializer9.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = stringKeySerializer5.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = stringKeySerializer5.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = stringKeySerializer5.unwrappingSerializer(nameTransformer9);
        java.lang.Class<java.lang.Object> objClass11 = stringKeySerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = dynamic0.getSchema(serializerProvider4, (java.lang.reflect.Type) objClass11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Object obj4 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        boolean boolean7 = stringKeySerializer0.isEmpty(serializerProvider5, (java.lang.Object) 100.0f);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = stringKeySerializer0.unwrappingSerializer(nameTransformer8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass1 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj3 = dynamic2.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic2.handledType();
        boolean boolean5 = dynamic2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass6 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = dynamic2._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap7;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic0._dynamicSerializers;
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(objClass10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass4 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objClass4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass6 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = stringKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = stringKeySerializer0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean7 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        java.lang.Class<?> wildcardClass9 = dynamic6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass9);
        boolean boolean11 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap12 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.Object obj3 = null;
        boolean boolean4 = stringKeySerializer0.isEmpty(serializerProvider2, obj3);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = dynamic6.isEmpty(serializerProvider8, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean13 = dynamic12.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic12.handledType();
        java.lang.Class<?> wildcardClass15 = dynamic12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic6.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean17 = dynamic0.isEmpty(serializerProvider5, (java.lang.Object) jsonNode16);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap18 = dynamic0._dynamicSerializers;
        java.lang.Object obj19 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(propertySerializerMap18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean5 = dynamic4.isUnwrappingSerializer();
        java.lang.Object obj6 = dynamic4.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic4.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass9 = dynamic8.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj11 = dynamic10.readResolve();
        java.lang.Class<java.lang.Object> objClass12 = dynamic10.handledType();
        boolean boolean13 = dynamic10.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic10.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap15 = dynamic10._dynamicSerializers;
        dynamic8._dynamicSerializers = propertySerializerMap15;
        dynamic4._dynamicSerializers = propertySerializerMap15;
        boolean boolean18 = dynamic4.isUnwrappingSerializer();
        boolean boolean19 = dynamic0.isEmpty((java.lang.Object) boolean18);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.Object obj21 = null;
        boolean boolean22 = dynamic0.isEmpty(serializerProvider20, obj21);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(propertySerializerMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj8 = dynamic7.readResolve();
        java.lang.Class<java.lang.Object> objClass9 = dynamic7.handledType();
        boolean boolean10 = dynamic7.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass11 = dynamic7.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = dynamic0.withFilterId((java.lang.Object) dynamic7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = dynamic0.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass3 = dynamic2.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj5 = dynamic4.readResolve();
        java.lang.Class<java.lang.Object> objClass6 = dynamic4.handledType();
        boolean boolean7 = dynamic4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic4.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap9 = dynamic4._dynamicSerializers;
        dynamic2._dynamicSerializers = propertySerializerMap9;
        dynamic0._dynamicSerializers = propertySerializerMap9;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic12 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj13 = dynamic12.readResolve();
        java.lang.Object obj14 = dynamic12.readResolve();
        java.lang.Object obj15 = dynamic12.readResolve();
        boolean boolean16 = dynamic0.isEmpty((java.lang.Object) dynamic12);
        java.lang.Object obj17 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(propertySerializerMap9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean5 = dynamic4.isUnwrappingSerializer();
        java.lang.Object obj6 = dynamic4.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = dynamic4.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Class<java.lang.Object> objClass9 = dynamic8.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj11 = dynamic10.readResolve();
        java.lang.Class<java.lang.Object> objClass12 = dynamic10.handledType();
        boolean boolean13 = dynamic10.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass14 = dynamic10.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap15 = dynamic10._dynamicSerializers;
        dynamic8._dynamicSerializers = propertySerializerMap15;
        dynamic4._dynamicSerializers = propertySerializerMap15;
        boolean boolean18 = dynamic4.isUnwrappingSerializer();
        boolean boolean19 = dynamic0.isEmpty((java.lang.Object) boolean18);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = dynamic0.getDelegatee();
        java.lang.Object obj21 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(propertySerializerMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        boolean boolean3 = stringKeySerializer0.isEmpty(serializerProvider1, (java.lang.Object) 0.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(serializerProvider4, (java.lang.Object) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = stringKeySerializer0.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer8.unwrappingSerializer(nameTransformer9);
        boolean boolean11 = objJsonSerializer10.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        boolean boolean8 = objJsonSerializer3.isEmpty((java.lang.Object) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = objJsonSerializer9.withFilterId((java.lang.Object) objJsonSerializer12);
        boolean boolean16 = objJsonSerializer3.isEmpty((java.lang.Object) objJsonSerializer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = objJsonSerializer9.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = objJsonSerializer18.unwrappingSerializer(nameTransformer19);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = null;
        dynamic0._dynamicSerializers = propertySerializerMap2;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic0.getDelegatee();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(propertySerializerMap4);
        org.junit.Assert.assertNull(propertySerializerMap5);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Object obj3 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = dynamic0.getDelegatee();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap2 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(propertySerializerMap2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj7 = dynamic6.readResolve();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        boolean boolean9 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass10 = dynamic6.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = dynamic6._dynamicSerializers;
        dynamic0._dynamicSerializers = propertySerializerMap11;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap14 = null;
        dynamic0._dynamicSerializers = propertySerializerMap14;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(propertySerializerMap11);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = objJsonSerializer0.withFilterId((java.lang.Object) objJsonSerializer3);
        boolean boolean8 = objJsonSerializer3.isEmpty((java.lang.Object) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = objJsonSerializer9.withFilterId((java.lang.Object) objJsonSerializer12);
        boolean boolean16 = objJsonSerializer3.isEmpty((java.lang.Object) objJsonSerializer9);
        java.lang.Class<?> wildcardClass17 = objJsonSerializer3.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj1 = dynamic0.readResolve();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dynamic0.isEmpty(serializerProvider2, (java.lang.Object) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean7 = dynamic6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = dynamic6.handledType();
        java.lang.Class<?> wildcardClass9 = dynamic6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass9);
        boolean boolean11 = dynamic0.isUnwrappingSerializer();
        java.lang.Object obj12 = dynamic0.readResolve();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass3 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap4 = dynamic0._dynamicSerializers;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(propertySerializerMap4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap5 = dynamic0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        java.lang.Object obj8 = dynamic7.readResolve();
        java.lang.Class<java.lang.Object> objClass9 = dynamic7.handledType();
        boolean boolean10 = dynamic7.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass11 = dynamic7.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = dynamic0.withFilterId((java.lang.Object) dynamic7);
        boolean boolean13 = dynamic7.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(propertySerializerMap5);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

