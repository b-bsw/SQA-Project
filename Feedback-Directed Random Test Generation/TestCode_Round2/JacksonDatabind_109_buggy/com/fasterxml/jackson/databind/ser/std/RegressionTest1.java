package com.fasterxml.jackson.databind.ser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass2 = numberSerializer0.handledType();
        boolean boolean4 = numberSerializer0.isEmpty((java.lang.Number) (short) -1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer5.withFilterId((java.lang.Object) intLikeSerializer6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer5.getSchema(serializerProvider8, type9, true);
        java.lang.Class<java.lang.Object> objClass12 = intLikeSerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) objClass12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = intLikeSerializer0.unwrappingSerializer(nameTransformer14);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = intLikeSerializer16.withFilterId((java.lang.Object) intLikeSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = intLikeSerializer16.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.reflect.Type type21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = intLikeSerializer16.getSchema(serializerProvider20, type21, true);
        boolean boolean24 = objJsonSerializer15.isEmpty((java.lang.Object) type21);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor25 = objJsonSerializer15.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(propertyWriterItor25);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass6 = intLikeSerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = floatSerializer3.getSchema(serializerProvider4, (java.lang.reflect.Type) objClass6, true);
        boolean boolean9 = floatSerializer3.usesObjectId();
        java.lang.Class<java.lang.Object> objClass10 = floatSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) objClass10, false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) (-1L), jsonGenerator14, serializerProvider15, typeSerializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(floatSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer7 = numberSerializer0.unwrappingSerializer(nameTransformer6);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer0.properties();
        boolean boolean9 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Throwable throwable11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = numberSerializer12.properties();
        boolean boolean15 = numberSerializer12.isEmpty((java.lang.Number) 10.0f);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer12.properties();
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider10, throwable11, (java.lang.Object) numberSerializer12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberJsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (byte) -1);
        java.lang.Class<java.lang.Number> numberClass7 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer0.handledType();
        boolean boolean11 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer0.unwrappingSerializer(nameTransformer12);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberClass7);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = intLikeSerializer8.withFilterId((java.lang.Object) intLikeSerializer9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer8.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer13.withFilterId((java.lang.Object) intLikeSerializer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = intLikeSerializer13.getSchema(serializerProvider16, type17, true);
        java.lang.Class<java.lang.Object> objClass20 = intLikeSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer8.getSchema(serializerProvider12, (java.lang.reflect.Type) objClass20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = intLikeSerializer8.unwrappingSerializer(nameTransformer22);
        boolean boolean24 = intLikeSerializer0.isEmpty(serializerProvider7, (java.lang.Object) objJsonSerializer23);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor25 = intLikeSerializer0.properties();
        java.lang.Class<java.lang.Object> objClass26 = intLikeSerializer0.handledType();
        boolean boolean27 = intLikeSerializer0.usesObjectId();
        boolean boolean28 = intLikeSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor25);
        org.junit.Assert.assertNotNull(objClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = intLikeSerializer0.unwrappingSerializer(nameTransformer1);
        java.lang.Class<java.lang.Object> objClass3 = intLikeSerializer0.handledType();
        boolean boolean4 = intLikeSerializer0._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer6.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = numberSerializer6.isEmpty(serializerProvider8, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer6.getDelegatee();
        boolean boolean12 = numberSerializer6.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = floatSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) objClass17, true);
        boolean boolean20 = floatSerializer14.usesObjectId();
        java.lang.Class<java.lang.Object> objClass21 = floatSerializer14.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = numberSerializer6.getSchema(serializerProvider13, (java.lang.reflect.Type) objClass21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        java.lang.reflect.Type type24 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = numberSerializer6.getSchema(serializerProvider23, type24, true);
        boolean boolean27 = intLikeSerializer0.isEmpty((java.lang.Object) serializerProvider23);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType28 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer29 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = intLikeSerializer29.unwrappingSerializer(nameTransformer30);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer33 = objJsonSerializer31.withFilterId((java.lang.Object) (short) 10);
        boolean boolean34 = objJsonSerializer31.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = objJsonSerializer31.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer36 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer37 = objJsonSerializer31.unwrappingSerializer(nameTransformer36);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = objJsonSerializer31.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer39 = intLikeSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) wildcardJsonSerializer38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + numberType28 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType28.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer29);
        org.junit.Assert.assertNotNull(objJsonSerializer31);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(objJsonSerializer37);
        org.junit.Assert.assertNull(wildcardJsonSerializer38);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer0.getDelegatee();
        boolean boolean9 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Throwable throwable11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = intLikeSerializer12.withFilterId((java.lang.Object) intLikeSerializer13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer12.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = intLikeSerializer12.getSchema(serializerProvider16, type17, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = intLikeSerializer21.withFilterId((java.lang.Object) intLikeSerializer22);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = intLikeSerializer21.getSchema(serializerProvider24, type25, true);
        java.lang.Class<java.lang.Object> objClass28 = intLikeSerializer21.handledType();
        java.lang.Class<java.lang.Object> objClass29 = intLikeSerializer21.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = intLikeSerializer12.getSchema(serializerProvider20, (java.lang.reflect.Type) objClass29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = intLikeSerializer32.withFilterId((java.lang.Object) intLikeSerializer33);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = intLikeSerializer32.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        java.lang.reflect.Type type37 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = intLikeSerializer32.getSchema(serializerProvider36, type37, true);
        java.lang.Class<?> wildcardClass40 = intLikeSerializer32.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = intLikeSerializer12.getSchema(serializerProvider31, (java.lang.reflect.Type) wildcardClass40, true);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer43 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = intLikeSerializer12.unwrappingSerializer(nameTransformer43);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor45 = objJsonSerializer44.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer46 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer47 = objJsonSerializer44.unwrappingSerializer(nameTransformer46);
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.wrapAndThrow(serializerProvider10, throwable11, (java.lang.Object) objJsonSerializer44, "number");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(intLikeSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(objClass28);
        org.junit.Assert.assertNotNull(objClass29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(objJsonSerializer44);
        org.junit.Assert.assertNotNull(propertyWriterItor45);
        org.junit.Assert.assertNotNull(objJsonSerializer47);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer7.properties();
        boolean boolean10 = numberSerializer7.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = numberSerializer7.getSchema(serializerProvider11, type12, false);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = numberSerializer7.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = intLikeSerializer16.withFilterId((java.lang.Object) intLikeSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = intLikeSerializer16.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.reflect.Type type21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = intLikeSerializer16.getSchema(serializerProvider20, type21, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = intLikeSerializer25.withFilterId((java.lang.Object) intLikeSerializer26);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        java.lang.reflect.Type type29 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = intLikeSerializer25.getSchema(serializerProvider28, type29, true);
        java.lang.Class<java.lang.Object> objClass32 = intLikeSerializer25.handledType();
        java.lang.Class<java.lang.Object> objClass33 = intLikeSerializer25.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = intLikeSerializer16.getSchema(serializerProvider24, (java.lang.reflect.Type) objClass33);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = intLikeSerializer16.unwrappingSerializer(nameTransformer35);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer38 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer40 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass41 = intLikeSerializer40.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = floatSerializer38.getSchema(serializerProvider39, (java.lang.reflect.Type) objClass41, true);
        boolean boolean44 = floatSerializer38.usesObjectId();
        java.lang.Class<java.lang.Object> objClass45 = floatSerializer38.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = floatSerializer38.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer48 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer49 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer50 = intLikeSerializer48.withFilterId((java.lang.Object) intLikeSerializer49);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = intLikeSerializer48.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer53 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer54 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer55 = intLikeSerializer53.withFilterId((java.lang.Object) intLikeSerializer54);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = null;
        java.lang.reflect.Type type57 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = intLikeSerializer53.getSchema(serializerProvider56, type57, true);
        java.lang.Class<java.lang.Object> objClass60 = intLikeSerializer53.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = intLikeSerializer48.getSchema(serializerProvider52, (java.lang.reflect.Type) objClass60);
        boolean boolean62 = floatSerializer38.isEmpty(serializerProvider47, (java.lang.Object) serializerProvider52);
        java.lang.Class<java.lang.Object> objClass63 = floatSerializer38.handledType();
        boolean boolean64 = objJsonSerializer36.isEmpty(serializerProvider37, (java.lang.Object) floatSerializer38);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor65 = floatSerializer38.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer66 = numberSerializer7.withFilterId((java.lang.Object) propertyWriterItor65);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator67 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serialize((java.lang.Object) numberSerializer7, jsonGenerator67, serializerProvider68);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializer cannot be cast to class java.lang.Number (com.fasterxml.jackson.databind.ser.std.NumberSerializer is in unnamed module of loader 'app'; java.lang.Number is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(numberSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(intLikeSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(objClass32);
        org.junit.Assert.assertNotNull(objClass33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
        org.junit.Assert.assertNotNull(floatSerializer38);
        org.junit.Assert.assertNotNull(intLikeSerializer40);
        org.junit.Assert.assertNotNull(objClass41);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objClass45);
        org.junit.Assert.assertNull(wildcardJsonSerializer46);
        org.junit.Assert.assertNotNull(intLikeSerializer48);
        org.junit.Assert.assertNotNull(intLikeSerializer49);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer50);
        org.junit.Assert.assertNull(wildcardJsonSerializer51);
        org.junit.Assert.assertNotNull(intLikeSerializer53);
        org.junit.Assert.assertNotNull(intLikeSerializer54);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer55);
        org.junit.Assert.assertNotNull(jsonNode59);
        org.junit.Assert.assertNotNull(objClass60);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor65);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer66);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean7 = numberSerializer0.isEmpty((java.lang.Number) 1.0d);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) intLikeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer4.getSchema(serializerProvider8, type9, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = intLikeSerializer4.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass14 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass14, false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer18 = numberSerializer0.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = intLikeSerializer19.withFilterId((java.lang.Object) intLikeSerializer20);
        boolean boolean22 = wildcardJsonSerializer21.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer23.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        boolean boolean27 = numberSerializer23.isEmpty(serializerProvider25, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer23.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer30 = numberSerializer23.unwrappingSerializer(nameTransformer29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberJsonSerializer30.isEmpty(serializerProvider31, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberJsonSerializer30.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = wildcardJsonSerializer21.withFilterId((java.lang.Object) numberJsonSerializer30);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        java.lang.reflect.Type type38 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = numberSerializer0.getSchema(serializerProvider37, type38);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(numberJsonSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(jsonNode39);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.Throwable throwable7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer8.unwrappingSerializer(nameTransformer9);
        boolean boolean11 = numberSerializer8._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer8.properties();
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider6, throwable7, (java.lang.Object) propertyWriterItor12, "number");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberSerializer8);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer5 = numberSerializer0.unwrappingSerializer(nameTransformer4);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = numberSerializer0.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(numberJsonSerializer5);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) 1L, jsonGenerator5, serializerProvider6, typeSerializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer5 = numberJsonSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberJsonSerializer5.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberJsonSerializer5.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
        org.junit.Assert.assertNotNull(numberJsonSerializer5);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = intLikeSerializer3.withFilterId((java.lang.Object) intLikeSerializer4);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.reflect.Type type7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = intLikeSerializer3.getSchema(serializerProvider6, type7, true);
        java.lang.Class<java.lang.Object> objClass10 = intLikeSerializer3.handledType();
        boolean boolean11 = intLikeSerializer3.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass12 = intLikeSerializer3.handledType();
        boolean boolean13 = intLikeSerializer3.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer0.withFilterId((java.lang.Object) intLikeSerializer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer16 = numberSerializer0.unwrappingSerializer(nameTransformer15);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(numberJsonSerializer16);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass2 = numberSerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = numberSerializer0.getSchema(serializerProvider4, type5);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberClass2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = intLikeSerializer8.withFilterId((java.lang.Object) intLikeSerializer9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer8.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer13.withFilterId((java.lang.Object) intLikeSerializer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = intLikeSerializer13.getSchema(serializerProvider16, type17, true);
        java.lang.Class<java.lang.Object> objClass20 = intLikeSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer8.getSchema(serializerProvider12, (java.lang.reflect.Type) objClass20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = intLikeSerializer8.unwrappingSerializer(nameTransformer22);
        boolean boolean24 = intLikeSerializer0.isEmpty(serializerProvider7, (java.lang.Object) objJsonSerializer23);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType25 = intLikeSerializer0._numberType;
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + numberType25 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType25.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0.0f);
        java.lang.Class<java.lang.Number> numberClass5 = numberSerializer0.handledType();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(numberClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        boolean boolean12 = numberSerializer0.isEmpty((java.lang.Number) (byte) -1);
        boolean boolean13 = numberSerializer0._isInt;
        boolean boolean14 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0.0f);
        java.lang.Class<java.lang.Number> numberClass5 = numberSerializer0.handledType();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean7 = numberSerializer0._isInt;
        boolean boolean9 = numberSerializer0.isEmpty((java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(numberClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer9.withFilterId((java.lang.Object) intLikeSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = intLikeSerializer9.getSchema(serializerProvider12, type13, true);
        java.lang.Class<java.lang.Object> objClass16 = intLikeSerializer9.handledType();
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = intLikeSerializer0.unwrappingSerializer(nameTransformer19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass25 = intLikeSerializer24.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = floatSerializer22.getSchema(serializerProvider23, (java.lang.reflect.Type) objClass25, true);
        boolean boolean28 = floatSerializer22.usesObjectId();
        java.lang.Class<java.lang.Object> objClass29 = floatSerializer22.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = floatSerializer22.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = intLikeSerializer32.withFilterId((java.lang.Object) intLikeSerializer33);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = intLikeSerializer32.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer38 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = intLikeSerializer37.withFilterId((java.lang.Object) intLikeSerializer38);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        java.lang.reflect.Type type41 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = intLikeSerializer37.getSchema(serializerProvider40, type41, true);
        java.lang.Class<java.lang.Object> objClass44 = intLikeSerializer37.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = intLikeSerializer32.getSchema(serializerProvider36, (java.lang.reflect.Type) objClass44);
        boolean boolean46 = floatSerializer22.isEmpty(serializerProvider31, (java.lang.Object) serializerProvider36);
        java.lang.Class<java.lang.Object> objClass47 = floatSerializer22.handledType();
        boolean boolean48 = objJsonSerializer20.isEmpty(serializerProvider21, (java.lang.Object) floatSerializer22);
        boolean boolean49 = floatSerializer22._isInt;
        java.lang.Object obj50 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer22.serialize(obj50, jsonGenerator51, serializerProvider52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertNotNull(floatSerializer22);
        org.junit.Assert.assertNotNull(intLikeSerializer24);
        org.junit.Assert.assertNotNull(objClass25);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objClass29);
        org.junit.Assert.assertNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(intLikeSerializer37);
        org.junit.Assert.assertNotNull(intLikeSerializer38);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNotNull(objClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = shortSerializer0.createContextual(serializerProvider1, beanProperty2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = wildcardJsonSerializer8.usesObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.Number number12 = null;
        boolean boolean13 = numberSerializer0.isEmpty(serializerProvider11, number12);
        boolean boolean15 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) 100L);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = intLikeSerializer4.unwrappingSerializer(nameTransformer7);
        java.lang.Object obj9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = intLikeSerializer4.withFilterId(obj9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer0.withFilterId(obj9);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = numberSerializer0.usesObjectId();
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (short) 1);
        boolean boolean7 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        boolean boolean10 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0._isInt;
        boolean boolean3 = numberSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        boolean boolean4 = numberSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = numberSerializer0.getSchema(serializerProvider4, type5, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = numberSerializer0.getSchema(serializerProvider8, type9, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        boolean boolean9 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer11.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        boolean boolean15 = numberSerializer11.isEmpty(serializerProvider13, (java.lang.Number) 0L);
        boolean boolean17 = numberSerializer11.isEmpty((java.lang.Number) (byte) -1);
        java.lang.Class<java.lang.Number> numberClass18 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer20 = numberSerializer11.unwrappingSerializer(nameTransformer19);
        java.lang.Class<java.lang.Number> numberClass21 = numberSerializer11.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = numberSerializer0.getSchema(serializerProvider10, (java.lang.reflect.Type) numberClass21, false);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(numberClass18);
        org.junit.Assert.assertNotNull(numberJsonSerializer20);
        org.junit.Assert.assertNotNull(numberClass21);
        org.junit.Assert.assertNotNull(jsonNode23);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        boolean boolean4 = numberSerializer0._isInt;
        boolean boolean5 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.createContextual(serializerProvider6, beanProperty7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        boolean boolean11 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.withFilterId((java.lang.Object) 0.0d);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer0.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0.0f);
        java.lang.Class<java.lang.Number> numberClass5 = numberSerializer0.handledType();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean7 = numberSerializer0.isUnwrappingSerializer();
        boolean boolean8 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        java.lang.Number number10 = null;
        boolean boolean11 = numberSerializer0.isEmpty(serializerProvider9, number10);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(numberClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = intLikeSerializer8.withFilterId((java.lang.Object) intLikeSerializer9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer8.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer13.withFilterId((java.lang.Object) intLikeSerializer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = intLikeSerializer13.getSchema(serializerProvider16, type17, true);
        java.lang.Class<java.lang.Object> objClass20 = intLikeSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer8.getSchema(serializerProvider12, (java.lang.reflect.Type) objClass20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = intLikeSerializer8.unwrappingSerializer(nameTransformer22);
        boolean boolean24 = intLikeSerializer0.isEmpty(serializerProvider7, (java.lang.Object) objJsonSerializer23);
        java.lang.String str25 = intLikeSerializer0._schemaType;
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "integer" + "'", str25, "integer");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer1.withFilterId((java.lang.Object) intLikeSerializer2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer1.getSchema(serializerProvider4, type5, true);
        java.lang.Class<java.lang.Object> objClass8 = intLikeSerializer1.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = intLikeSerializer1.unwrappingSerializer(nameTransformer9);
        java.lang.Class<java.lang.Object> objClass11 = intLikeSerializer1.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Object) objClass11, jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Short (java.lang.Class and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer0.getDelegatee();
        boolean boolean9 = intLikeSerializer0.isUnwrappingSerializer();
        boolean boolean11 = intLikeSerializer0.isEmpty((java.lang.Object) 1.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = numberSerializer12.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = numberSerializer12.isEmpty(serializerProvider14, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberSerializer12.getDelegatee();
        boolean boolean18 = numberSerializer12.usesObjectId();
        boolean boolean20 = numberSerializer12.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean23 = numberSerializer12.isEmpty(serializerProvider21, (java.lang.Number) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer25 = numberSerializer12.unwrappingSerializer(nameTransformer24);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = intLikeSerializer0.withFilterId((java.lang.Object) numberSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        boolean boolean3 = intLikeSerializer1.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = intLikeSerializer1.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = intLikeSerializer6.unwrappingSerializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = intLikeSerializer6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer1.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass9);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer11.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        boolean boolean15 = numberSerializer11.isEmpty(serializerProvider13, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer11.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer18 = numberSerializer11.unwrappingSerializer(nameTransformer17);
        boolean boolean19 = intLikeSerializer1.isEmpty((java.lang.Object) numberJsonSerializer18);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        boolean boolean22 = numberJsonSerializer18.isEmpty(serializerProvider20, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(numberJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0.0f);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = numberSerializer5.properties();
        boolean boolean8 = numberSerializer5.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer5.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer5.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = intLikeSerializer11.withFilterId((java.lang.Object) intLikeSerializer12);
        boolean boolean14 = wildcardJsonSerializer13.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = numberSerializer15.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean19 = numberSerializer15.isEmpty(serializerProvider17, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = numberSerializer15.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer22 = numberSerializer15.unwrappingSerializer(nameTransformer21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        boolean boolean25 = numberJsonSerializer22.isEmpty(serializerProvider23, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberJsonSerializer22.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = wildcardJsonSerializer13.withFilterId((java.lang.Object) numberJsonSerializer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer5.withFilterId((java.lang.Object) numberJsonSerializer22);
        java.lang.Class<java.lang.Number> numberClass29 = numberSerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = numberSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) numberClass29, false);
        boolean boolean32 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(numberSerializer5);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(intLikeSerializer11);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberSerializer15);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(numberJsonSerializer22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberClass29);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = intLikeSerializer1.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.reflect.Type type6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = intLikeSerializer1.getSchema(serializerProvider5, type6, true);
        java.lang.Class<java.lang.Object> objClass9 = intLikeSerializer1.handledType();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass9);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass3 = intLikeSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = floatSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) objClass3, true);
        boolean boolean6 = floatSerializer0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass7 = floatSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer8.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = numberSerializer8.isEmpty(serializerProvider10, (java.lang.Number) 0L);
        boolean boolean14 = numberSerializer8.isEmpty((java.lang.Number) (byte) -1);
        java.lang.Class<java.lang.Number> numberClass15 = numberSerializer8.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer17 = numberSerializer8.unwrappingSerializer(nameTransformer16);
        java.lang.Class<java.lang.Number> numberClass18 = numberSerializer8.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) numberClass18, jsonGenerator19, serializerProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Float (java.lang.Class and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(numberSerializer8);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberClass15);
        org.junit.Assert.assertNotNull(numberJsonSerializer17);
        org.junit.Assert.assertNotNull(numberClass18);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer5.withFilterId((java.lang.Object) intLikeSerializer6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer5.getSchema(serializerProvider8, type9, true);
        java.lang.Class<java.lang.Object> objClass12 = intLikeSerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) objClass12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = intLikeSerializer0.unwrappingSerializer(nameTransformer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass20 = intLikeSerializer19.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = floatSerializer17.getSchema(serializerProvider18, (java.lang.reflect.Type) objClass20, true);
        boolean boolean23 = floatSerializer17.usesObjectId();
        java.lang.Class<java.lang.Object> objClass24 = floatSerializer17.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = floatSerializer17.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = intLikeSerializer27.withFilterId((java.lang.Object) intLikeSerializer28);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = intLikeSerializer27.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = intLikeSerializer32.withFilterId((java.lang.Object) intLikeSerializer33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        java.lang.reflect.Type type36 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = intLikeSerializer32.getSchema(serializerProvider35, type36, true);
        java.lang.Class<java.lang.Object> objClass39 = intLikeSerializer32.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = intLikeSerializer27.getSchema(serializerProvider31, (java.lang.reflect.Type) objClass39);
        boolean boolean41 = floatSerializer17.isEmpty(serializerProvider26, (java.lang.Object) serializerProvider31);
        java.lang.Class<java.lang.Object> objClass42 = floatSerializer17.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = intLikeSerializer0.getSchema(serializerProvider16, (java.lang.reflect.Type) objClass42, true);
        boolean boolean45 = intLikeSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor46 = intLikeSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty48 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = intLikeSerializer0.createContextual(serializerProvider47, beanProperty48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(floatSerializer17);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objClass24);
        org.junit.Assert.assertNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer27);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(objClass39);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objClass42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor46);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        boolean boolean3 = wildcardJsonSerializer2.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = numberSerializer4.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean8 = numberSerializer4.isEmpty(serializerProvider6, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer11 = numberSerializer4.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberJsonSerializer11.isEmpty(serializerProvider12, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberJsonSerializer11.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = wildcardJsonSerializer2.withFilterId((java.lang.Object) numberJsonSerializer11);
        boolean boolean17 = wildcardJsonSerializer2.usesObjectId();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(numberSerializer4);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(numberJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        java.lang.Class<java.lang.Number> numberClass2 = numberSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass3 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.Throwable throwable5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer6.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = numberSerializer6.isEmpty(serializerProvider8, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer6.getDelegatee();
        boolean boolean12 = numberSerializer6.usesObjectId();
        boolean boolean14 = numberSerializer6.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer16 = numberSerializer6.unwrappingSerializer(nameTransformer15);
        boolean boolean17 = numberSerializer6.isUnwrappingSerializer();
        java.lang.Class<java.lang.Number> numberClass18 = numberSerializer6.handledType();
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider4, throwable5, (java.lang.Object) numberClass18, "integer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberClass2);
        org.junit.Assert.assertNotNull(numberClass3);
        org.junit.Assert.assertNotNull(numberSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(numberClass18);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean1 = shortSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = shortSerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = shortSerializer0.handledType();
        boolean boolean4 = shortSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) intLikeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer4.getSchema(serializerProvider8, type9, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = intLikeSerializer4.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass14 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass14, false);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        boolean boolean11 = numberSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer0.handledType();
        boolean boolean14 = numberSerializer0.isEmpty((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer0.getDelegatee();
        boolean boolean9 = intLikeSerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = intLikeSerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = intLikeSerializer0.unwrappingSerializer(nameTransformer11);
        boolean boolean13 = intLikeSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (byte) -1);
        java.lang.Class<java.lang.Number> numberClass7 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer0.handledType();
        boolean boolean11 = numberSerializer0.usesObjectId();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer0.handledType();
        boolean boolean14 = numberSerializer0.isEmpty((java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberClass7);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertNotNull(numberClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) intLikeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer4.getSchema(serializerProvider8, type9, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = intLikeSerializer4.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass14 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass14, false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer18 = numberSerializer0.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = intLikeSerializer19.withFilterId((java.lang.Object) intLikeSerializer20);
        boolean boolean22 = wildcardJsonSerializer21.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer23.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        boolean boolean27 = numberSerializer23.isEmpty(serializerProvider25, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer23.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer30 = numberSerializer23.unwrappingSerializer(nameTransformer29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberJsonSerializer30.isEmpty(serializerProvider31, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberJsonSerializer30.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = wildcardJsonSerializer21.withFilterId((java.lang.Object) numberJsonSerializer30);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer21);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor37 = numberSerializer0.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(numberJsonSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(propertyWriterItor37);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = numberSerializer3.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        boolean boolean7 = numberSerializer3.isEmpty(serializerProvider5, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer3.getDelegatee();
        boolean boolean9 = numberSerializer3.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer3.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer3.getDelegatee();
        boolean boolean12 = numberSerializer3._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = numberSerializer3.properties();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Object) numberSerializer3, jsonGenerator14, serializerProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializer cannot be cast to class java.lang.Short (com.fasterxml.jackson.databind.ser.std.NumberSerializer is in unnamed module of loader 'app'; java.lang.Short is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(numberSerializer3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        boolean boolean2 = numberSerializer0.usesObjectId();
        boolean boolean3 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) 1L, jsonGenerator5, serializerProvider6, typeSerializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass6 = intLikeSerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = floatSerializer3.getSchema(serializerProvider4, (java.lang.reflect.Type) objClass6, true);
        boolean boolean9 = floatSerializer3.usesObjectId();
        java.lang.Class<java.lang.Object> objClass10 = floatSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) objClass10, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = intLikeSerializer14.withFilterId((java.lang.Object) intLikeSerializer15);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = intLikeSerializer14.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer14.getSchema(serializerProvider18, type19, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = intLikeSerializer23.withFilterId((java.lang.Object) intLikeSerializer24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        java.lang.reflect.Type type27 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = intLikeSerializer23.getSchema(serializerProvider26, type27, true);
        java.lang.Class<java.lang.Object> objClass30 = intLikeSerializer23.handledType();
        java.lang.Class<java.lang.Object> objClass31 = intLikeSerializer23.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = intLikeSerializer14.getSchema(serializerProvider22, (java.lang.reflect.Type) objClass31);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = intLikeSerializer34.withFilterId((java.lang.Object) intLikeSerializer35);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = intLikeSerializer34.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        java.lang.reflect.Type type39 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = intLikeSerializer34.getSchema(serializerProvider38, type39, true);
        java.lang.Class<?> wildcardClass42 = intLikeSerializer34.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = intLikeSerializer14.getSchema(serializerProvider33, (java.lang.reflect.Type) wildcardClass42, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = intLikeSerializer46.withFilterId((java.lang.Object) intLikeSerializer47);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        java.lang.reflect.Type type50 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = intLikeSerializer46.getSchema(serializerProvider49, type50, true);
        java.lang.Class<java.lang.Object> objClass53 = intLikeSerializer46.handledType();
        java.lang.Class<java.lang.Object> objClass54 = intLikeSerializer46.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = intLikeSerializer14.getSchema(serializerProvider45, (java.lang.reflect.Type) objClass54);
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = numberSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) objClass54);
        boolean boolean57 = numberSerializer0._isInt;
        java.lang.Class<java.lang.Number> numberClass58 = numberSerializer0.handledType();
        boolean boolean59 = numberSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(floatSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(intLikeSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(objClass30);
        org.junit.Assert.assertNotNull(objClass31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(intLikeSerializer34);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(intLikeSerializer46);
        org.junit.Assert.assertNotNull(intLikeSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(objClass53);
        org.junit.Assert.assertNotNull(objClass54);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(numberClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = numberSerializer0.isEmpty(serializerProvider9, (java.lang.Number) 0);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer0.handledType();
        boolean boolean8 = intLikeSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass9 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer10.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberSerializer10.isEmpty(serializerProvider12, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer10.getDelegatee();
        boolean boolean16 = numberSerializer10.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = numberSerializer10.properties();
        boolean boolean18 = numberSerializer10.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer10.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = intLikeSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = intLikeSerializer22.withFilterId((java.lang.Object) intLikeSerializer23);
        boolean boolean25 = intLikeSerializer23.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = intLikeSerializer23.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = intLikeSerializer28.unwrappingSerializer(nameTransformer29);
        java.lang.Class<?> wildcardClass31 = intLikeSerializer28.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = intLikeSerializer23.getSchema(serializerProvider27, (java.lang.reflect.Type) wildcardClass31);
        boolean boolean33 = intLikeSerializer23.usesObjectId();
        boolean boolean34 = intLikeSerializer0.isEmpty(serializerProvider21, (java.lang.Object) boolean33);
        java.lang.String str35 = intLikeSerializer0._schemaType;
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(intLikeSerializer22);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "integer" + "'", str35, "integer");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) intLikeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer4.getSchema(serializerProvider8, type9, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = intLikeSerializer4.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass14 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass14, false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer18 = numberSerializer0.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = intLikeSerializer19.withFilterId((java.lang.Object) intLikeSerializer20);
        boolean boolean22 = wildcardJsonSerializer21.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer23.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        boolean boolean27 = numberSerializer23.isEmpty(serializerProvider25, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer23.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer30 = numberSerializer23.unwrappingSerializer(nameTransformer29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberJsonSerializer30.isEmpty(serializerProvider31, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberJsonSerializer30.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = wildcardJsonSerializer21.withFilterId((java.lang.Object) numberJsonSerializer30);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer21);
        boolean boolean38 = numberSerializer0.isEmpty((java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(numberJsonSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer12 = numberSerializer10.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = intLikeSerializer14.withFilterId((java.lang.Object) intLikeSerializer15);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = intLikeSerializer14.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer14.getSchema(serializerProvider18, type19, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = intLikeSerializer14.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass24 = intLikeSerializer14.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = numberSerializer10.getSchema(serializerProvider13, (java.lang.reflect.Type) objClass24, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = numberSerializer0.getSchema(serializerProvider9, (java.lang.reflect.Type) objClass24, true);
        java.lang.Class<java.lang.Number> numberClass29 = numberSerializer0.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(numberJsonSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(objClass24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(numberClass29);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        boolean boolean9 = numberSerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        boolean boolean11 = numberSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer7 = numberSerializer0.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = numberJsonSerializer7.isEmpty(serializerProvider8, (java.lang.Number) 100.0f);
        java.lang.Object obj11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = numberJsonSerializer7.withFilterId(obj11);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = numberJsonSerializer7.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer15 = numberJsonSerializer7.unwrappingSerializer(nameTransformer14);
        boolean boolean16 = numberJsonSerializer7.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(numberJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = numberSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 1.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean9 = numberSerializer0.isEmpty(serializerProvider7, (java.lang.Number) 1.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = numberSerializer0.getSchema(serializerProvider10, type11, false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = floatSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) objClass17, true);
        boolean boolean20 = floatSerializer14.usesObjectId();
        java.lang.Class<java.lang.Object> objClass21 = floatSerializer14.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = floatSerializer14.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = floatSerializer14.unwrappingSerializer(nameTransformer24);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer0.withFilterId((java.lang.Object) floatSerializer14);
        boolean boolean27 = floatSerializer14.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(floatSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertNotNull(objJsonSerializer25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = numberSerializer0._isInt;
        java.lang.Class<java.lang.Number> numberClass4 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(numberClass4);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer9.withFilterId((java.lang.Object) intLikeSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = intLikeSerializer9.getSchema(serializerProvider12, type13, true);
        java.lang.Class<java.lang.Object> objClass16 = intLikeSerializer9.handledType();
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass17);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = intLikeSerializer20.withFilterId((java.lang.Object) intLikeSerializer21);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = intLikeSerializer20.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = intLikeSerializer20.getSchema(serializerProvider24, type25, true);
        java.lang.Class<?> wildcardClass28 = intLikeSerializer20.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = intLikeSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass28, true);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = intLikeSerializer0.unwrappingSerializer(nameTransformer31);
        boolean boolean33 = objJsonSerializer32.usesObjectId();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(objJsonSerializer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = numberSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 1.0d);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = intLikeSerializer8.withFilterId((java.lang.Object) intLikeSerializer9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer8.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer13.withFilterId((java.lang.Object) intLikeSerializer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = intLikeSerializer13.getSchema(serializerProvider16, type17, true);
        java.lang.Class<java.lang.Object> objClass20 = intLikeSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer8.getSchema(serializerProvider12, (java.lang.reflect.Type) objClass20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = intLikeSerializer8.unwrappingSerializer(nameTransformer22);
        boolean boolean24 = intLikeSerializer0.isEmpty(serializerProvider7, (java.lang.Object) objJsonSerializer23);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor25 = intLikeSerializer0.properties();
        java.lang.Class<java.lang.Object> objClass26 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = intLikeSerializer0.createContextual(serializerProvider27, beanProperty28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor25);
        org.junit.Assert.assertNotNull(objClass26);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer9.withFilterId((java.lang.Object) intLikeSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = intLikeSerializer9.getSchema(serializerProvider12, type13, true);
        java.lang.Class<java.lang.Object> objClass16 = intLikeSerializer9.handledType();
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = intLikeSerializer0.unwrappingSerializer(nameTransformer19);
        java.lang.Class<java.lang.Object> objClass21 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = intLikeSerializer22.withFilterId((java.lang.Object) intLikeSerializer23);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = intLikeSerializer22.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = intLikeSerializer27.withFilterId((java.lang.Object) intLikeSerializer28);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        java.lang.reflect.Type type31 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = intLikeSerializer27.getSchema(serializerProvider30, type31, true);
        java.lang.Class<java.lang.Object> objClass34 = intLikeSerializer27.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = intLikeSerializer22.getSchema(serializerProvider26, (java.lang.reflect.Type) objClass34);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer36 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer37 = intLikeSerializer22.unwrappingSerializer(nameTransformer36);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer38 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor39 = numberSerializer38.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer38.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = intLikeSerializer22.withFilterId((java.lang.Object) wildcardJsonSerializer40);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer42 = intLikeSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer41);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor43 = intLikeSerializer0.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertNotNull(intLikeSerializer22);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer27);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(objClass34);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(objJsonSerializer37);
        org.junit.Assert.assertNotNull(numberSerializer38);
        org.junit.Assert.assertNotNull(propertyWriterItor39);
        org.junit.Assert.assertNull(wildcardJsonSerializer40);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer41);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer42);
        org.junit.Assert.assertNotNull(propertyWriterItor43);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = numberSerializer0.properties();
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) 10);
        boolean boolean7 = numberSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serialize((java.lang.Number) 0L, jsonGenerator10, serializerProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.Number number12 = null;
        boolean boolean13 = numberSerializer0.isEmpty(serializerProvider11, number12);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = numberSerializer0.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer5 = numberSerializer0.unwrappingSerializer(nameTransformer4);
        boolean boolean6 = numberSerializer0._isInt;
        boolean boolean7 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(numberJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        boolean boolean7 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = intLikeSerializer0.withFilterId((java.lang.Object) 100.0f);
        java.lang.String str10 = intLikeSerializer0._schemaType;
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer" + "'", str10, "integer");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.Throwable throwable3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = intLikeSerializer4.unwrappingSerializer(nameTransformer5);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer4.handledType();
        boolean boolean8 = intLikeSerializer4._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = intLikeSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer10.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberSerializer10.isEmpty(serializerProvider12, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer10.getDelegatee();
        boolean boolean16 = numberSerializer10.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass21 = intLikeSerializer20.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = floatSerializer18.getSchema(serializerProvider19, (java.lang.reflect.Type) objClass21, true);
        boolean boolean24 = floatSerializer18.usesObjectId();
        java.lang.Class<java.lang.Object> objClass25 = floatSerializer18.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = numberSerializer10.getSchema(serializerProvider17, (java.lang.reflect.Type) objClass25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.reflect.Type type28 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = numberSerializer10.getSchema(serializerProvider27, type28, true);
        boolean boolean31 = intLikeSerializer4.isEmpty((java.lang.Object) serializerProvider27);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType32 = intLikeSerializer4._numberType;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.wrapAndThrow(serializerProvider2, throwable3, (java.lang.Object) intLikeSerializer4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objClass25);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + numberType32 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType32.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer9.withFilterId((java.lang.Object) intLikeSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = intLikeSerializer9.getSchema(serializerProvider12, type13, true);
        java.lang.Class<java.lang.Object> objClass16 = intLikeSerializer9.handledType();
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass17);
        boolean boolean19 = intLikeSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = intLikeSerializer21.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = objJsonSerializer23.withFilterId((java.lang.Object) (short) 10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = wildcardJsonSerializer25.getDelegatee();
        boolean boolean27 = intLikeSerializer0.isEmpty(serializerProvider20, (java.lang.Object) wildcardJsonSerializer26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = wildcardJsonSerializer26.isUnwrappingSerializer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNull(wildcardJsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0.usesObjectId();
        java.lang.String str2 = floatSerializer0._schemaType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "number" + "'", str2, "number");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.getDelegatee();
        boolean boolean9 = numberSerializer0._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer12 = numberSerializer0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer13.withFilterId((java.lang.Object) intLikeSerializer14);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = intLikeSerializer13.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = intLikeSerializer18.withFilterId((java.lang.Object) intLikeSerializer19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        java.lang.reflect.Type type22 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = intLikeSerializer18.getSchema(serializerProvider21, type22, true);
        java.lang.Class<java.lang.Object> objClass25 = intLikeSerializer18.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = intLikeSerializer13.getSchema(serializerProvider17, (java.lang.reflect.Type) objClass25);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = intLikeSerializer13.unwrappingSerializer(nameTransformer27);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass33 = intLikeSerializer32.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = floatSerializer30.getSchema(serializerProvider31, (java.lang.reflect.Type) objClass33, true);
        boolean boolean36 = floatSerializer30.usesObjectId();
        java.lang.Class<java.lang.Object> objClass37 = floatSerializer30.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = floatSerializer30.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer40 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer42 = intLikeSerializer40.withFilterId((java.lang.Object) intLikeSerializer41);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer43 = intLikeSerializer40.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = intLikeSerializer45.withFilterId((java.lang.Object) intLikeSerializer46);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        java.lang.reflect.Type type49 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = intLikeSerializer45.getSchema(serializerProvider48, type49, true);
        java.lang.Class<java.lang.Object> objClass52 = intLikeSerializer45.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = intLikeSerializer40.getSchema(serializerProvider44, (java.lang.reflect.Type) objClass52);
        boolean boolean54 = floatSerializer30.isEmpty(serializerProvider39, (java.lang.Object) serializerProvider44);
        java.lang.Class<java.lang.Object> objClass55 = floatSerializer30.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = intLikeSerializer13.getSchema(serializerProvider29, (java.lang.reflect.Type) objClass55, true);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer58 = numberSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) intLikeSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberJsonSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(intLikeSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(objClass25);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(objJsonSerializer28);
        org.junit.Assert.assertNotNull(floatSerializer30);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertNotNull(objClass33);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objClass37);
        org.junit.Assert.assertNull(wildcardJsonSerializer38);
        org.junit.Assert.assertNotNull(intLikeSerializer40);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer42);
        org.junit.Assert.assertNull(wildcardJsonSerializer43);
        org.junit.Assert.assertNotNull(intLikeSerializer45);
        org.junit.Assert.assertNotNull(intLikeSerializer46);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(jsonNode51);
        org.junit.Assert.assertNotNull(objClass52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objClass55);
        org.junit.Assert.assertNotNull(jsonNode57);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0.0f);
        java.lang.Class<java.lang.Number> numberClass5 = numberSerializer0.handledType();
        boolean boolean7 = numberSerializer0.isEmpty((java.lang.Number) 1.0d);
        boolean boolean8 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(numberClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) intLikeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer4.getSchema(serializerProvider8, type9, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = intLikeSerializer4.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass14 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass14, false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer18 = numberSerializer0.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = intLikeSerializer19.withFilterId((java.lang.Object) intLikeSerializer20);
        boolean boolean22 = wildcardJsonSerializer21.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer23.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        boolean boolean27 = numberSerializer23.isEmpty(serializerProvider25, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer23.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer30 = numberSerializer23.unwrappingSerializer(nameTransformer29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberJsonSerializer30.isEmpty(serializerProvider31, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberJsonSerializer30.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = wildcardJsonSerializer21.withFilterId((java.lang.Object) numberJsonSerializer30);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer21);
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer0.handledType();
        boolean boolean38 = numberSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(numberJsonSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(numberClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.getDelegatee();
        boolean boolean5 = numberSerializer0.isEmpty((java.lang.Number) 0L);
        boolean boolean6 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.createContextual(serializerProvider7, beanProperty8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer0.handledType();
        java.lang.Class<java.lang.Object> objClass8 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = intLikeSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass3 = intLikeSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = floatSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) objClass3, true);
        boolean boolean6 = floatSerializer0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass7 = floatSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = floatSerializer0.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass13 = intLikeSerializer12.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = floatSerializer10.getSchema(serializerProvider11, (java.lang.reflect.Type) objClass13, true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) floatSerializer10, jsonGenerator16, serializerProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer cannot be cast to class java.lang.Float (com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer is in unnamed module of loader 'app'; java.lang.Float is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(floatSerializer10);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(objClass13);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.Throwable throwable5 = null;
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.wrapAndThrow(serializerProvider4, throwable5, obj6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = numberJsonSerializer3.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = numberSerializer0.usesObjectId();
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (short) 1);
        boolean boolean7 = numberSerializer0._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        boolean boolean11 = numberSerializer0.isEmpty((java.lang.Number) 0);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = intLikeSerializer0.properties();
        boolean boolean10 = intLikeSerializer0._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = intLikeSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.Throwable throwable13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = numberSerializer14.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        boolean boolean18 = numberSerializer14.isEmpty(serializerProvider16, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = numberSerializer14.getDelegatee();
        boolean boolean20 = numberSerializer14.usesObjectId();
        boolean boolean22 = numberSerializer14.isEmpty((java.lang.Number) 10.0d);
        boolean boolean23 = numberSerializer14.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer14.properties();
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.wrapAndThrow(serializerProvider12, throwable13, (java.lang.Object) propertyWriterItor24, "integer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNotNull(numberSerializer14);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        boolean boolean9 = numberSerializer0._isInt;
        boolean boolean10 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer5.withFilterId((java.lang.Object) intLikeSerializer6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer5.getSchema(serializerProvider8, type9, true);
        java.lang.Class<java.lang.Object> objClass12 = intLikeSerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = intLikeSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) objClass12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = intLikeSerializer0.unwrappingSerializer(nameTransformer14);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = intLikeSerializer16.withFilterId((java.lang.Object) intLikeSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = intLikeSerializer16.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.reflect.Type type21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = intLikeSerializer16.getSchema(serializerProvider20, type21, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = intLikeSerializer16.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = objJsonSerializer15.withFilterId((java.lang.Object) wildcardJsonSerializer24);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = wildcardJsonSerializer25.properties();
        boolean boolean27 = wildcardJsonSerializer25.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass3 = intLikeSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = floatSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) objClass3, true);
        boolean boolean6 = floatSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean9 = floatSerializer0.isEmpty(serializerProvider7, (java.lang.Object) 100.0d);
        java.lang.Class<java.lang.Object> objClass10 = floatSerializer0.handledType();
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        boolean boolean8 = intLikeSerializer0._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = intLikeSerializer0.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer0.getDelegatee();
        boolean boolean9 = intLikeSerializer0.isUnwrappingSerializer();
        java.lang.Object obj10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serializeWithType(obj10, jsonGenerator11, serializerProvider12, typeSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.getDelegatee();
        boolean boolean9 = numberSerializer0._isInt;
        boolean boolean11 = numberSerializer0.isEmpty((java.lang.Number) (short) 0);
        boolean boolean13 = numberSerializer0.isEmpty((java.lang.Number) (short) -1);
        boolean boolean14 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer0.createContextual(serializerProvider4, beanProperty5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) intLikeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = intLikeSerializer4.getSchema(serializerProvider8, type9, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = intLikeSerializer4.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass14 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = numberSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass14, false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer18 = numberSerializer0.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = intLikeSerializer19.withFilterId((java.lang.Object) intLikeSerializer20);
        boolean boolean22 = wildcardJsonSerializer21.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = numberSerializer23.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        boolean boolean27 = numberSerializer23.isEmpty(serializerProvider25, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = numberSerializer23.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer30 = numberSerializer23.unwrappingSerializer(nameTransformer29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberJsonSerializer30.isEmpty(serializerProvider31, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberJsonSerializer30.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = wildcardJsonSerializer21.withFilterId((java.lang.Object) numberJsonSerializer30);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = numberSerializer0.withFilterId((java.lang.Object) wildcardJsonSerializer21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = numberSerializer0.createContextual(serializerProvider37, beanProperty38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(numberJsonSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(numberSerializer23);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(numberJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer9.withFilterId((java.lang.Object) intLikeSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = intLikeSerializer9.getSchema(serializerProvider12, type13, true);
        java.lang.Class<java.lang.Object> objClass16 = intLikeSerializer9.handledType();
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = intLikeSerializer0.unwrappingSerializer(nameTransformer19);
        boolean boolean21 = intLikeSerializer0._isInt;
        boolean boolean22 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass26 = intLikeSerializer25.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = floatSerializer23.getSchema(serializerProvider24, (java.lang.reflect.Type) objClass26, true);
        boolean boolean29 = floatSerializer23.usesObjectId();
        java.lang.Class<java.lang.Object> objClass30 = floatSerializer23.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = floatSerializer23.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = intLikeSerializer33.withFilterId((java.lang.Object) intLikeSerializer34);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = intLikeSerializer33.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer38 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = intLikeSerializer38.withFilterId((java.lang.Object) intLikeSerializer39);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        java.lang.reflect.Type type42 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = intLikeSerializer38.getSchema(serializerProvider41, type42, true);
        java.lang.Class<java.lang.Object> objClass45 = intLikeSerializer38.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = intLikeSerializer33.getSchema(serializerProvider37, (java.lang.reflect.Type) objClass45);
        boolean boolean47 = floatSerializer23.isEmpty(serializerProvider32, (java.lang.Object) serializerProvider37);
        java.lang.Class<java.lang.Object> objClass48 = floatSerializer23.handledType();
        java.lang.String str49 = floatSerializer23._schemaType;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator50 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serialize((java.lang.Object) str49, jsonGenerator50, serializerProvider51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Number (java.lang.String and java.lang.Number are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatSerializer23);
        org.junit.Assert.assertNotNull(intLikeSerializer25);
        org.junit.Assert.assertNotNull(objClass26);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objClass30);
        org.junit.Assert.assertNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertNotNull(intLikeSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer35);
        org.junit.Assert.assertNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNotNull(intLikeSerializer38);
        org.junit.Assert.assertNotNull(intLikeSerializer39);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer40);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(objClass45);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objClass48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "number" + "'", str49, "number");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        boolean boolean7 = numberSerializer0.isEmpty(serializerProvider5, (java.lang.Number) 1L);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) 100, jsonGenerator9, serializerProvider10, typeSerializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.withFilterId((java.lang.Object) intLikeSerializer2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = numberSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        boolean boolean7 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.getDelegatee();
        boolean boolean4 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = numberSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) objClass7);
        boolean boolean9 = numberSerializer0.isUnwrappingSerializer();
        boolean boolean10 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = numberSerializer0.isEmpty(serializerProvider9, (java.lang.Number) 0);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = numberSerializer12.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer15 = numberSerializer12.unwrappingSerializer(nameTransformer14);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer0.withFilterId((java.lang.Object) nameTransformer14);
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer0.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberSerializer12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertNotNull(numberJsonSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(numberClass17);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0.0f);
        java.lang.Class<java.lang.Number> numberClass5 = numberSerializer0.handledType();
        boolean boolean7 = numberSerializer0.isEmpty((java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(numberClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer0.handledType();
        boolean boolean8 = intLikeSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass9 = intLikeSerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = intLikeSerializer0.properties();
        boolean boolean11 = intLikeSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = intLikeSerializer0.unwrappingSerializer(nameTransformer12);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer9.withFilterId((java.lang.Object) intLikeSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = intLikeSerializer9.getSchema(serializerProvider12, type13, true);
        java.lang.Class<java.lang.Object> objClass16 = intLikeSerializer9.handledType();
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = intLikeSerializer0.unwrappingSerializer(nameTransformer19);
        boolean boolean21 = intLikeSerializer0._isInt;
        boolean boolean22 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor25 = numberSerializer24.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        boolean boolean28 = numberSerializer24.isEmpty(serializerProvider26, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = numberSerializer24.getDelegatee();
        boolean boolean30 = numberSerializer24.usesObjectId();
        boolean boolean32 = numberSerializer24.isEmpty((java.lang.Number) 10.0d);
        boolean boolean33 = numberSerializer24._isInt;
        boolean boolean34 = numberSerializer24._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer35 = numberSerializer24.getDelegatee();
        boolean boolean36 = intLikeSerializer0.isEmpty(serializerProvider23, (java.lang.Object) numberSerializer24);
        java.lang.Class<java.lang.Number> numberClass37 = numberSerializer24.handledType();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(numberSerializer24);
        org.junit.Assert.assertNotNull(propertyWriterItor25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(numberClass37);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer6.withFilterId((java.lang.Object) intLikeSerializer7);
        boolean boolean9 = wildcardJsonSerializer8.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer10.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberSerializer10.isEmpty(serializerProvider12, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer10.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer17 = numberSerializer10.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        boolean boolean20 = numberJsonSerializer17.isEmpty(serializerProvider18, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberJsonSerializer17.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = wildcardJsonSerializer8.withFilterId((java.lang.Object) numberJsonSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer26 = numberSerializer0.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        boolean boolean29 = numberSerializer0.isEmpty(serializerProvider27, (java.lang.Number) 10.0d);
        java.lang.Class<java.lang.Number> numberClass30 = numberSerializer0.handledType();
        boolean boolean32 = numberSerializer0.isEmpty((java.lang.Number) 100.0d);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor34 = numberSerializer33.properties();
        boolean boolean36 = numberSerializer33.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        java.lang.reflect.Type type38 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = numberSerializer33.getSchema(serializerProvider37, type38, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        java.lang.reflect.Type type42 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = numberSerializer33.getSchema(serializerProvider41, type42, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer0.withFilterId((java.lang.Object) type42);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(intLikeSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(numberJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberJsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(numberClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(numberSerializer33);
        org.junit.Assert.assertNotNull(propertyWriterItor34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer0.getDelegatee();
        java.lang.String str9 = intLikeSerializer0._schemaType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer10 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass15 = intLikeSerializer14.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) objClass15, true);
        boolean boolean18 = floatSerializer12.usesObjectId();
        java.lang.Class<java.lang.Object> objClass19 = floatSerializer12.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = shortSerializer10.getSchema(serializerProvider11, (java.lang.reflect.Type) objClass19, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType22 = shortSerializer10._numberType;
        java.lang.Class<java.lang.Object> objClass23 = shortSerializer10.handledType();
        boolean boolean24 = intLikeSerializer0.isEmpty((java.lang.Object) shortSerializer10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = intLikeSerializer25.withFilterId((java.lang.Object) intLikeSerializer26);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        java.lang.reflect.Type type29 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = intLikeSerializer25.getSchema(serializerProvider28, type29, true);
        java.lang.Class<java.lang.Object> objClass32 = intLikeSerializer25.handledType();
        boolean boolean33 = intLikeSerializer25.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass34 = intLikeSerializer25.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor36 = numberSerializer35.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = null;
        boolean boolean39 = numberSerializer35.isEmpty(serializerProvider37, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer40 = numberSerializer35.getDelegatee();
        boolean boolean41 = numberSerializer35.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor42 = numberSerializer35.properties();
        boolean boolean43 = numberSerializer35.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer44 = numberSerializer35.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = intLikeSerializer25.withFilterId((java.lang.Object) wildcardJsonSerializer44);
        java.lang.Object obj46 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = wildcardJsonSerializer45.withFilterId(obj46);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor48 = wildcardJsonSerializer45.properties();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider50 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer10.serialize((java.lang.Object) propertyWriterItor48, jsonGenerator49, serializerProvider50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Collections$EmptyIterator cannot be cast to class java.lang.Short (java.util.Collections$EmptyIterator and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "integer" + "'", str9, "integer");
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objClass19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + numberType22 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType22.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(objClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objClass34);
        org.junit.Assert.assertNotNull(numberSerializer35);
        org.junit.Assert.assertNotNull(propertyWriterItor36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer44);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(propertyWriterItor48);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = numberSerializer0.properties();
        boolean boolean5 = numberSerializer0.isUnwrappingSerializer();
        boolean boolean7 = numberSerializer0.isEmpty((java.lang.Number) (byte) -1);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (byte) -1);
        java.lang.Class<java.lang.Number> numberClass7 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer11 = numberJsonSerializer9.unwrappingSerializer(nameTransformer10);
        boolean boolean13 = numberJsonSerializer9.isEmpty((java.lang.Number) (byte) 10);
        java.lang.Object obj14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberJsonSerializer9.withFilterId(obj14);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = intLikeSerializer16.withFilterId((java.lang.Object) intLikeSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = intLikeSerializer16.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.reflect.Type type21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = intLikeSerializer16.getSchema(serializerProvider20, type21, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = intLikeSerializer25.withFilterId((java.lang.Object) intLikeSerializer26);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        java.lang.reflect.Type type29 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = intLikeSerializer25.getSchema(serializerProvider28, type29, true);
        java.lang.Class<java.lang.Object> objClass32 = intLikeSerializer25.handledType();
        java.lang.Class<java.lang.Object> objClass33 = intLikeSerializer25.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = intLikeSerializer16.getSchema(serializerProvider24, (java.lang.reflect.Type) objClass33);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = intLikeSerializer16.unwrappingSerializer(nameTransformer35);
        boolean boolean37 = intLikeSerializer16._isInt;
        boolean boolean38 = intLikeSerializer16.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer40 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor41 = numberSerializer40.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        boolean boolean44 = numberSerializer40.isEmpty(serializerProvider42, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = numberSerializer40.getDelegatee();
        boolean boolean46 = numberSerializer40.usesObjectId();
        boolean boolean48 = numberSerializer40.isEmpty((java.lang.Number) 10.0d);
        boolean boolean49 = numberSerializer40._isInt;
        boolean boolean50 = numberSerializer40._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = numberSerializer40.getDelegatee();
        boolean boolean52 = intLikeSerializer16.isEmpty(serializerProvider39, (java.lang.Object) numberSerializer40);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer53 = wildcardJsonSerializer15.withFilterId((java.lang.Object) numberSerializer40);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberClass7);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertNotNull(numberJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(intLikeSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(objClass32);
        org.junit.Assert.assertNotNull(objClass33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(numberSerializer40);
        org.junit.Assert.assertNotNull(propertyWriterItor41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer53);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass5 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass5, true);
        boolean boolean8 = floatSerializer2.usesObjectId();
        java.lang.Class<java.lang.Object> objClass9 = floatSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) objClass9, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType12 = shortSerializer0._numberType;
        boolean boolean13 = shortSerializer0._isInt;
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + numberType12 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType12.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = numberSerializer0.properties();
        boolean boolean5 = numberSerializer0.usesObjectId();
        boolean boolean7 = numberSerializer0.isEmpty((java.lang.Number) (short) 1);
        boolean boolean8 = numberSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = intLikeSerializer0.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = intLikeSerializer0.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = intLikeSerializer0._numberType;
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertTrue("'" + numberType6 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType6.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.getDelegatee();
        boolean boolean9 = numberSerializer0._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = numberSerializer0.getSchema(serializerProvider4, type5, false);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass9 = numberSerializer0.handledType();
        boolean boolean10 = numberSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNotNull(numberClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean1 = shortSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = shortSerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) intLikeSerializer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer9.withFilterId((java.lang.Object) intLikeSerializer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        java.lang.reflect.Type type13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = intLikeSerializer9.getSchema(serializerProvider12, type13, true);
        java.lang.Class<java.lang.Object> objClass16 = intLikeSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = intLikeSerializer4.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = intLikeSerializer4.unwrappingSerializer(nameTransformer18);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = intLikeSerializer20.withFilterId((java.lang.Object) intLikeSerializer21);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = intLikeSerializer20.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = intLikeSerializer20.getSchema(serializerProvider24, type25, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = intLikeSerializer20.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = objJsonSerializer19.withFilterId((java.lang.Object) wildcardJsonSerializer28);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Object) objJsonSerializer19, jsonGenerator30, serializerProvider31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer cannot be cast to class java.lang.Short (com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer is in unnamed module of loader 'app'; java.lang.Short is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(objJsonSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = numberSerializer0.usesObjectId();
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (short) 1);
        boolean boolean7 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean12 = floatSerializer11.usesObjectId();
        java.lang.String str13 = floatSerializer11._schemaType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = floatSerializer11.unwrappingSerializer(nameTransformer14);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = floatSerializer11.unwrappingSerializer(nameTransformer16);
        boolean boolean18 = floatSerializer11.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass19 = floatSerializer11.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = numberSerializer0.getSchema(serializerProvider10, (java.lang.reflect.Type) objClass19);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertNotNull(floatSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "number" + "'", str13, "number");
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objClass19);
        org.junit.Assert.assertNotNull(jsonNode20);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = intLikeSerializer0.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.getDelegatee();
        boolean boolean9 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.getDelegatee();
        boolean boolean9 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass16 = intLikeSerializer15.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = floatSerializer13.getSchema(serializerProvider14, (java.lang.reflect.Type) objClass16, true);
        boolean boolean19 = floatSerializer13.usesObjectId();
        java.lang.Class<java.lang.Object> objClass20 = floatSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = shortSerializer11.getSchema(serializerProvider12, (java.lang.reflect.Type) objClass20, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = numberSerializer0.getSchema(serializerProvider10, (java.lang.reflect.Type) objClass20, false);
        boolean boolean26 = numberSerializer0.isEmpty((java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatSerializer13);
        org.junit.Assert.assertNotNull(intLikeSerializer15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        boolean boolean12 = numberSerializer0.isEmpty((java.lang.Number) (byte) -1);
        boolean boolean13 = numberSerializer0._isInt;
        boolean boolean14 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serializeWithType((java.lang.Number) (short) 10, jsonGenerator16, serializerProvider17, typeSerializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = intLikeSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = intLikeSerializer0.createContextual(serializerProvider3, beanProperty4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass5 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass5, true);
        boolean boolean8 = floatSerializer2.usesObjectId();
        java.lang.Class<java.lang.Object> objClass9 = floatSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) objClass9, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType12 = shortSerializer0._numberType;
        java.lang.String str13 = shortSerializer0._schemaType;
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + numberType12 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType12.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "number" + "'", str13, "number");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean1 = shortSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = intLikeSerializer3.withFilterId((java.lang.Object) intLikeSerializer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer3.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.reflect.Type type8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer3.getSchema(serializerProvider7, type8, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = intLikeSerializer3.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass13 = intLikeSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = shortSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) objClass13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(objClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = numberSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 1.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean9 = numberSerializer0.isEmpty(serializerProvider7, (java.lang.Number) 1.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = numberSerializer0.getSchema(serializerProvider10, type11, false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass17 = intLikeSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = floatSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) objClass17, true);
        boolean boolean20 = floatSerializer14.usesObjectId();
        java.lang.Class<java.lang.Object> objClass21 = floatSerializer14.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = floatSerializer14.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = floatSerializer14.unwrappingSerializer(nameTransformer24);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer26 = numberSerializer0.withFilterId((java.lang.Object) floatSerializer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor29 = numberSerializer28.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = numberSerializer28.withFilterId((java.lang.Object) intLikeSerializer30);
        java.lang.Class<java.lang.Number> numberClass32 = numberSerializer28.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = floatSerializer14.getSchema(serializerProvider27, (java.lang.reflect.Type) numberClass32);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(floatSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(objClass17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertNotNull(objJsonSerializer25);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer26);
        org.junit.Assert.assertNotNull(numberSerializer28);
        org.junit.Assert.assertNotNull(propertyWriterItor29);
        org.junit.Assert.assertNotNull(intLikeSerializer30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(numberClass32);
        org.junit.Assert.assertNotNull(jsonNode33);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean7 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = numberSerializer0.isEmpty(serializerProvider8, (java.lang.Number) 1.0d);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer7 = numberSerializer0.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = numberJsonSerializer7.isEmpty(serializerProvider8, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer12 = numberJsonSerializer7.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        boolean boolean15 = numberJsonSerializer7.isEmpty(serializerProvider13, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0.usesObjectId();
        java.lang.String str2 = floatSerializer0._schemaType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = floatSerializer0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = floatSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = floatSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass8 = floatSerializer0.handledType();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = floatSerializer0._numberType;
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "number" + "'", str2, "number");
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + numberType9 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT + "'", numberType9.equals(com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = floatSerializer0.properties();
        boolean boolean2 = floatSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = intLikeSerializer3.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer5.withFilterId((java.lang.Object) (short) 10);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) objJsonSerializer5, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer cannot be cast to class java.lang.Float (com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer is in unnamed module of loader 'app'; java.lang.Float is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        boolean boolean3 = numberSerializer0.usesObjectId();
        boolean boolean4 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer6 = numberSerializer0.unwrappingSerializer(nameTransformer5);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer6);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        boolean boolean3 = intLikeSerializer1.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = intLikeSerializer1.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = intLikeSerializer6.unwrappingSerializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = intLikeSerializer6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer1.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass9);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = numberSerializer11.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        boolean boolean15 = numberSerializer11.isEmpty(serializerProvider13, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberSerializer11.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer18 = numberSerializer11.unwrappingSerializer(nameTransformer17);
        boolean boolean19 = intLikeSerializer1.isEmpty((java.lang.Object) numberJsonSerializer18);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = intLikeSerializer1.createContextual(serializerProvider20, beanProperty21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(numberSerializer11);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(numberJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer6.withFilterId((java.lang.Object) intLikeSerializer7);
        boolean boolean9 = wildcardJsonSerializer8.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer10.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberSerializer10.isEmpty(serializerProvider12, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer10.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer17 = numberSerializer10.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        boolean boolean20 = numberJsonSerializer17.isEmpty(serializerProvider18, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberJsonSerializer17.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = wildcardJsonSerializer8.withFilterId((java.lang.Object) numberJsonSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer26 = numberSerializer0.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        boolean boolean29 = numberSerializer0.isEmpty(serializerProvider27, (java.lang.Number) 10.0d);
        java.lang.Class<java.lang.Number> numberClass30 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberSerializer0.isEmpty(serializerProvider31, (java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(intLikeSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(numberJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNull(wildcardJsonSerializer24);
        org.junit.Assert.assertNotNull(numberJsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(numberClass30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        boolean boolean9 = numberSerializer0._isInt;
        boolean boolean10 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer0.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer15 = numberJsonSerializer13.unwrappingSerializer(nameTransformer14);
        boolean boolean16 = numberJsonSerializer13.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
        org.junit.Assert.assertNotNull(numberJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        boolean boolean11 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer0.unwrappingSerializer(nameTransformer12);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer7 = numberSerializer0.unwrappingSerializer(nameTransformer6);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer0.properties();
        boolean boolean9 = numberSerializer0.usesObjectId();
        java.lang.Class<java.lang.Number> numberClass10 = numberSerializer0.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberJsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberClass10);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        boolean boolean11 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = numberSerializer0.getDelegatee();
        boolean boolean13 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = numberSerializer0.isEmpty(serializerProvider14, (java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer6.withFilterId((java.lang.Object) intLikeSerializer7);
        boolean boolean9 = wildcardJsonSerializer8.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer10.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberSerializer10.isEmpty(serializerProvider12, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer10.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer17 = numberSerializer10.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        boolean boolean20 = numberJsonSerializer17.isEmpty(serializerProvider18, (java.lang.Number) 100.0f);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = numberJsonSerializer17.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = wildcardJsonSerializer8.withFilterId((java.lang.Object) numberJsonSerializer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = numberSerializer0.withFilterId((java.lang.Object) numberJsonSerializer17);
        java.lang.Class<java.lang.Number> numberClass24 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean27 = floatSerializer26.usesObjectId();
        java.lang.String str28 = floatSerializer26._schemaType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = floatSerializer26.unwrappingSerializer(nameTransformer29);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = floatSerializer26.unwrappingSerializer(nameTransformer31);
        boolean boolean33 = floatSerializer26.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass34 = floatSerializer26.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = numberSerializer0.getSchema(serializerProvider25, (java.lang.reflect.Type) objClass34);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(intLikeSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(numberJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertNotNull(floatSerializer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "number" + "'", str28, "number");
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(objJsonSerializer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objClass34);
        org.junit.Assert.assertNotNull(jsonNode35);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer3 = numberSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(numberJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = shortSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer2.usesObjectId();
        boolean boolean4 = objJsonSerializer2.usesObjectId();
        boolean boolean5 = objJsonSerializer2.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.getDelegatee();
        boolean boolean4 = numberSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = numberSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) objClass7);
        boolean boolean9 = numberSerializer0._isInt;
        boolean boolean10 = numberSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serialize((java.lang.Number) (-1L), jsonGenerator10, serializerProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass8 = numberSerializer0.handledType();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(numberClass8);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = numberSerializer0.getSchema(serializerProvider4, type5, false);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer0.properties();
        boolean boolean9 = numberSerializer0.usesObjectId();
        boolean boolean10 = numberSerializer0.isUnwrappingSerializer();
        boolean boolean11 = numberSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = intLikeSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = intLikeSerializer0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer5.withFilterId((java.lang.Object) intLikeSerializer6);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer5.getDelegatee();
        java.lang.Object obj9 = null;
        boolean boolean10 = intLikeSerializer5.isEmpty(obj9);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType11 = intLikeSerializer5._numberType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = intLikeSerializer5.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serialize((java.lang.Object) objJsonSerializer13, jsonGenerator14, serializerProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer cannot be cast to class java.lang.Number (com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer is in unnamed module of loader 'app'; java.lang.Number is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + numberType11 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType11.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objJsonSerializer13);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (byte) -1);
        java.lang.Class<java.lang.Number> numberClass7 = numberSerializer0.handledType();
        boolean boolean8 = numberSerializer0._isInt;
        boolean boolean9 = numberSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = numberSerializer0.isEmpty(serializerProvider8, (java.lang.Number) 10.0d);
        boolean boolean11 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = numberSerializer0.getSchema(serializerProvider4, type5, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = numberSerializer0.getSchema(serializerProvider8, type9, false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer0.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer15 = numberSerializer0.unwrappingSerializer(nameTransformer14);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
        org.junit.Assert.assertNotNull(numberJsonSerializer15);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0.usesObjectId();
        java.lang.String str2 = floatSerializer0._schemaType;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serializeWithType((java.lang.Object) (byte) 100, jsonGenerator4, serializerProvider5, typeSerializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "number" + "'", str2, "number");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = intLikeSerializer8.withFilterId((java.lang.Object) intLikeSerializer9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer8.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer13.withFilterId((java.lang.Object) intLikeSerializer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = intLikeSerializer13.getSchema(serializerProvider16, type17, true);
        java.lang.Class<java.lang.Object> objClass20 = intLikeSerializer13.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer8.getSchema(serializerProvider12, (java.lang.reflect.Type) objClass20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = intLikeSerializer8.unwrappingSerializer(nameTransformer22);
        boolean boolean24 = intLikeSerializer0.isEmpty(serializerProvider7, (java.lang.Object) objJsonSerializer23);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor25 = intLikeSerializer0.properties();
        java.lang.Class<java.lang.Object> objClass26 = intLikeSerializer0.handledType();
        boolean boolean27 = intLikeSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer29 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor30 = numberSerializer29.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = numberSerializer29.isEmpty(serializerProvider31, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = numberSerializer29.getDelegatee();
        boolean boolean35 = numberSerializer29.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor36 = numberSerializer29.properties();
        boolean boolean37 = numberSerializer29.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer40 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer41 = numberSerializer39.unwrappingSerializer(nameTransformer40);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer44 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer45 = intLikeSerializer43.withFilterId((java.lang.Object) intLikeSerializer44);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = intLikeSerializer43.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        java.lang.reflect.Type type48 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = intLikeSerializer43.getSchema(serializerProvider47, type48, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer52 = intLikeSerializer43.withFilterId((java.lang.Object) (-1.0d));
        java.lang.Class<java.lang.Object> objClass53 = intLikeSerializer43.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = numberSerializer39.getSchema(serializerProvider42, (java.lang.reflect.Type) objClass53, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = numberSerializer29.getSchema(serializerProvider38, (java.lang.reflect.Type) objClass53, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = intLikeSerializer0.getSchema(serializerProvider28, (java.lang.reflect.Type) objClass53);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(objClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor25);
        org.junit.Assert.assertNotNull(objClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(numberSerializer29);
        org.junit.Assert.assertNotNull(propertyWriterItor30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(numberSerializer39);
        org.junit.Assert.assertNotNull(numberJsonSerializer41);
        org.junit.Assert.assertNotNull(intLikeSerializer43);
        org.junit.Assert.assertNotNull(intLikeSerializer44);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer45);
        org.junit.Assert.assertNull(wildcardJsonSerializer46);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer52);
        org.junit.Assert.assertNotNull(objClass53);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(jsonNode57);
        org.junit.Assert.assertNotNull(jsonNode58);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        boolean boolean9 = numberSerializer0._isInt;
        boolean boolean10 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer13 = numberSerializer0.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = numberJsonSerializer13.isEmpty(serializerProvider14, (java.lang.Number) 100);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(numberJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = intLikeSerializer0.withFilterId((java.lang.Object) (-1.0d));
        boolean boolean10 = wildcardJsonSerializer9.usesObjectId();
        boolean boolean11 = wildcardJsonSerializer9.usesObjectId();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass5 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass5, true);
        boolean boolean8 = floatSerializer2.usesObjectId();
        java.lang.Class<java.lang.Object> objClass9 = floatSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) objClass9, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType12 = shortSerializer0._numberType;
        java.lang.Class<java.lang.Object> objClass13 = shortSerializer0.handledType();
        java.lang.Class<java.lang.Object> objClass14 = shortSerializer0.handledType();
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + numberType12 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType12.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass13);
        org.junit.Assert.assertNotNull(objClass14);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = numberSerializer0.isEmpty(serializerProvider9, (java.lang.Number) 1);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = numberSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 1.0d);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean9 = numberSerializer0.isEmpty(serializerProvider7, (java.lang.Number) 1.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = numberSerializer0.getSchema(serializerProvider10, type11, false);
        java.lang.Class<?> wildcardClass14 = jsonNode13.getClass();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = numberSerializer1.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        boolean boolean5 = numberSerializer1.isEmpty(serializerProvider3, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = numberSerializer1.getDelegatee();
        boolean boolean7 = numberSerializer1.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass12 = intLikeSerializer11.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = floatSerializer9.getSchema(serializerProvider10, (java.lang.reflect.Type) objClass12, true);
        boolean boolean15 = floatSerializer9.usesObjectId();
        java.lang.Class<java.lang.Object> objClass16 = floatSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = numberSerializer1.getSchema(serializerProvider8, (java.lang.reflect.Type) objClass16);
        boolean boolean18 = numberSerializer1._isInt;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Object) boolean18, jsonGenerator19, serializerProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.Short (java.lang.Boolean and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = intLikeSerializer0.unwrappingSerializer(nameTransformer1);
        java.lang.Class<java.lang.Object> objClass3 = intLikeSerializer0.handledType();
        boolean boolean4 = intLikeSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer6.withFilterId((java.lang.Object) intLikeSerializer7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = intLikeSerializer7.withFilterId((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass11 = wildcardJsonSerializer10.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = intLikeSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass11);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = intLikeSerializer0.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(intLikeSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer2 = numberSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = numberSerializer0._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        boolean boolean7 = numberSerializer0.isEmpty(serializerProvider5, (java.lang.Number) (byte) 1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer0.createContextual(serializerProvider8, beanProperty9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(numberJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        boolean boolean8 = numberSerializer0.isEmpty((java.lang.Number) 10.0d);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer10 = numberSerializer0.unwrappingSerializer(nameTransformer9);
        boolean boolean11 = numberSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Number> numberClass12 = numberSerializer0.handledType();
        boolean boolean13 = numberSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean1 = shortSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = intLikeSerializer4.withFilterId((java.lang.Object) intLikeSerializer5);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        java.lang.reflect.Type type8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer4.getSchema(serializerProvider7, type8, true);
        java.lang.Class<java.lang.Object> objClass11 = intLikeSerializer4.handledType();
        boolean boolean12 = intLikeSerializer4.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass13 = intLikeSerializer4.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = shortSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) objClass13, false);
        java.lang.Class<java.lang.Object> objClass16 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = intLikeSerializer19.withFilterId((java.lang.Object) 100L);
        boolean boolean22 = wildcardJsonSerializer21.isUnwrappingSerializer();
        boolean boolean23 = intLikeSerializer17.isEmpty(serializerProvider18, (java.lang.Object) wildcardJsonSerializer21);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = intLikeSerializer17.unwrappingSerializer(nameTransformer24);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Object) nameTransformer24, jsonGenerator26, serializerProvider27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer6);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objClass13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer25);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider10, type11);
        boolean boolean13 = numberSerializer0._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = numberSerializer0.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer0.handledType();
        java.lang.Class<java.lang.Object> objClass8 = intLikeSerializer0.handledType();
        boolean boolean9 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer10.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberSerializer10.isEmpty(serializerProvider12, (java.lang.Number) 0L);
        boolean boolean16 = numberSerializer10.isEmpty((java.lang.Number) (byte) -1);
        java.lang.Class<java.lang.Number> numberClass17 = numberSerializer10.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer19 = numberSerializer10.unwrappingSerializer(nameTransformer18);
        java.lang.Class<java.lang.Number> numberClass20 = numberSerializer10.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serialize((java.lang.Object) numberClass20, jsonGenerator21, serializerProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Number (java.lang.Class and java.lang.Number are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(objClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(numberClass17);
        org.junit.Assert.assertNotNull(numberJsonSerializer19);
        org.junit.Assert.assertNotNull(numberClass20);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass6 = intLikeSerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = floatSerializer3.getSchema(serializerProvider4, (java.lang.reflect.Type) objClass6, true);
        boolean boolean9 = floatSerializer3.usesObjectId();
        java.lang.Class<java.lang.Object> objClass10 = floatSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) objClass10, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = intLikeSerializer14.withFilterId((java.lang.Object) intLikeSerializer15);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = intLikeSerializer14.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer14.getSchema(serializerProvider18, type19, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = intLikeSerializer23.withFilterId((java.lang.Object) intLikeSerializer24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        java.lang.reflect.Type type27 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = intLikeSerializer23.getSchema(serializerProvider26, type27, true);
        java.lang.Class<java.lang.Object> objClass30 = intLikeSerializer23.handledType();
        java.lang.Class<java.lang.Object> objClass31 = intLikeSerializer23.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = intLikeSerializer14.getSchema(serializerProvider22, (java.lang.reflect.Type) objClass31);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = intLikeSerializer34.withFilterId((java.lang.Object) intLikeSerializer35);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = intLikeSerializer34.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        java.lang.reflect.Type type39 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = intLikeSerializer34.getSchema(serializerProvider38, type39, true);
        java.lang.Class<?> wildcardClass42 = intLikeSerializer34.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = intLikeSerializer14.getSchema(serializerProvider33, (java.lang.reflect.Type) wildcardClass42, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = intLikeSerializer46.withFilterId((java.lang.Object) intLikeSerializer47);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        java.lang.reflect.Type type50 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = intLikeSerializer46.getSchema(serializerProvider49, type50, true);
        java.lang.Class<java.lang.Object> objClass53 = intLikeSerializer46.handledType();
        java.lang.Class<java.lang.Object> objClass54 = intLikeSerializer46.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = intLikeSerializer14.getSchema(serializerProvider45, (java.lang.reflect.Type) objClass54);
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = numberSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) objClass54);
        boolean boolean57 = numberSerializer0._isInt;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor58 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor59 = numberSerializer0.properties();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(floatSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(intLikeSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(objClass30);
        org.junit.Assert.assertNotNull(objClass31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(intLikeSerializer34);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(intLikeSerializer46);
        org.junit.Assert.assertNotNull(intLikeSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(objClass53);
        org.junit.Assert.assertNotNull(objClass54);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor58);
        org.junit.Assert.assertNotNull(propertyWriterItor59);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        boolean boolean3 = numberSerializer0._isInt;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serialize((java.lang.Number) 10.0f, jsonGenerator5, serializerProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer7 = numberSerializer0.unwrappingSerializer(nameTransformer6);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = numberSerializer0.getDelegatee();
        boolean boolean12 = numberSerializer0.isEmpty((java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberJsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = numberSerializer0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = numberSerializer0.properties();
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) 10);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = intLikeSerializer7.withFilterId((java.lang.Object) intLikeSerializer8);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = intLikeSerializer7.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = intLikeSerializer7.getSchema(serializerProvider11, type12, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = intLikeSerializer7.getDelegatee();
        java.lang.String str16 = intLikeSerializer7._schemaType;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer17 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass22 = intLikeSerializer21.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = floatSerializer19.getSchema(serializerProvider20, (java.lang.reflect.Type) objClass22, true);
        boolean boolean25 = floatSerializer19.usesObjectId();
        java.lang.Class<java.lang.Object> objClass26 = floatSerializer19.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = shortSerializer17.getSchema(serializerProvider18, (java.lang.reflect.Type) objClass26, true);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType29 = shortSerializer17._numberType;
        java.lang.Class<java.lang.Object> objClass30 = shortSerializer17.handledType();
        boolean boolean31 = intLikeSerializer7.isEmpty((java.lang.Object) shortSerializer17);
        java.lang.Class<java.lang.Object> objClass32 = shortSerializer17.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer33 = numberSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) shortSerializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer7);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "integer" + "'", str16, "integer");
        org.junit.Assert.assertNotNull(floatSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(objClass22);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objClass26);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + numberType29 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType29.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objClass32);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        java.lang.Object obj4 = null;
        boolean boolean5 = intLikeSerializer0.isEmpty(obj4);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = intLikeSerializer0._numberType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = intLikeSerializer0.unwrappingSerializer(nameTransformer7);
        boolean boolean9 = objJsonSerializer8.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = objJsonSerializer8.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = objJsonSerializer8.unwrappingSerializer(nameTransformer11);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + numberType6 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType6.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.withFilterId((java.lang.Object) intLikeSerializer2);
        boolean boolean4 = intLikeSerializer2.isUnwrappingSerializer();
        java.lang.Class<?> wildcardClass5 = intLikeSerializer2.getClass();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = intLikeSerializer0.unwrappingSerializer(nameTransformer8);
        java.lang.Class<java.lang.Object> objClass10 = intLikeSerializer0.handledType();
        java.lang.Class<?> wildcardClass11 = intLikeSerializer0.getClass();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) 100L);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = intLikeSerializer0.createContextual(serializerProvider3, beanProperty4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0.usesObjectId();
        java.lang.String str2 = floatSerializer0._schemaType;
        boolean boolean3 = floatSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType4 = floatSerializer0._numberType;
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "number" + "'", str2, "number");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + numberType4 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT + "'", numberType4.equals(com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        boolean boolean1 = floatSerializer0.usesObjectId();
        java.lang.String str2 = floatSerializer0._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = numberSerializer4.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean8 = numberSerializer4.isEmpty(serializerProvider6, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer4.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer11 = numberSerializer4.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberJsonSerializer11.isEmpty(serializerProvider12, (java.lang.Number) 100.0f);
        java.lang.Object obj15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = numberJsonSerializer11.withFilterId(obj15);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = numberJsonSerializer11.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer19 = numberJsonSerializer11.unwrappingSerializer(nameTransformer18);
        boolean boolean21 = numberJsonSerializer19.isEmpty((java.lang.Number) 0.0d);
        boolean boolean22 = floatSerializer0.isEmpty(serializerProvider3, (java.lang.Object) numberJsonSerializer19);
        boolean boolean23 = floatSerializer0._isInt;
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "number" + "'", str2, "number");
        org.junit.Assert.assertNotNull(numberSerializer4);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(numberJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(numberJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer7 = numberSerializer0.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean10 = numberJsonSerializer7.isEmpty(serializerProvider8, (java.lang.Number) (short) -1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = numberJsonSerializer7.getDelegatee();
        boolean boolean12 = numberJsonSerializer7.usesObjectId();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(numberJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.withFilterId((java.lang.Object) intLikeSerializer2);
        boolean boolean4 = intLikeSerializer2.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass5 = intLikeSerializer2.handledType();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = intLikeSerializer2._numberType;
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer2.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass5);
        org.junit.Assert.assertTrue("'" + numberType6 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType6.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = intLikeSerializer0.getSchema(serializerProvider4, type5, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = intLikeSerializer0.getDelegatee();
        boolean boolean9 = intLikeSerializer0.isUnwrappingSerializer();
        boolean boolean11 = intLikeSerializer0.isEmpty((java.lang.Object) 1.0d);
        boolean boolean12 = intLikeSerializer0.isUnwrappingSerializer();
        java.lang.String str13 = intLikeSerializer0._schemaType;
        boolean boolean14 = intLikeSerializer0.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = intLikeSerializer0._numberType;
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "integer" + "'", str13, "integer");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + numberType15 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType15.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.withFilterId((java.lang.Object) intLikeSerializer2);
        boolean boolean4 = numberSerializer0.isUnwrappingSerializer();
        java.lang.Class<?> wildcardClass5 = numberSerializer0.getClass();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        boolean boolean11 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberSerializer0.isEmpty(serializerProvider12, (java.lang.Number) (byte) 0);
        java.lang.Class<java.lang.Number> numberClass15 = numberSerializer0.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serialize((java.lang.Number) 10, jsonGenerator17, serializerProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberClass15);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = intLikeSerializer0.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer9.getClass();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = numberSerializer0.getDelegatee();
        boolean boolean6 = numberSerializer0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = numberSerializer0.properties();
        boolean boolean8 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = numberSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = numberSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass11 = numberSerializer0.handledType();
        boolean boolean12 = numberSerializer0._isInt;
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = numberSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass6 = intLikeSerializer5.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = floatSerializer3.getSchema(serializerProvider4, (java.lang.reflect.Type) objClass6, true);
        boolean boolean9 = floatSerializer3.usesObjectId();
        java.lang.Class<java.lang.Object> objClass10 = floatSerializer3.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = numberSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) objClass10, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = intLikeSerializer14.withFilterId((java.lang.Object) intLikeSerializer15);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = intLikeSerializer14.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = intLikeSerializer14.getSchema(serializerProvider18, type19, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = intLikeSerializer23.withFilterId((java.lang.Object) intLikeSerializer24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        java.lang.reflect.Type type27 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = intLikeSerializer23.getSchema(serializerProvider26, type27, true);
        java.lang.Class<java.lang.Object> objClass30 = intLikeSerializer23.handledType();
        java.lang.Class<java.lang.Object> objClass31 = intLikeSerializer23.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = intLikeSerializer14.getSchema(serializerProvider22, (java.lang.reflect.Type) objClass31);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = intLikeSerializer34.withFilterId((java.lang.Object) intLikeSerializer35);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = intLikeSerializer34.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        java.lang.reflect.Type type39 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = intLikeSerializer34.getSchema(serializerProvider38, type39, true);
        java.lang.Class<?> wildcardClass42 = intLikeSerializer34.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = intLikeSerializer14.getSchema(serializerProvider33, (java.lang.reflect.Type) wildcardClass42, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = intLikeSerializer46.withFilterId((java.lang.Object) intLikeSerializer47);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        java.lang.reflect.Type type50 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = intLikeSerializer46.getSchema(serializerProvider49, type50, true);
        java.lang.Class<java.lang.Object> objClass53 = intLikeSerializer46.handledType();
        java.lang.Class<java.lang.Object> objClass54 = intLikeSerializer46.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = intLikeSerializer14.getSchema(serializerProvider45, (java.lang.reflect.Type) objClass54);
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = numberSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) objClass54);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberSerializer0.serialize((java.lang.Number) (short) 0, jsonGenerator58, serializerProvider59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(floatSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(objClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(intLikeSerializer24);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(objClass30);
        org.junit.Assert.assertNotNull(objClass31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(intLikeSerializer34);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertNull(wildcardJsonSerializer37);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(intLikeSerializer46);
        org.junit.Assert.assertNotNull(intLikeSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(objClass53);
        org.junit.Assert.assertNotNull(objClass54);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(jsonNode56);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean2 = numberSerializer0._isInt;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = numberSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = numberSerializer0.getSchema(serializerProvider4, type5, false);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = numberSerializer10.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = numberSerializer10.isEmpty(serializerProvider12, (java.lang.Number) 0L);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = numberSerializer10.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer17 = numberSerializer10.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        boolean boolean20 = numberJsonSerializer17.isEmpty(serializerProvider18, (java.lang.Number) (short) -1);
        java.lang.Class<?> wildcardClass21 = numberJsonSerializer17.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = numberSerializer0.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass21, false);
        boolean boolean24 = numberSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNotNull(numberSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(numberJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer();
        boolean boolean1 = intLikeSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = numberSerializer0.isEmpty(serializerProvider2, (java.lang.Number) 0L);
        boolean boolean6 = numberSerializer0.isEmpty((java.lang.Number) (byte) -1);
        java.lang.Class<java.lang.Number> numberClass7 = numberSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer9 = numberSerializer0.unwrappingSerializer(nameTransformer8);
        boolean boolean10 = numberJsonSerializer9.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberClass7);
        org.junit.Assert.assertNotNull(numberJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.instance;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = numberSerializer0.properties();
        boolean boolean3 = numberSerializer0.isEmpty((java.lang.Number) 10.0f);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = numberSerializer0.getSchema(serializerProvider4, type5, false);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = numberSerializer0.properties();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = intLikeSerializer9.withFilterId((java.lang.Object) intLikeSerializer10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = intLikeSerializer9.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        java.lang.reflect.Type type14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = intLikeSerializer9.getSchema(serializerProvider13, type14, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = intLikeSerializer18.withFilterId((java.lang.Object) intLikeSerializer19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        java.lang.reflect.Type type22 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = intLikeSerializer18.getSchema(serializerProvider21, type22, true);
        java.lang.Class<java.lang.Object> objClass25 = intLikeSerializer18.handledType();
        java.lang.Class<java.lang.Object> objClass26 = intLikeSerializer18.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = intLikeSerializer9.getSchema(serializerProvider17, (java.lang.reflect.Type) objClass26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = intLikeSerializer9.unwrappingSerializer(nameTransformer28);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<java.lang.Object> objClass34 = intLikeSerializer33.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = floatSerializer31.getSchema(serializerProvider32, (java.lang.reflect.Type) objClass34, true);
        boolean boolean37 = floatSerializer31.usesObjectId();
        java.lang.Class<java.lang.Object> objClass38 = floatSerializer31.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer39 = floatSerializer31.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer42 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer43 = intLikeSerializer41.withFilterId((java.lang.Object) intLikeSerializer42);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer44 = intLikeSerializer41.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer48 = intLikeSerializer46.withFilterId((java.lang.Object) intLikeSerializer47);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        java.lang.reflect.Type type50 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = intLikeSerializer46.getSchema(serializerProvider49, type50, true);
        java.lang.Class<java.lang.Object> objClass53 = intLikeSerializer46.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = intLikeSerializer41.getSchema(serializerProvider45, (java.lang.reflect.Type) objClass53);
        boolean boolean55 = floatSerializer31.isEmpty(serializerProvider40, (java.lang.Object) serializerProvider45);
        java.lang.Class<java.lang.Object> objClass56 = floatSerializer31.handledType();
        boolean boolean57 = objJsonSerializer29.isEmpty(serializerProvider30, (java.lang.Object) floatSerializer31);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor58 = floatSerializer31.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer59 = numberSerializer0.withFilterId((java.lang.Object) propertyWriterItor58);
        boolean boolean60 = numberSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer61 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer62 = numberSerializer0.unwrappingSerializer(nameTransformer61);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider63 = null;
        boolean boolean65 = numberJsonSerializer62.isEmpty(serializerProvider63, (java.lang.Number) (short) 100);
        org.junit.Assert.assertNotNull(numberSerializer0);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(intLikeSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer19);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(objClass25);
        org.junit.Assert.assertNotNull(objClass26);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(objJsonSerializer29);
        org.junit.Assert.assertNotNull(floatSerializer31);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertNotNull(objClass34);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objClass38);
        org.junit.Assert.assertNull(wildcardJsonSerializer39);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(intLikeSerializer42);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer43);
        org.junit.Assert.assertNull(wildcardJsonSerializer44);
        org.junit.Assert.assertNotNull(intLikeSerializer46);
        org.junit.Assert.assertNotNull(intLikeSerializer47);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer48);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(objClass53);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer1 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = intLikeSerializer0.withFilterId((java.lang.Object) intLikeSerializer1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        java.lang.reflect.Type type4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = intLikeSerializer0.getSchema(serializerProvider3, type4, true);
        java.lang.Class<java.lang.Object> objClass7 = intLikeSerializer0.handledType();
        boolean boolean8 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = intLikeSerializer0._numberType;
        boolean boolean10 = intLikeSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + numberType9 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType9.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}

