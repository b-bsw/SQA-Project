package com.fasterxml.jackson.databind.ser.std;

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
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = floatSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer6 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = shortSerializer6.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = shortSerializer6.getSchema(serializerProvider8, type9, true);
        java.lang.Class<java.lang.Short> shortClass12 = shortSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = floatSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) shortClass12);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean17 = shortSerializer15.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass22 = intLikeSerializer21.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = floatSerializer19.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass22);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = shortSerializer15.getSchema(serializerProvider18, (java.lang.reflect.Type) wildcardClass22);
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = floatSerializer0.getSchema(serializerProvider14, (java.lang.reflect.Type) wildcardClass22, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        java.lang.Throwable throwable28 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer29 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = shortSerializer29.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer32 = shortSerializer29.unwrappingSerializer(nameTransformer31);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer33 = shortSerializer29.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty37 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer38 = intLikeSerializer35.createContextual(serializerProvider36, beanProperty37);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        boolean boolean41 = intLikeSerializer35.isEmpty(serializerProvider39, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer45 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer47 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer49 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass50 = intLikeSerializer49.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = integerSerializer47.getSchema(serializerProvider48, (java.lang.reflect.Type) wildcardClass50);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer53 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass54 = intLikeSerializer53.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = integerSerializer47.getSchema(serializerProvider52, (java.lang.reflect.Type) wildcardClass54);
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = floatSerializer45.getSchema(serializerProvider46, (java.lang.reflect.Type) wildcardClass54);
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = shortSerializer43.getSchema(serializerProvider44, (java.lang.reflect.Type) wildcardClass54);
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = intLikeSerializer35.getSchema(serializerProvider42, (java.lang.reflect.Type) wildcardClass54);
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = shortSerializer29.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass54, true);
        boolean boolean61 = shortSerializer29.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType62 = shortSerializer29._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider63 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer64 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty66 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer67 = intLikeSerializer64.createContextual(serializerProvider65, beanProperty66);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        boolean boolean70 = intLikeSerializer64.isEmpty(serializerProvider68, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer72 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass73 = intLikeSerializer72.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode74 = intLikeSerializer64.getSchema(serializerProvider71, (java.lang.reflect.Type) wildcardClass73);
        java.lang.Class<java.lang.Number> numberClass75 = intLikeSerializer64.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = shortSerializer29.getSchema(serializerProvider63, (java.lang.reflect.Type) numberClass75, false);
        boolean boolean78 = shortSerializer29.isUnwrappingSerializer();
        boolean boolean79 = shortSerializer29.isUnwrappingSerializer();
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.wrapAndThrow(serializerProvider27, throwable28, (java.lang.Object) boolean79, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(shortClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNull(wildcardJsonSerializer30);
        org.junit.Assert.assertNotNull(shortJsonSerializer32);
        org.junit.Assert.assertNull(wildcardJsonSerializer33);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(jsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shortSerializer43);
        org.junit.Assert.assertNotNull(intLikeSerializer49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(jsonNode51);
        org.junit.Assert.assertNotNull(intLikeSerializer53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertNotNull(jsonNode57);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + numberType62 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType62.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer64);
        org.junit.Assert.assertNotNull(jsonSerializer67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(jsonNode74);
        org.junit.Assert.assertNotNull(numberClass75);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = doubleSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass9 = intLikeSerializer8.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = doubleSerializer6.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer13 = doubleSerializer6.createContextual(serializerProvider11, beanProperty12);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer16 = doubleSerializer6.createContextual(serializerProvider14, beanProperty15);
        boolean boolean17 = doubleSerializer6.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer20 = doubleSerializer6.createContextual(serializerProvider18, beanProperty19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer23 = doubleSerializer6.createContextual(serializerProvider21, beanProperty22);
        boolean boolean24 = doubleSerializer0.isEmpty(serializerProvider5, (java.lang.Object) doubleSerializer6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer27 = doubleSerializer6.createContextual(serializerProvider25, beanProperty26);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty29 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer30 = doubleSerializer6.createContextual(serializerProvider28, beanProperty29);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleSerializer6.acceptJsonFormatVisitor(jsonFormatVisitorWrapper31, javaType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(doubleSerializer6);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonSerializer13);
        org.junit.Assert.assertNotNull(jsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonSerializer20);
        org.junit.Assert.assertNotNull(jsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonSerializer27);
        org.junit.Assert.assertNotNull(jsonSerializer30);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = longSerializer0.createContextual(serializerProvider1, beanProperty2);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = jsonSerializer3.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = jsonSerializer3.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer7 = jsonSerializer3.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass11 = intLikeSerializer10.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = doubleSerializer8.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass17 = intLikeSerializer16.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = doubleSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer21 = doubleSerializer14.createContextual(serializerProvider19, beanProperty20);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer24 = doubleSerializer14.createContextual(serializerProvider22, beanProperty23);
        boolean boolean25 = doubleSerializer14.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer28 = doubleSerializer14.createContextual(serializerProvider26, beanProperty27);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer31 = doubleSerializer14.createContextual(serializerProvider29, beanProperty30);
        boolean boolean32 = doubleSerializer8.isEmpty(serializerProvider13, (java.lang.Object) doubleSerializer14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer35 = doubleSerializer14.createContextual(serializerProvider33, beanProperty34);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty37 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer38 = doubleSerializer14.createContextual(serializerProvider36, beanProperty37);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer39 = jsonSerializer3.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short>) jsonSerializer38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(shortJsonSerializer7);
        org.junit.Assert.assertNotNull(doubleSerializer8);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(doubleSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonSerializer21);
        org.junit.Assert.assertNotNull(jsonSerializer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonSerializer28);
        org.junit.Assert.assertNotNull(jsonSerializer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonSerializer35);
        org.junit.Assert.assertNotNull(jsonSerializer38);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean2 = intLikeSerializer0.isEmpty((java.lang.Number) (-1.0f));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = intLikeSerializer0.properties();
        boolean boolean4 = intLikeSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer6 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean8 = shortSerializer6.isEmpty((java.lang.Short) (short) 0);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor9 = shortSerializer6.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = shortSerializer11.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        java.lang.reflect.Type type14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = shortSerializer11.getSchema(serializerProvider13, type14, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean19 = shortSerializer11.isEmpty(serializerProvider17, (java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass24 = intLikeSerializer23.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = floatSerializer21.getSchema(serializerProvider22, (java.lang.reflect.Type) wildcardClass24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = shortSerializer27.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.reflect.Type type30 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = shortSerializer27.getSchema(serializerProvider29, type30, true);
        java.lang.Class<java.lang.Short> shortClass33 = shortSerializer27.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = floatSerializer21.getSchema(serializerProvider26, (java.lang.reflect.Type) shortClass33);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor35 = floatSerializer21.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer37 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = shortSerializer37.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        java.lang.reflect.Type type40 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = shortSerializer37.getSchema(serializerProvider39, type40, true);
        java.lang.Class<java.lang.Short> shortClass43 = shortSerializer37.handledType();
        boolean boolean44 = floatSerializer21.isEmpty(serializerProvider36, (java.lang.Object) shortSerializer37);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer46 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer48 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass51 = intLikeSerializer50.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = floatSerializer48.getSchema(serializerProvider49, (java.lang.reflect.Type) wildcardClass51);
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = shortSerializer46.getSchema(serializerProvider47, (java.lang.reflect.Type) wildcardClass51);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider54 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer55 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean56 = shortSerializer55.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        boolean boolean59 = shortSerializer55.isEmpty(serializerProvider57, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer61 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean63 = shortSerializer61.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider64 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer65 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider66 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer67 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass68 = intLikeSerializer67.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = floatSerializer65.getSchema(serializerProvider66, (java.lang.reflect.Type) wildcardClass68);
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = shortSerializer61.getSchema(serializerProvider64, (java.lang.reflect.Type) wildcardClass68);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = shortSerializer55.getSchema(serializerProvider60, (java.lang.reflect.Type) wildcardClass68, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode74 = shortSerializer46.getSchema(serializerProvider54, (java.lang.reflect.Type) wildcardClass68, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = shortSerializer37.getSchema(serializerProvider45, (java.lang.reflect.Type) wildcardClass68, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = shortSerializer11.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass68, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = shortSerializer6.getSchema(serializerProvider10, (java.lang.reflect.Type) wildcardClass68);
        java.lang.Class<java.lang.Short> shortClass80 = shortSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode81 = intLikeSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) shortClass80);
        java.lang.Number number82 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator83 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider84 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer85 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serializeWithType(number82, jsonGenerator83, serializerProvider84, typeSerializer85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor9);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatSerializer21);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(shortClass33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(propertyWriterItor35);
        org.junit.Assert.assertNull(wildcardJsonSerializer38);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(shortClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatSerializer48);
        org.junit.Assert.assertNotNull(intLikeSerializer50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(floatSerializer65);
        org.junit.Assert.assertNotNull(intLikeSerializer67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertNotNull(jsonNode74);
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertNotNull(jsonNode78);
        org.junit.Assert.assertNotNull(jsonNode79);
        org.junit.Assert.assertNotNull(shortClass80);
        org.junit.Assert.assertNotNull(jsonNode81);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        boolean boolean7 = intLikeSerializer0.usesObjectId();
        java.lang.Class<java.lang.Number> numberClass8 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer10 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = shortSerializer10.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer19 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean20 = shortSerializer19.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean23 = shortSerializer19.isEmpty(serializerProvider21, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer25 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean27 = shortSerializer25.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer29 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass32 = intLikeSerializer31.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = floatSerializer29.getSchema(serializerProvider30, (java.lang.reflect.Type) wildcardClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = shortSerializer25.getSchema(serializerProvider28, (java.lang.reflect.Type) wildcardClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = shortSerializer19.getSchema(serializerProvider24, (java.lang.reflect.Type) wildcardClass32, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = shortSerializer10.getSchema(serializerProvider18, (java.lang.reflect.Type) wildcardClass32, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = intLikeSerializer0.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass32);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty41 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer42 = intLikeSerializer0.createContextual(serializerProvider40, beanProperty41);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        java.lang.Throwable throwable44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        java.lang.Class<java.lang.Object> objClass46 = longSerializer45.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty48 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer49 = longSerializer45.createContextual(serializerProvider47, beanProperty48);
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.wrapAndThrow(serializerProvider43, throwable44, (java.lang.Object) beanProperty48, "number");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberClass8);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatSerializer29);
        org.junit.Assert.assertNotNull(intLikeSerializer31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonSerializer42);
        org.junit.Assert.assertNotNull(longSerializer45);
        org.junit.Assert.assertNotNull(objClass46);
        org.junit.Assert.assertNotNull(jsonSerializer49);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = integerSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass7 = intLikeSerializer6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = integerSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        boolean boolean10 = integerSerializer0.isEmpty((java.lang.Object) "");
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer13 = integerSerializer0.createContextual(serializerProvider11, beanProperty12);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = shortSerializer15.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer18 = shortSerializer15.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        java.lang.Class<java.lang.Object> objClass21 = longSerializer20.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer26 = longSerializer23.createContextual(serializerProvider24, beanProperty25);
        boolean boolean28 = longSerializer23.isEmpty((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty32 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer33 = intLikeSerializer30.createContextual(serializerProvider31, beanProperty32);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = jsonSerializer33.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        boolean boolean37 = jsonSerializer33.isEmpty(serializerProvider35, (java.lang.Number) (byte) 1);
        java.lang.Class<?> wildcardClass38 = jsonSerializer33.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = longSerializer23.getSchema(serializerProvider29, (java.lang.reflect.Type) wildcardClass38);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = longSerializer20.getSchema(serializerProvider22, (java.lang.reflect.Type) wildcardClass38);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer42 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer44 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer46 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass47 = intLikeSerializer46.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = integerSerializer44.getSchema(serializerProvider45, (java.lang.reflect.Type) wildcardClass47);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass51 = intLikeSerializer50.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = integerSerializer44.getSchema(serializerProvider49, (java.lang.reflect.Type) wildcardClass51);
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = floatSerializer42.getSchema(serializerProvider43, (java.lang.reflect.Type) wildcardClass51);
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = longSerializer20.getSchema(serializerProvider41, (java.lang.reflect.Type) wildcardClass51);
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = shortSerializer15.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass51, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = integerSerializer0.getSchema(serializerProvider14, (java.lang.reflect.Type) wildcardClass51, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty60 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer61 = integerSerializer0.createContextual(serializerProvider59, beanProperty60);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer62 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider63 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty64 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer65 = longSerializer62.createContextual(serializerProvider63, beanProperty64);
        boolean boolean67 = longSerializer62.isEmpty((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer69 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider70 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty71 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer72 = intLikeSerializer69.createContextual(serializerProvider70, beanProperty71);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer73 = jsonSerializer72.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        boolean boolean76 = jsonSerializer72.isEmpty(serializerProvider74, (java.lang.Number) (byte) 1);
        java.lang.Class<?> wildcardClass77 = jsonSerializer72.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = longSerializer62.getSchema(serializerProvider68, (java.lang.reflect.Type) wildcardClass77);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider79 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty80 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer81 = longSerializer62.createContextual(serializerProvider79, beanProperty80);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator82 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider83 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer84 = null;
        // The following exception was thrown during execution in test generation
        try {
            integerSerializer0.serializeWithType((java.lang.Object) longSerializer62, jsonGenerator82, serializerProvider83, typeSerializer84);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer cannot be cast to class java.lang.Integer (com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonSerializer13);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(shortJsonSerializer18);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertNotNull(longSerializer23);
        org.junit.Assert.assertNotNull(jsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer30);
        org.junit.Assert.assertNotNull(jsonSerializer33);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(intLikeSerializer46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(intLikeSerializer50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(jsonSerializer61);
        org.junit.Assert.assertNotNull(longSerializer62);
        org.junit.Assert.assertNotNull(jsonSerializer65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer69);
        org.junit.Assert.assertNotNull(jsonSerializer72);
        org.junit.Assert.assertNull(wildcardJsonSerializer73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(jsonNode78);
        org.junit.Assert.assertNotNull(jsonSerializer81);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.lang.String str1 = shortSerializer0._schemaType;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = shortSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = shortSerializer0.createContextual(serializerProvider3, beanProperty4);
        boolean boolean7 = shortSerializer0.isEmpty((java.lang.Short) (short) 100);
        java.lang.Class<java.lang.Short> shortClass8 = shortSerializer0.handledType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "number" + "'", str1, "number");
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortClass8);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = shortSerializer2.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer2.getSchema(serializerProvider4, type5, true);
        java.lang.Class<java.lang.Short> shortClass8 = shortSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = longSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) shortClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer12 = longSerializer0.createContextual(serializerProvider10, beanProperty11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer15 = longSerializer0.createContextual(serializerProvider13, beanProperty14);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer20 = intLikeSerializer17.createContextual(serializerProvider18, beanProperty19);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean23 = intLikeSerializer17.isEmpty(serializerProvider21, (java.lang.Number) 1L);
        java.lang.Class<java.lang.Number> numberClass24 = intLikeSerializer17.handledType();
        boolean boolean25 = jsonSerializer15.isEmpty(serializerProvider16, (java.lang.Object) intLikeSerializer17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer27 = jsonSerializer15.unwrappingSerializer(nameTransformer26);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(shortClass8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonSerializer12);
        org.junit.Assert.assertNotNull(jsonSerializer15);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(jsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(numberClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer27);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = jsonSerializer3.getDelegatee();
        boolean boolean6 = jsonSerializer3.isEmpty((java.lang.Short) (short) -1);
        boolean boolean7 = jsonSerializer3.isUnwrappingSerializer();
        boolean boolean8 = jsonSerializer3.isUnwrappingSerializer();
        boolean boolean10 = jsonSerializer3.isEmpty((java.lang.Short) (short) 1);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = jsonSerializer3.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean10 = shortSerializer8.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = shortSerializer8.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean18 = jsonSerializer3.isEmpty(serializerProvider7, (java.lang.Object) shortSerializer8);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = jsonSerializer3.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = jsonSerializer3.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer22 = jsonSerializer3.unwrappingSerializer(nameTransformer21);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer26 = intLikeSerializer23.createContextual(serializerProvider24, beanProperty25);
        boolean boolean27 = jsonSerializer26.usesObjectId();
        boolean boolean29 = jsonSerializer26.isEmpty((java.lang.Number) (-1.0f));
        boolean boolean31 = jsonSerializer26.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = jsonSerializer26.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer33 = shortJsonSerializer22.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short>) jsonSerializer26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNull(wildcardJsonSerializer20);
        org.junit.Assert.assertNotNull(shortJsonSerializer22);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(jsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer32);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        java.lang.String str8 = shortSerializer0._schemaType;
        java.lang.Class<java.lang.Short> shortClass9 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer11 = shortSerializer0.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean15 = shortSerializer13.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer20 = intLikeSerializer17.createContextual(serializerProvider18, beanProperty19);
        java.lang.Class<?> wildcardClass21 = jsonSerializer20.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = shortSerializer13.getSchema(serializerProvider16, (java.lang.reflect.Type) wildcardClass21);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = shortSerializer0.getSchema(serializerProvider12, (java.lang.reflect.Type) wildcardClass21, false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer28 = intLikeSerializer25.createContextual(serializerProvider26, beanProperty27);
        boolean boolean29 = jsonSerializer28.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean33 = shortSerializer31.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty37 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer38 = intLikeSerializer35.createContextual(serializerProvider36, beanProperty37);
        java.lang.Class<?> wildcardClass39 = jsonSerializer38.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = shortSerializer31.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass39);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty42 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer43 = shortSerializer31.createContextual(serializerProvider41, beanProperty42);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer44 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer45 = jsonSerializer43.unwrappingSerializer(nameTransformer44);
        boolean boolean47 = jsonSerializer43.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        boolean boolean50 = jsonSerializer43.isEmpty(serializerProvider48, (java.lang.Short) (short) 10);
        boolean boolean51 = jsonSerializer43.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor52 = jsonSerializer43.properties();
        boolean boolean53 = jsonSerializer28.isEmpty(serializerProvider30, (java.lang.Object) propertyWriterItor52);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer54 = shortSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short>) jsonSerializer28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "number" + "'", str8, "number");
        org.junit.Assert.assertNotNull(shortClass9);
        org.junit.Assert.assertNotNull(shortJsonSerializer11);
        org.junit.Assert.assertNotNull(shortSerializer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(jsonSerializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(intLikeSerializer25);
        org.junit.Assert.assertNotNull(jsonSerializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortSerializer31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(jsonSerializer38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(jsonSerializer43);
        org.junit.Assert.assertNotNull(shortJsonSerializer45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        java.lang.String str8 = shortSerializer0._schemaType;
        boolean boolean9 = shortSerializer0.usesObjectId();
        boolean boolean10 = shortSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer15 = intLikeSerializer12.createContextual(serializerProvider13, beanProperty14);
        boolean boolean16 = intLikeSerializer12.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer22 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass25 = intLikeSerializer24.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = integerSerializer22.getSchema(serializerProvider23, (java.lang.reflect.Type) wildcardClass25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass29 = intLikeSerializer28.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = integerSerializer22.getSchema(serializerProvider27, (java.lang.reflect.Type) wildcardClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = floatSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) wildcardClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = shortSerializer18.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass29);
        java.lang.Class<java.lang.Short> shortClass33 = shortSerializer18.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = intLikeSerializer12.getSchema(serializerProvider17, (java.lang.reflect.Type) shortClass33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty36 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer37 = intLikeSerializer12.createContextual(serializerProvider35, beanProperty36);
        java.lang.Class<java.lang.Number> numberClass38 = intLikeSerializer12.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = shortSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) numberClass38);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer41 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer45 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass46 = intLikeSerializer45.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = floatSerializer43.getSchema(serializerProvider44, (java.lang.reflect.Type) wildcardClass46);
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = shortSerializer41.getSchema(serializerProvider42, (java.lang.reflect.Type) wildcardClass46);
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = shortSerializer0.getSchema(serializerProvider40, (java.lang.reflect.Type) wildcardClass46);
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "number" + "'", str8, "number");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(jsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(shortClass33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonSerializer37);
        org.junit.Assert.assertNotNull(numberClass38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(floatSerializer43);
        org.junit.Assert.assertNotNull(intLikeSerializer45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(jsonNode49);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = jsonSerializer3.properties();
        boolean boolean7 = jsonSerializer3.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = jsonSerializer3.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = longSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer6 = longSerializer0.createContextual(serializerProvider4, beanProperty5);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer10 = intLikeSerializer7.createContextual(serializerProvider8, beanProperty9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = jsonSerializer10.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = jsonSerializer10.isEmpty(serializerProvider12, (java.lang.Number) (byte) 1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = jsonSerializer10.getDelegatee();
        boolean boolean16 = jsonSerializer6.isEmpty((java.lang.Object) jsonSerializer10);
        boolean boolean17 = jsonSerializer10.isUnwrappingSerializer();
        boolean boolean18 = jsonSerializer10.usesObjectId();
        boolean boolean19 = jsonSerializer10.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = jsonSerializer10.unwrappingSerializer(nameTransformer20);
        org.junit.Assert.assertNotNull(longSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertNotNull(jsonSerializer6);
        org.junit.Assert.assertNotNull(intLikeSerializer7);
        org.junit.Assert.assertNotNull(jsonSerializer10);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean2 = shortSerializer0.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer7 = intLikeSerializer4.createContextual(serializerProvider5, beanProperty6);
        java.lang.Class<?> wildcardClass8 = jsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = shortSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer12 = shortSerializer0.createContextual(serializerProvider10, beanProperty11);
        boolean boolean13 = shortSerializer0.isUnwrappingSerializer();
        boolean boolean15 = shortSerializer0.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Short) (short) 100, jsonGenerator17, serializerProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(jsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonSerializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = doubleSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer7 = doubleSerializer0.createContextual(serializerProvider5, beanProperty6);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = jsonSerializer7.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = jsonSerializer7.isEmpty(serializerProvider9, (java.lang.Short) (short) -1);
        boolean boolean12 = jsonSerializer7.isUnwrappingSerializer();
        boolean boolean14 = jsonSerializer7.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        boolean boolean17 = jsonSerializer7.isEmpty(serializerProvider15, (java.lang.Number) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = jsonSerializer7.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        boolean boolean21 = jsonSerializer7.isEmpty(serializerProvider19, (java.lang.Number) 1);
        boolean boolean23 = jsonSerializer7.isEmpty((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(doubleSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        java.lang.Class<java.lang.Object> objClass1 = longSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer4 = longSerializer0.createContextual(serializerProvider2, beanProperty3);
        boolean boolean5 = longSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer8 = longSerializer0.createContextual(serializerProvider6, beanProperty7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = longSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(jsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonSerializer8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean2 = shortSerializer0.isEmpty((java.lang.Short) (short) 0);
        java.lang.Class<java.lang.Short> shortClass3 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer5 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer7 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass10 = intLikeSerializer9.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = integerSerializer7.getSchema(serializerProvider8, (java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass14 = intLikeSerializer13.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = integerSerializer7.getSchema(serializerProvider12, (java.lang.reflect.Type) wildcardClass14);
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) wildcardClass14);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = shortSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) wildcardClass14, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = shortSerializer0.createContextual(serializerProvider19, beanProperty20);
        java.lang.Class<java.lang.Short> shortClass22 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        java.lang.Throwable throwable24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass28 = intLikeSerializer27.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = floatSerializer25.getSchema(serializerProvider26, (java.lang.reflect.Type) wildcardClass28);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer31 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer32 = shortSerializer31.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        java.lang.reflect.Type type34 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = shortSerializer31.getSchema(serializerProvider33, type34, true);
        java.lang.Class<java.lang.Short> shortClass37 = shortSerializer31.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = floatSerializer25.getSchema(serializerProvider30, (java.lang.reflect.Type) shortClass37);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor39 = floatSerializer25.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer41 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer42 = shortSerializer41.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        java.lang.reflect.Type type44 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = shortSerializer41.getSchema(serializerProvider43, type44, true);
        java.lang.Class<java.lang.Short> shortClass47 = shortSerializer41.handledType();
        boolean boolean48 = floatSerializer25.isEmpty(serializerProvider40, (java.lang.Object) shortSerializer41);
        boolean boolean49 = shortSerializer41.usesObjectId();
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.wrapAndThrow(serializerProvider23, throwable24, (java.lang.Object) boolean49, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortClass3);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer21);
        org.junit.Assert.assertNotNull(shortClass22);
        org.junit.Assert.assertNotNull(floatSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNull(wildcardJsonSerializer32);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(shortClass37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(propertyWriterItor39);
        org.junit.Assert.assertNull(wildcardJsonSerializer42);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNotNull(shortClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = shortSerializer0.properties();
        boolean boolean2 = shortSerializer0.usesObjectId();
        boolean boolean3 = shortSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer5 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass8 = intLikeSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = integerSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) wildcardClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass12 = intLikeSerializer11.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = integerSerializer5.getSchema(serializerProvider10, (java.lang.reflect.Type) wildcardClass12);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean16 = shortSerializer15.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean19 = shortSerializer15.isEmpty(serializerProvider17, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer21 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean23 = shortSerializer21.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass28 = intLikeSerializer27.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = floatSerializer25.getSchema(serializerProvider26, (java.lang.reflect.Type) wildcardClass28);
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = shortSerializer21.getSchema(serializerProvider24, (java.lang.reflect.Type) wildcardClass28);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = shortSerializer15.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass28, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = integerSerializer5.getSchema(serializerProvider14, (java.lang.reflect.Type) wildcardClass28);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer34 = integerSerializer5.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty36 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer37 = integerSerializer5.createContextual(serializerProvider35, beanProperty36);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer39 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer();
        java.lang.Class<java.lang.Number> numberClass40 = intLikeSerializer39.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty42 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer43 = intLikeSerializer39.createContextual(serializerProvider41, beanProperty42);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer45 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean47 = shortSerializer45.isEmpty((java.lang.Short) (short) 0);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor48 = shortSerializer45.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer50 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = shortSerializer50.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer52 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer53 = shortSerializer50.unwrappingSerializer(nameTransformer52);
        java.lang.Class<?> wildcardClass54 = shortJsonSerializer53.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = shortSerializer45.getSchema(serializerProvider49, (java.lang.reflect.Type) wildcardClass54, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty58 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer59 = shortSerializer45.createContextual(serializerProvider57, beanProperty58);
        java.lang.Class<java.lang.Short> shortClass60 = shortSerializer45.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = intLikeSerializer39.getSchema(serializerProvider44, (java.lang.reflect.Type) shortClass60);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = integerSerializer5.getSchema(serializerProvider38, (java.lang.reflect.Type) shortClass60);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = shortSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) shortClass60, false);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer65 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider66 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty67 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer68 = intLikeSerializer65.createContextual(serializerProvider66, beanProperty67);
        boolean boolean70 = jsonSerializer68.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor71 = jsonSerializer68.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider72 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer73 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean75 = shortSerializer73.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider76 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer77 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider78 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer79 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass80 = intLikeSerializer79.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode81 = floatSerializer77.getSchema(serializerProvider78, (java.lang.reflect.Type) wildcardClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode82 = shortSerializer73.getSchema(serializerProvider76, (java.lang.reflect.Type) wildcardClass80);
        boolean boolean83 = jsonSerializer68.isEmpty(serializerProvider72, (java.lang.Object) shortSerializer73);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer84 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer85 = shortSerializer73.unwrappingSerializer(nameTransformer84);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer86 = shortSerializer0.replaceDelegatee(shortJsonSerializer85);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(intLikeSerializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNull(wildcardJsonSerializer34);
        org.junit.Assert.assertNotNull(jsonSerializer37);
        org.junit.Assert.assertNotNull(numberClass40);
        org.junit.Assert.assertNotNull(jsonSerializer43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor48);
        org.junit.Assert.assertNull(wildcardJsonSerializer51);
        org.junit.Assert.assertNotNull(shortJsonSerializer53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertNotNull(jsonSerializer59);
        org.junit.Assert.assertNotNull(shortClass60);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertNotNull(intLikeSerializer65);
        org.junit.Assert.assertNotNull(jsonSerializer68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(floatSerializer77);
        org.junit.Assert.assertNotNull(intLikeSerializer79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(jsonNode81);
        org.junit.Assert.assertNotNull(jsonNode82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer85);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean4 = shortSerializer2.isEmpty((java.lang.Short) (short) 0);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = shortSerializer2.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer7 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = shortSerializer7.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer10 = shortSerializer7.unwrappingSerializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = shortJsonSerializer10.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = shortSerializer2.getSchema(serializerProvider6, (java.lang.reflect.Type) wildcardClass11, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass11);
        boolean boolean15 = shortSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = shortSerializer0.createContextual(serializerProvider16, beanProperty17);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        boolean boolean21 = shortSerializer0.isEmpty(serializerProvider19, (java.lang.Short) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertNotNull(shortJsonSerializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer3 = shortSerializer0.unwrappingSerializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer5 = shortJsonSerializer3.unwrappingSerializer(nameTransformer4);
        boolean boolean6 = shortJsonSerializer3.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = shortJsonSerializer3.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(shortJsonSerializer3);
        org.junit.Assert.assertNotNull(shortJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        java.lang.String str8 = shortSerializer0._schemaType;
        boolean boolean9 = shortSerializer0.usesObjectId();
        boolean boolean11 = shortSerializer0.isEmpty((java.lang.Short) (short) 10);
        java.lang.Class<java.lang.Short> shortClass12 = shortSerializer0.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serialize((java.lang.Short) (short) 100, jsonGenerator14, serializerProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "number" + "'", str8, "number");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortClass12);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer3 = shortSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = shortSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer6 = shortSerializer0.unwrappingSerializer(nameTransformer5);
        boolean boolean8 = shortSerializer0.isEmpty((java.lang.Short) (short) 1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer11 = shortSerializer0.createContextual(serializerProvider9, beanProperty10);
        boolean boolean13 = jsonSerializer11.isEmpty((java.lang.Short) (short) 0);
        boolean boolean14 = jsonSerializer11.usesObjectId();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(shortJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = jsonSerializer3.properties();
        boolean boolean7 = jsonSerializer3.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = jsonSerializer3.unwrappingSerializer(nameTransformer8);
        boolean boolean10 = jsonSerializer3.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = shortSerializer11.properties();
        boolean boolean14 = shortSerializer11.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass21 = intLikeSerializer20.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = floatSerializer18.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass21);
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = shortSerializer16.getSchema(serializerProvider17, (java.lang.reflect.Type) wildcardClass21);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = shortSerializer11.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer();
        java.lang.Class<java.lang.Number> numberClass27 = intLikeSerializer26.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = shortSerializer11.getSchema(serializerProvider25, (java.lang.reflect.Type) numberClass27, false);
        boolean boolean30 = jsonSerializer3.isEmpty((java.lang.Object) shortSerializer11);
        boolean boolean31 = shortSerializer11._isInt;
        boolean boolean32 = shortSerializer11._isInt;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType33 = shortSerializer11._numberType;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer11.serializeWithType((java.lang.Short) (short) -1, jsonGenerator35, serializerProvider36, typeSerializer37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(numberClass27);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + numberType33 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType33.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = floatSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer6 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = shortSerializer6.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = shortSerializer6.getSchema(serializerProvider8, type9, true);
        java.lang.Class<java.lang.Short> shortClass12 = shortSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = floatSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) shortClass12);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = floatSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = shortSerializer16.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = shortSerializer16.getSchema(serializerProvider18, type19, true);
        java.lang.Class<java.lang.Short> shortClass22 = shortSerializer16.handledType();
        boolean boolean23 = floatSerializer0.isEmpty(serializerProvider15, (java.lang.Object) shortSerializer16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer25 = shortSerializer16.unwrappingSerializer(nameTransformer24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        boolean boolean28 = shortSerializer16.isEmpty(serializerProvider26, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer31 = shortSerializer16.createContextual(serializerProvider29, beanProperty30);
        java.lang.String str32 = shortSerializer16._schemaType;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer16.serializeWithType((java.lang.Short) (short) 0, jsonGenerator34, serializerProvider35, typeSerializer36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(shortClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(shortClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonSerializer31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "number" + "'", str32, "number");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = jsonSerializer3.properties();
        boolean boolean7 = jsonSerializer3.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = jsonSerializer3.getDelegatee();
        boolean boolean10 = jsonSerializer3.isEmpty((java.lang.Number) (byte) 1);
        boolean boolean12 = jsonSerializer3.isEmpty((java.lang.Short) (short) -1);
        boolean boolean13 = jsonSerializer3.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean2 = shortSerializer0.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer7 = intLikeSerializer4.createContextual(serializerProvider5, beanProperty6);
        java.lang.Class<?> wildcardClass8 = jsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = shortSerializer0.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer12 = shortSerializer0.createContextual(serializerProvider10, beanProperty11);
        boolean boolean13 = shortSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer16 = shortSerializer0.createContextual(serializerProvider14, beanProperty15);
        boolean boolean17 = shortSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(shortSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(jsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonSerializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = shortSerializer2.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        java.lang.reflect.Type type5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer2.getSchema(serializerProvider4, type5, true);
        java.lang.Class<java.lang.Short> shortClass8 = shortSerializer2.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = longSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) shortClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer12 = longSerializer0.createContextual(serializerProvider10, beanProperty11);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer16 = intLikeSerializer13.createContextual(serializerProvider14, beanProperty15);
        boolean boolean18 = jsonSerializer16.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = jsonSerializer16.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer21 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean23 = shortSerializer21.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass28 = intLikeSerializer27.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = floatSerializer25.getSchema(serializerProvider26, (java.lang.reflect.Type) wildcardClass28);
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = shortSerializer21.getSchema(serializerProvider24, (java.lang.reflect.Type) wildcardClass28);
        boolean boolean31 = jsonSerializer16.isEmpty(serializerProvider20, (java.lang.Object) shortSerializer21);
        boolean boolean33 = jsonSerializer16.isEmpty((java.lang.Object) false);
        boolean boolean34 = jsonSerializer12.isEmpty((java.lang.Object) false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer36 = jsonSerializer12.unwrappingSerializer(nameTransformer35);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor37 = jsonSerializer12.properties();
        boolean boolean38 = jsonSerializer12.isUnwrappingSerializer();
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(shortClass8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(jsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer36);
        org.junit.Assert.assertNotNull(propertyWriterItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = doubleSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer6 = doubleSerializer0.createContextual(serializerProvider4, beanProperty5);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer9 = doubleSerializer0.createContextual(serializerProvider7, beanProperty8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer12 = doubleSerializer0.createContextual(serializerProvider10, beanProperty11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer15 = doubleSerializer0.createContextual(serializerProvider13, beanProperty14);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = jsonSerializer15.getDelegatee();
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertNotNull(jsonSerializer6);
        org.junit.Assert.assertNotNull(jsonSerializer9);
        org.junit.Assert.assertNotNull(jsonSerializer12);
        org.junit.Assert.assertNotNull(jsonSerializer15);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = integerSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass7 = intLikeSerializer6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = integerSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer10 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean11 = shortSerializer10.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = shortSerializer10.isEmpty(serializerProvider12, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean18 = shortSerializer16.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass23 = intLikeSerializer22.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = floatSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) wildcardClass23);
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = shortSerializer16.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass23);
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = shortSerializer10.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass23, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = integerSerializer0.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass23);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.reflect.Type type30 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = integerSerializer0.getSchema(serializerProvider29, type30);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty33 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer34 = integerSerializer0.createContextual(serializerProvider32, beanProperty33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty36 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer37 = integerSerializer0.createContextual(serializerProvider35, beanProperty36);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatSerializer20);
        org.junit.Assert.assertNotNull(intLikeSerializer22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(jsonSerializer34);
        org.junit.Assert.assertNotNull(jsonSerializer37);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass9 = intLikeSerializer8.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer0.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<java.lang.Number> numberClass11 = intLikeSerializer0.handledType();
        java.lang.Class<java.lang.Number> numberClass12 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        java.lang.Class<java.lang.Object> objClass15 = longSerializer14.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer17 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = shortSerializer17.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer20 = shortSerializer17.unwrappingSerializer(nameTransformer19);
        boolean boolean21 = shortSerializer17.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer24 = shortSerializer17.createContextual(serializerProvider22, beanProperty23);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer29 = intLikeSerializer26.createContextual(serializerProvider27, beanProperty28);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = jsonSerializer29.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = jsonSerializer29.isEmpty(serializerProvider31, (java.lang.Number) (byte) 1);
        java.lang.Class<?> wildcardClass34 = jsonSerializer29.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = shortSerializer17.getSchema(serializerProvider25, (java.lang.reflect.Type) wildcardClass34, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = longSerializer14.getSchema(serializerProvider16, (java.lang.reflect.Type) wildcardClass34, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = intLikeSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass34);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty41 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer42 = intLikeSerializer0.createContextual(serializerProvider40, beanProperty41);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer44 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty46 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer47 = intLikeSerializer44.createContextual(serializerProvider45, beanProperty46);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        boolean boolean50 = intLikeSerializer44.isEmpty(serializerProvider48, (java.lang.Number) 1L);
        java.lang.Class<java.lang.Number> numberClass51 = intLikeSerializer44.handledType();
        java.lang.Class<?> wildcardClass52 = intLikeSerializer44.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = intLikeSerializer0.getSchema(serializerProvider43, (java.lang.reflect.Type) wildcardClass52);
        boolean boolean54 = intLikeSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(numberClass11);
        org.junit.Assert.assertNotNull(numberClass12);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(shortJsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonSerializer24);
        org.junit.Assert.assertNotNull(intLikeSerializer26);
        org.junit.Assert.assertNotNull(jsonSerializer29);
        org.junit.Assert.assertNull(wildcardJsonSerializer30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonSerializer42);
        org.junit.Assert.assertNotNull(intLikeSerializer44);
        org.junit.Assert.assertNotNull(jsonSerializer47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(numberClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        java.lang.String str8 = shortSerializer0._schemaType;
        boolean boolean9 = shortSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = shortSerializer0.getDelegatee();
        boolean boolean11 = shortSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer16 = intLikeSerializer13.createContextual(serializerProvider14, beanProperty15);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean19 = intLikeSerializer13.isEmpty(serializerProvider17, (java.lang.Number) 1L);
        java.lang.Class<java.lang.Number> numberClass20 = intLikeSerializer13.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor21 = intLikeSerializer13.properties();
        java.lang.Class<java.lang.Number> numberClass22 = intLikeSerializer13.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer24 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass29 = intLikeSerializer28.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = floatSerializer26.getSchema(serializerProvider27, (java.lang.reflect.Type) wildcardClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = shortSerializer24.getSchema(serializerProvider25, (java.lang.reflect.Type) wildcardClass29);
        java.lang.String str32 = shortSerializer24._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        java.lang.reflect.Type type34 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = shortSerializer24.getSchema(serializerProvider33, type34);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass38 = intLikeSerializer37.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = shortSerializer24.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass38, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = intLikeSerializer13.getSchema(serializerProvider23, (java.lang.reflect.Type) wildcardClass38);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = shortSerializer0.getSchema(serializerProvider12, (java.lang.reflect.Type) wildcardClass38);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer43 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean44 = shortSerializer43.usesObjectId();
        boolean boolean45 = shortSerializer43._isInt;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer46 = shortSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short>) shortSerializer43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "number" + "'", str8, "number");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(jsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberClass20);
        org.junit.Assert.assertNotNull(propertyWriterItor21);
        org.junit.Assert.assertNotNull(numberClass22);
        org.junit.Assert.assertNotNull(floatSerializer26);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "number" + "'", str32, "number");
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(intLikeSerializer37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = doubleSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer7 = doubleSerializer0.createContextual(serializerProvider5, beanProperty6);
        boolean boolean8 = jsonSerializer7.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(doubleSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        java.lang.String str8 = shortSerializer0._schemaType;
        boolean boolean9 = shortSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = shortSerializer18.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.reflect.Type type21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = shortSerializer18.getSchema(serializerProvider20, type21, true);
        java.lang.Class<java.lang.Short> shortClass24 = shortSerializer18.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = floatSerializer12.getSchema(serializerProvider17, (java.lang.reflect.Type) shortClass24);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor26 = floatSerializer12.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer28 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = shortSerializer28.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        java.lang.reflect.Type type31 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = shortSerializer28.getSchema(serializerProvider30, type31, true);
        java.lang.Class<java.lang.Short> shortClass34 = shortSerializer28.handledType();
        boolean boolean35 = floatSerializer12.isEmpty(serializerProvider27, (java.lang.Object) shortSerializer28);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer37 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass42 = intLikeSerializer41.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = floatSerializer39.getSchema(serializerProvider40, (java.lang.reflect.Type) wildcardClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = shortSerializer37.getSchema(serializerProvider38, (java.lang.reflect.Type) wildcardClass42);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer46 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean47 = shortSerializer46.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        boolean boolean50 = shortSerializer46.isEmpty(serializerProvider48, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer52 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean54 = shortSerializer52.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer56 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer58 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass59 = intLikeSerializer58.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = floatSerializer56.getSchema(serializerProvider57, (java.lang.reflect.Type) wildcardClass59);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = shortSerializer52.getSchema(serializerProvider55, (java.lang.reflect.Type) wildcardClass59);
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = shortSerializer46.getSchema(serializerProvider51, (java.lang.reflect.Type) wildcardClass59, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = shortSerializer37.getSchema(serializerProvider45, (java.lang.reflect.Type) wildcardClass59, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = shortSerializer28.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass59, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = shortSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass59);
        java.lang.String str69 = shortSerializer0._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider70 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer71 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer72 = shortSerializer71.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer73 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer74 = shortSerializer71.unwrappingSerializer(nameTransformer73);
        boolean boolean75 = shortSerializer71.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider76 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty77 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer78 = shortSerializer71.createContextual(serializerProvider76, beanProperty77);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider79 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer80 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider81 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer82 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass83 = intLikeSerializer82.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode84 = integerSerializer80.getSchema(serializerProvider81, (java.lang.reflect.Type) wildcardClass83);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider85 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer86 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass87 = intLikeSerializer86.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode88 = integerSerializer80.getSchema(serializerProvider85, (java.lang.reflect.Type) wildcardClass87);
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = shortSerializer71.getSchema(serializerProvider79, (java.lang.reflect.Type) wildcardClass87);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = shortSerializer0.getSchema(serializerProvider70, (java.lang.reflect.Type) wildcardClass87);
        java.lang.String str91 = shortSerializer0._schemaType;
        java.lang.Class<java.lang.Short> shortClass92 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper93 = null;
        com.fasterxml.jackson.databind.JavaType javaType94 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper93, javaType94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "number" + "'", str8, "number");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(shortClass24);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(propertyWriterItor26);
        org.junit.Assert.assertNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(shortClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatSerializer39);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(floatSerializer56);
        org.junit.Assert.assertNotNull(intLikeSerializer58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "number" + "'", str69, "number");
        org.junit.Assert.assertNull(wildcardJsonSerializer72);
        org.junit.Assert.assertNotNull(shortJsonSerializer74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jsonSerializer78);
        org.junit.Assert.assertNotNull(intLikeSerializer82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(jsonNode84);
        org.junit.Assert.assertNotNull(intLikeSerializer86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(jsonNode88);
        org.junit.Assert.assertNotNull(jsonNode89);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "number" + "'", str91, "number");
        org.junit.Assert.assertNotNull(shortClass92);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass9 = intLikeSerializer8.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer0.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer22 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = shortSerializer22.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        java.lang.reflect.Type type25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = shortSerializer22.getSchema(serializerProvider24, type25, true);
        java.lang.Class<java.lang.Short> shortClass28 = shortSerializer22.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = longSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) shortClass28);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty31 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer32 = longSerializer20.createContextual(serializerProvider30, beanProperty31);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer33 = longSerializer20.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty37 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer38 = intLikeSerializer35.createContextual(serializerProvider36, beanProperty37);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        boolean boolean41 = intLikeSerializer35.isEmpty(serializerProvider39, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass44 = intLikeSerializer43.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = intLikeSerializer35.getSchema(serializerProvider42, (java.lang.reflect.Type) wildcardClass44);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer49 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass50 = intLikeSerializer49.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = floatSerializer47.getSchema(serializerProvider48, (java.lang.reflect.Type) wildcardClass50);
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = intLikeSerializer35.getSchema(serializerProvider46, (java.lang.reflect.Type) wildcardClass50, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider54 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer55 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        boolean boolean56 = floatSerializer55.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer58 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty60 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer61 = intLikeSerializer58.createContextual(serializerProvider59, beanProperty60);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider62 = null;
        boolean boolean64 = intLikeSerializer58.isEmpty(serializerProvider62, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer66 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass67 = intLikeSerializer66.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = intLikeSerializer58.getSchema(serializerProvider65, (java.lang.reflect.Type) wildcardClass67);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider69 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer70 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer72 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass73 = intLikeSerializer72.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode74 = floatSerializer70.getSchema(serializerProvider71, (java.lang.reflect.Type) wildcardClass73);
        com.fasterxml.jackson.databind.JsonNode jsonNode75 = intLikeSerializer58.getSchema(serializerProvider69, (java.lang.reflect.Type) wildcardClass73);
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = floatSerializer55.getSchema(serializerProvider57, (java.lang.reflect.Type) wildcardClass73, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = intLikeSerializer35.getSchema(serializerProvider54, (java.lang.reflect.Type) wildcardClass73, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode80 = longSerializer20.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass73);
        com.fasterxml.jackson.databind.JsonNode jsonNode81 = intLikeSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass73);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper82 = null;
        com.fasterxml.jackson.databind.JavaType javaType83 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper82, javaType83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(shortClass28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(jsonSerializer32);
        org.junit.Assert.assertNull(wildcardJsonSerializer33);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(jsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(floatSerializer47);
        org.junit.Assert.assertNotNull(intLikeSerializer49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(jsonNode51);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer58);
        org.junit.Assert.assertNotNull(jsonSerializer61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(floatSerializer70);
        org.junit.Assert.assertNotNull(intLikeSerializer72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(jsonNode74);
        org.junit.Assert.assertNotNull(jsonNode75);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertNotNull(jsonNode79);
        org.junit.Assert.assertNotNull(jsonNode80);
        org.junit.Assert.assertNotNull(jsonNode81);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean10 = shortSerializer9.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        boolean boolean13 = shortSerializer9.isEmpty(serializerProvider11, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean17 = shortSerializer15.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer19 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass22 = intLikeSerializer21.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = floatSerializer19.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass22);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = shortSerializer15.getSchema(serializerProvider18, (java.lang.reflect.Type) wildcardClass22);
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = shortSerializer9.getSchema(serializerProvider14, (java.lang.reflect.Type) wildcardClass22, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = shortSerializer0.getSchema(serializerProvider8, (java.lang.reflect.Type) wildcardClass22, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = shortSerializer0.createContextual(serializerProvider29, beanProperty30);
        java.lang.Class<java.lang.Short> shortClass32 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer36 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass37 = intLikeSerializer36.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = floatSerializer34.getSchema(serializerProvider35, (java.lang.reflect.Type) wildcardClass37);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer40 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer41 = shortSerializer40.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        java.lang.reflect.Type type43 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = shortSerializer40.getSchema(serializerProvider42, type43, true);
        java.lang.Class<java.lang.Short> shortClass46 = shortSerializer40.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = floatSerializer34.getSchema(serializerProvider39, (java.lang.reflect.Type) shortClass46);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor48 = floatSerializer34.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer50 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = shortSerializer50.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        java.lang.reflect.Type type53 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = shortSerializer50.getSchema(serializerProvider52, type53, true);
        java.lang.Class<java.lang.Short> shortClass56 = shortSerializer50.handledType();
        boolean boolean57 = floatSerializer34.isEmpty(serializerProvider49, (java.lang.Object) shortSerializer50);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider58 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer59 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer61 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider62 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer63 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass64 = intLikeSerializer63.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = floatSerializer61.getSchema(serializerProvider62, (java.lang.reflect.Type) wildcardClass64);
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = shortSerializer59.getSchema(serializerProvider60, (java.lang.reflect.Type) wildcardClass64);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider67 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer68 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean69 = shortSerializer68.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider70 = null;
        boolean boolean72 = shortSerializer68.isEmpty(serializerProvider70, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider73 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer74 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean76 = shortSerializer74.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider77 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer78 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider79 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer80 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass81 = intLikeSerializer80.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode82 = floatSerializer78.getSchema(serializerProvider79, (java.lang.reflect.Type) wildcardClass81);
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = shortSerializer74.getSchema(serializerProvider77, (java.lang.reflect.Type) wildcardClass81);
        com.fasterxml.jackson.databind.JsonNode jsonNode85 = shortSerializer68.getSchema(serializerProvider73, (java.lang.reflect.Type) wildcardClass81, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode87 = shortSerializer59.getSchema(serializerProvider67, (java.lang.reflect.Type) wildcardClass81, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = shortSerializer50.getSchema(serializerProvider58, (java.lang.reflect.Type) wildcardClass81, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = shortSerializer0.getSchema(serializerProvider33, (java.lang.reflect.Type) wildcardClass81);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider91 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty92 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer93 = shortSerializer0.createContextual(serializerProvider91, beanProperty92);
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatSerializer19);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(shortClass32);
        org.junit.Assert.assertNotNull(floatSerializer34);
        org.junit.Assert.assertNotNull(intLikeSerializer36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNull(wildcardJsonSerializer41);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(shortClass46);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(propertyWriterItor48);
        org.junit.Assert.assertNull(wildcardJsonSerializer51);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(shortClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(floatSerializer61);
        org.junit.Assert.assertNotNull(intLikeSerializer63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(floatSerializer78);
        org.junit.Assert.assertNotNull(intLikeSerializer80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(jsonNode82);
        org.junit.Assert.assertNotNull(jsonNode83);
        org.junit.Assert.assertNotNull(jsonNode85);
        org.junit.Assert.assertNotNull(jsonNode87);
        org.junit.Assert.assertNotNull(jsonNode89);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer93);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = shortSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = shortSerializer0.createContextual(serializerProvider2, beanProperty3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = shortSerializer0.createContextual(serializerProvider5, beanProperty6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = shortSerializer0.createContextual(serializerProvider8, beanProperty9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.Throwable throwable12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass18 = intLikeSerializer17.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = floatSerializer15.getSchema(serializerProvider16, (java.lang.reflect.Type) wildcardClass18);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = shortSerializer13.getSchema(serializerProvider14, (java.lang.reflect.Type) wildcardClass18);
        java.lang.String str21 = shortSerializer13._schemaType;
        boolean boolean22 = shortSerializer13.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = shortSerializer13.getDelegatee();
        java.lang.String str24 = shortSerializer13._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        java.lang.Class<java.lang.Object> objClass27 = floatSerializer26.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = shortSerializer13.getSchema(serializerProvider25, (java.lang.reflect.Type) objClass27, false);
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.wrapAndThrow(serializerProvider11, throwable12, (java.lang.Object) objClass27, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(floatSerializer15);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "number" + "'", str21, "number");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "number" + "'", str24, "number");
        org.junit.Assert.assertNotNull(floatSerializer26);
        org.junit.Assert.assertNotNull(objClass27);
        org.junit.Assert.assertNotNull(jsonNode29);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        java.lang.Class<java.lang.Object> objClass1 = longSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer4 = longSerializer0.createContextual(serializerProvider2, beanProperty3);
        boolean boolean5 = longSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer8 = longSerializer0.createContextual(serializerProvider6, beanProperty7);
        boolean boolean10 = jsonSerializer8.isEmpty((java.lang.Short) (short) -1);
        boolean boolean12 = jsonSerializer8.isEmpty((java.lang.Short) (short) 10);
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(jsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = integerSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer7 = integerSerializer0.createContextual(serializerProvider5, beanProperty6);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = shortSerializer8.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.reflect.Type type11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = shortSerializer8.getSchema(serializerProvider10, type11, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean16 = shortSerializer8.isEmpty(serializerProvider14, (java.lang.Short) (short) 0);
        boolean boolean17 = shortSerializer8.usesObjectId();
        java.lang.Class<java.lang.Short> shortClass18 = shortSerializer8.handledType();
        boolean boolean19 = shortSerializer8.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor20 = shortSerializer8.properties();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            integerSerializer0.serialize((java.lang.Object) propertyWriterItor20, jsonGenerator21, serializerProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.util.EmptyIterator cannot be cast to class java.lang.Integer (com.fasterxml.jackson.databind.util.EmptyIterator is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonSerializer7);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor20);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 1L);
        java.lang.Class<java.lang.Number> numberClass7 = intLikeSerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = intLikeSerializer0.properties();
        java.lang.Class<java.lang.Number> numberClass9 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serializeWithType((java.lang.Number) 10.0f, jsonGenerator11, serializerProvider12, typeSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(numberClass7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNotNull(numberClass9);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = shortSerializer0.getSchema(serializerProvider2, type3, true);
        java.lang.Class<java.lang.Short> shortClass6 = shortSerializer0.handledType();
        java.lang.Class<java.lang.Short> shortClass7 = shortSerializer0.handledType();
        boolean boolean8 = shortSerializer0._isInt;
        boolean boolean9 = shortSerializer0.usesObjectId();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(shortClass6);
        org.junit.Assert.assertNotNull(shortClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = doubleSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer7 = doubleSerializer0.createContextual(serializerProvider5, beanProperty6);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = jsonSerializer7.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = jsonSerializer7.isEmpty(serializerProvider9, (java.lang.Short) (short) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = jsonSerializer7.properties();
        boolean boolean13 = jsonSerializer7.isUnwrappingSerializer();
        boolean boolean14 = jsonSerializer7.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = jsonSerializer7.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = jsonSerializer7.properties();
        org.junit.Assert.assertNotNull(doubleSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer3 = shortSerializer0.unwrappingSerializer(nameTransformer2);
        boolean boolean4 = shortSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer6 = shortSerializer0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean10 = shortSerializer8.isEmpty((java.lang.Short) (short) 0);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = shortSerializer8.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = shortSerializer13.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer16 = shortSerializer13.unwrappingSerializer(nameTransformer15);
        java.lang.Class<?> wildcardClass17 = shortJsonSerializer16.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = shortSerializer8.getSchema(serializerProvider12, (java.lang.reflect.Type) wildcardClass17, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer21 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer24 = intLikeSerializer21.createContextual(serializerProvider22, beanProperty23);
        boolean boolean26 = jsonSerializer24.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor27 = jsonSerializer24.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer29 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean31 = shortSerializer29.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass36 = intLikeSerializer35.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = floatSerializer33.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass36);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = shortSerializer29.getSchema(serializerProvider32, (java.lang.reflect.Type) wildcardClass36);
        boolean boolean39 = jsonSerializer24.isEmpty(serializerProvider28, (java.lang.Object) shortSerializer29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass42 = intLikeSerializer41.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = shortSerializer29.getSchema(serializerProvider40, (java.lang.reflect.Type) wildcardClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = shortSerializer8.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = shortSerializer0.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass42, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer48 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = shortSerializer48.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer50 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer51 = shortSerializer48.unwrappingSerializer(nameTransformer50);
        java.lang.String str52 = shortSerializer48._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        boolean boolean55 = shortSerializer48.isEmpty(serializerProvider53, (java.lang.Short) (short) -1);
        java.lang.Class<?> wildcardClass56 = shortSerializer48.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = shortSerializer0.getSchema(serializerProvider47, (java.lang.reflect.Type) wildcardClass56, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer60 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer();
        java.lang.Class<java.lang.Number> numberClass61 = intLikeSerializer60.handledType();
        java.lang.Class<java.lang.Number> numberClass62 = intLikeSerializer60.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = shortSerializer0.getSchema(serializerProvider59, (java.lang.reflect.Type) numberClass62, true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator66 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider67 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer68 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.serializeWithType((java.lang.Short) (short) 100, jsonGenerator66, serializerProvider67, typeSerializer68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(shortJsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(shortJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(intLikeSerializer21);
        org.junit.Assert.assertNotNull(jsonSerializer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatSerializer33);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNotNull(shortJsonSerializer51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "number" + "'", str52, "number");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(numberClass61);
        org.junit.Assert.assertNotNull(numberClass62);
        org.junit.Assert.assertNotNull(jsonNode64);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = jsonSerializer3.properties();
        boolean boolean7 = jsonSerializer3.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = jsonSerializer3.unwrappingSerializer(nameTransformer8);
        boolean boolean10 = jsonSerializer3.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = shortSerializer11.properties();
        boolean boolean14 = shortSerializer11.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass21 = intLikeSerializer20.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = floatSerializer18.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass21);
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = shortSerializer16.getSchema(serializerProvider17, (java.lang.reflect.Type) wildcardClass21);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = shortSerializer11.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer();
        java.lang.Class<java.lang.Number> numberClass27 = intLikeSerializer26.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = shortSerializer11.getSchema(serializerProvider25, (java.lang.reflect.Type) numberClass27, false);
        boolean boolean30 = jsonSerializer3.isEmpty((java.lang.Object) shortSerializer11);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor31 = shortSerializer11.properties();
        java.lang.String str32 = shortSerializer11._schemaType;
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatSerializer18);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(numberClass27);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "number" + "'", str32, "number");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass9 = intLikeSerializer8.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer0.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = intLikeSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        java.lang.Class<java.lang.Number> numberClass18 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer21 = intLikeSerializer0.createContextual(serializerProvider19, beanProperty20);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor22 = intLikeSerializer0.properties();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(numberClass18);
        org.junit.Assert.assertNotNull(jsonSerializer21);
        org.junit.Assert.assertNotNull(propertyWriterItor22);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer10 = intLikeSerializer0.createContextual(serializerProvider8, beanProperty9);
        boolean boolean11 = intLikeSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        java.lang.Class<java.lang.Object> objClass1 = longSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer4 = longSerializer0.createContextual(serializerProvider2, beanProperty3);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer8 = intLikeSerializer5.createContextual(serializerProvider6, beanProperty7);
        boolean boolean9 = jsonSerializer8.usesObjectId();
        boolean boolean11 = jsonSerializer8.isEmpty((java.lang.Number) (-1.0f));
        boolean boolean13 = jsonSerializer8.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer15 = jsonSerializer8.unwrappingSerializer(nameTransformer14);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = jsonSerializer8.properties();
        boolean boolean17 = jsonSerializer4.isEmpty((java.lang.Object) jsonSerializer8);
        boolean boolean18 = jsonSerializer8.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = jsonSerializer8.properties();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(jsonSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(jsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer15);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        java.lang.Class<java.lang.Object> objClass1 = floatSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer3 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass6 = intLikeSerializer5.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = floatSerializer3.getSchema(serializerProvider4, (java.lang.reflect.Type) wildcardClass6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = shortSerializer9.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = shortSerializer9.getSchema(serializerProvider11, type12, true);
        java.lang.Class<java.lang.Short> shortClass15 = shortSerializer9.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer3.getSchema(serializerProvider8, (java.lang.reflect.Type) shortClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = floatSerializer0.getSchema(serializerProvider2, (java.lang.reflect.Type) shortClass15);
        java.lang.Class<java.lang.Object> objClass18 = floatSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer21 = floatSerializer0.createContextual(serializerProvider19, beanProperty20);
        boolean boolean22 = floatSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer28 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass33 = intLikeSerializer32.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = floatSerializer30.getSchema(serializerProvider31, (java.lang.reflect.Type) wildcardClass33);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = shortSerializer28.getSchema(serializerProvider29, (java.lang.reflect.Type) wildcardClass33);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = floatSerializer26.getSchema(serializerProvider27, (java.lang.reflect.Type) wildcardClass33);
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = longSerializer24.getSchema(serializerProvider25, (java.lang.reflect.Type) wildcardClass33);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = floatSerializer0.getSchema(serializerProvider23, (java.lang.reflect.Type) wildcardClass33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty40 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer41 = floatSerializer0.createContextual(serializerProvider39, beanProperty40);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor42 = floatSerializer0.properties();
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(floatSerializer3);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(shortClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(objClass18);
        org.junit.Assert.assertNotNull(jsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(longSerializer24);
        org.junit.Assert.assertNotNull(floatSerializer30);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonSerializer41);
        org.junit.Assert.assertNotNull(propertyWriterItor42);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        boolean boolean2 = intLikeSerializer0.isEmpty((java.lang.Number) (-1.0f));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = intLikeSerializer0.properties();
        boolean boolean4 = intLikeSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Throwable throwable6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean9 = shortSerializer7.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        boolean boolean12 = shortSerializer7.isEmpty(serializerProvider10, (java.lang.Short) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.wrapAndThrow(serializerProvider5, throwable6, (java.lang.Object) boolean12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = jsonSerializer3.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean10 = shortSerializer8.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = shortSerializer8.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean18 = jsonSerializer3.isEmpty(serializerProvider7, (java.lang.Object) shortSerializer8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass21 = intLikeSerializer20.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = shortSerializer8.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = shortSerializer8.createContextual(serializerProvider23, beanProperty24);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType26 = shortSerializer8._numberType;
        java.lang.String str27 = shortSerializer8._schemaType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer8.acceptJsonFormatVisitor(jsonFormatVisitorWrapper28, javaType29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer25);
        org.junit.Assert.assertTrue("'" + numberType26 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType26.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "number" + "'", str27, "number");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer5 = intLikeSerializer2.createContextual(serializerProvider3, beanProperty4);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean8 = intLikeSerializer2.isEmpty(serializerProvider6, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass11 = intLikeSerializer10.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = intLikeSerializer2.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass11);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = doubleSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer();
        java.lang.Class<java.lang.Number> numberClass16 = intLikeSerializer15.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = doubleSerializer0.getSchema(serializerProvider14, (java.lang.reflect.Type) numberClass16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer20 = doubleSerializer0.createContextual(serializerProvider18, beanProperty19);
        boolean boolean21 = doubleSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer22 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = shortSerializer22.properties();
        boolean boolean25 = shortSerializer22.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer29 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass32 = intLikeSerializer31.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = floatSerializer29.getSchema(serializerProvider30, (java.lang.reflect.Type) wildcardClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = shortSerializer27.getSchema(serializerProvider28, (java.lang.reflect.Type) wildcardClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = shortSerializer22.getSchema(serializerProvider26, (java.lang.reflect.Type) wildcardClass32);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer37 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass40 = intLikeSerializer39.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = doubleSerializer37.getSchema(serializerProvider38, (java.lang.reflect.Type) wildcardClass40);
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = shortSerializer22.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass40, false);
        boolean boolean44 = doubleSerializer0.isEmpty((java.lang.Object) shortSerializer22);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer46 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer47 = shortSerializer46.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider48 = null;
        java.lang.reflect.Type type49 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = shortSerializer46.getSchema(serializerProvider48, type49, true);
        boolean boolean52 = shortSerializer46.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer54 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty56 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer57 = longSerializer54.createContextual(serializerProvider55, beanProperty56);
        boolean boolean59 = longSerializer54.isEmpty((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer61 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider62 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer63 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass64 = intLikeSerializer63.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = doubleSerializer61.getSchema(serializerProvider62, (java.lang.reflect.Type) wildcardClass64);
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = longSerializer54.getSchema(serializerProvider60, (java.lang.reflect.Type) wildcardClass64);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = shortSerializer46.getSchema(serializerProvider53, (java.lang.reflect.Type) wildcardClass64);
        boolean boolean69 = shortSerializer46.isEmpty((java.lang.Short) (short) 10);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor70 = shortSerializer46.properties();
        java.lang.Class<java.lang.Short> shortClass71 = shortSerializer46.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = doubleSerializer0.getSchema(serializerProvider45, (java.lang.reflect.Type) shortClass71, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty75 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer76 = doubleSerializer0.createContextual(serializerProvider74, beanProperty75);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(jsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(numberClass16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatSerializer29);
        org.junit.Assert.assertNotNull(intLikeSerializer31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(intLikeSerializer39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer47);
        org.junit.Assert.assertNotNull(jsonNode51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(longSerializer54);
        org.junit.Assert.assertNotNull(jsonSerializer57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleSerializer61);
        org.junit.Assert.assertNotNull(intLikeSerializer63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor70);
        org.junit.Assert.assertNotNull(shortClass71);
        org.junit.Assert.assertNotNull(jsonNode73);
        org.junit.Assert.assertNotNull(jsonSerializer76);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = jsonSerializer3.properties();
        boolean boolean7 = jsonSerializer3.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass11 = intLikeSerializer10.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = floatSerializer8.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = shortSerializer14.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.reflect.Type type17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = shortSerializer14.getSchema(serializerProvider16, type17, true);
        java.lang.Class<java.lang.Short> shortClass20 = shortSerializer14.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = floatSerializer8.getSchema(serializerProvider13, (java.lang.reflect.Type) shortClass20);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor22 = floatSerializer8.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer24 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = shortSerializer24.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        java.lang.reflect.Type type27 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = shortSerializer24.getSchema(serializerProvider26, type27, true);
        java.lang.Class<java.lang.Short> shortClass30 = shortSerializer24.handledType();
        boolean boolean31 = floatSerializer8.isEmpty(serializerProvider23, (java.lang.Object) shortSerializer24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer33 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass38 = intLikeSerializer37.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = floatSerializer35.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass38);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = shortSerializer33.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass38);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer42 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean43 = shortSerializer42.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        boolean boolean46 = shortSerializer42.isEmpty(serializerProvider44, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer48 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean50 = shortSerializer48.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer54 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass55 = intLikeSerializer54.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = floatSerializer52.getSchema(serializerProvider53, (java.lang.reflect.Type) wildcardClass55);
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = shortSerializer48.getSchema(serializerProvider51, (java.lang.reflect.Type) wildcardClass55);
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = shortSerializer42.getSchema(serializerProvider47, (java.lang.reflect.Type) wildcardClass55, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = shortSerializer33.getSchema(serializerProvider41, (java.lang.reflect.Type) wildcardClass55, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = shortSerializer24.getSchema(serializerProvider32, (java.lang.reflect.Type) wildcardClass55, false);
        boolean boolean64 = jsonSerializer3.isEmpty((java.lang.Object) shortSerializer24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        java.lang.Object obj66 = null;
        boolean boolean67 = jsonSerializer3.isEmpty(serializerProvider65, obj66);
        boolean boolean69 = jsonSerializer3.isEmpty((java.lang.Short) (short) -1);
        boolean boolean70 = jsonSerializer3.isUnwrappingSerializer();
        boolean boolean72 = jsonSerializer3.isEmpty((java.lang.Short) (short) 0);
        boolean boolean74 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer75 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer76 = jsonSerializer3.unwrappingSerializer(nameTransformer75);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider77 = null;
        boolean boolean79 = numberJsonSerializer76.isEmpty(serializerProvider77, (java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatSerializer8);
        org.junit.Assert.assertNotNull(intLikeSerializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(shortClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(propertyWriterItor22);
        org.junit.Assert.assertNull(wildcardJsonSerializer25);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(shortClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatSerializer35);
        org.junit.Assert.assertNotNull(intLikeSerializer37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(floatSerializer52);
        org.junit.Assert.assertNotNull(intLikeSerializer54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertNotNull(jsonNode57);
        org.junit.Assert.assertNotNull(jsonNode59);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(numberJsonSerializer76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        java.lang.Class<java.lang.Object> objClass1 = floatSerializer0.handledType();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean4 = shortSerializer2.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer9 = intLikeSerializer6.createContextual(serializerProvider7, beanProperty8);
        java.lang.Class<?> wildcardClass10 = jsonSerializer9.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = shortSerializer2.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = shortSerializer2.isEmpty(serializerProvider12, (java.lang.Short) (short) 10);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.serialize((java.lang.Object) shortSerializer2, jsonGenerator15, serializerProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer cannot be cast to class java.lang.Float (com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer is in unnamed module of loader 'app'; java.lang.Float is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(shortSerializer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(jsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer9 = intLikeSerializer0.createContextual(serializerProvider7, beanProperty8);
        boolean boolean11 = intLikeSerializer0.isEmpty((java.lang.Number) 1.0f);
        java.lang.Class<java.lang.Number> numberClass12 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.serialize((java.lang.Number) 10, jsonGenerator14, serializerProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numberClass12);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = shortSerializer0.getSchema(serializerProvider2, type3, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean8 = shortSerializer0.isEmpty(serializerProvider6, (java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass13 = intLikeSerializer12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = floatSerializer10.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass13);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = shortSerializer16.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = shortSerializer16.getSchema(serializerProvider18, type19, true);
        java.lang.Class<java.lang.Short> shortClass22 = shortSerializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = floatSerializer10.getSchema(serializerProvider15, (java.lang.reflect.Type) shortClass22);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = floatSerializer10.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer26 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer27 = shortSerializer26.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        java.lang.reflect.Type type29 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = shortSerializer26.getSchema(serializerProvider28, type29, true);
        java.lang.Class<java.lang.Short> shortClass32 = shortSerializer26.handledType();
        boolean boolean33 = floatSerializer10.isEmpty(serializerProvider25, (java.lang.Object) shortSerializer26);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer35 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass40 = intLikeSerializer39.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = floatSerializer37.getSchema(serializerProvider38, (java.lang.reflect.Type) wildcardClass40);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = shortSerializer35.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass40);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer44 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean45 = shortSerializer44.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        boolean boolean48 = shortSerializer44.isEmpty(serializerProvider46, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer50 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean52 = shortSerializer50.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer54 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer56 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass57 = intLikeSerializer56.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = floatSerializer54.getSchema(serializerProvider55, (java.lang.reflect.Type) wildcardClass57);
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = shortSerializer50.getSchema(serializerProvider53, (java.lang.reflect.Type) wildcardClass57);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = shortSerializer44.getSchema(serializerProvider49, (java.lang.reflect.Type) wildcardClass57, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = shortSerializer35.getSchema(serializerProvider43, (java.lang.reflect.Type) wildcardClass57, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = shortSerializer26.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass57, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = shortSerializer0.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass57, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer68 = shortSerializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatSerializer10);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(shortClass22);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
        org.junit.Assert.assertNull(wildcardJsonSerializer27);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(shortClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatSerializer37);
        org.junit.Assert.assertNotNull(intLikeSerializer39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(floatSerializer54);
        org.junit.Assert.assertNotNull(intLikeSerializer56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(jsonNode59);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNull(wildcardJsonSerializer68);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = shortSerializer0.properties();
        boolean boolean3 = shortSerializer0.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer5 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer9 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass10 = intLikeSerializer9.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = floatSerializer7.getSchema(serializerProvider8, (java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = shortSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = shortSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) wildcardClass10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = shortSerializer0.createContextual(serializerProvider15, beanProperty16);
        boolean boolean18 = shortSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer23 = intLikeSerializer20.createContextual(serializerProvider21, beanProperty22);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        boolean boolean26 = intLikeSerializer20.isEmpty(serializerProvider24, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass29 = intLikeSerializer28.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = intLikeSerializer20.getSchema(serializerProvider27, (java.lang.reflect.Type) wildcardClass29);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = intLikeSerializer20.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer33 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass36 = intLikeSerializer35.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = integerSerializer33.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass36);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass40 = intLikeSerializer39.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = integerSerializer33.getSchema(serializerProvider38, (java.lang.reflect.Type) wildcardClass40);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = intLikeSerializer20.getSchema(serializerProvider32, (java.lang.reflect.Type) wildcardClass40);
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = shortSerializer0.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass40);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty45 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer46 = shortSerializer0.createContextual(serializerProvider44, beanProperty45);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatSerializer7);
        org.junit.Assert.assertNotNull(intLikeSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer20);
        org.junit.Assert.assertNotNull(jsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(intLikeSerializer39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNotNull(jsonSerializer46);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass9 = intLikeSerializer8.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer0.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15, false);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        boolean boolean21 = intLikeSerializer0.isEmpty(serializerProvider19, (java.lang.Number) (short) -1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer23 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean25 = shortSerializer23.isEmpty((java.lang.Short) (short) 0);
        java.lang.Class<java.lang.Short> shortClass26 = shortSerializer23.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer28 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer30 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass33 = intLikeSerializer32.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = integerSerializer30.getSchema(serializerProvider31, (java.lang.reflect.Type) wildcardClass33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer36 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass37 = intLikeSerializer36.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = integerSerializer30.getSchema(serializerProvider35, (java.lang.reflect.Type) wildcardClass37);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = floatSerializer28.getSchema(serializerProvider29, (java.lang.reflect.Type) wildcardClass37);
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = shortSerializer23.getSchema(serializerProvider27, (java.lang.reflect.Type) wildcardClass37, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = intLikeSerializer0.getSchema(serializerProvider22, (java.lang.reflect.Type) wildcardClass37, false);
        boolean boolean44 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty46 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer47 = intLikeSerializer0.createContextual(serializerProvider45, beanProperty46);
        boolean boolean49 = intLikeSerializer0.isEmpty((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortClass26);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(intLikeSerializer36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonSerializer47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer8 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass9 = intLikeSerializer8.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = intLikeSerializer0.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = intLikeSerializer0.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15, false);
        boolean boolean19 = intLikeSerializer0.usesObjectId();
        boolean boolean21 = intLikeSerializer0.isEmpty((java.lang.Number) (-1.0f));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer23 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer26 = intLikeSerializer23.createContextual(serializerProvider24, beanProperty25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        boolean boolean29 = intLikeSerializer23.isEmpty(serializerProvider27, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer33 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer35 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer37 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass38 = intLikeSerializer37.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = integerSerializer35.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass38);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass42 = intLikeSerializer41.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = integerSerializer35.getSchema(serializerProvider40, (java.lang.reflect.Type) wildcardClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = floatSerializer33.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = shortSerializer31.getSchema(serializerProvider32, (java.lang.reflect.Type) wildcardClass42);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = intLikeSerializer23.getSchema(serializerProvider30, (java.lang.reflect.Type) wildcardClass42);
        java.lang.Class<java.lang.Number> numberClass47 = intLikeSerializer23.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = intLikeSerializer0.getSchema(serializerProvider22, (java.lang.reflect.Type) numberClass47);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        boolean boolean51 = intLikeSerializer0.isEmpty(serializerProvider49, (java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer23);
        org.junit.Assert.assertNotNull(jsonSerializer26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortSerializer31);
        org.junit.Assert.assertNotNull(intLikeSerializer37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(intLikeSerializer41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNotNull(numberClass47);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = jsonSerializer3.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean10 = shortSerializer8.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass15 = intLikeSerializer14.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = floatSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass15);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = shortSerializer8.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean18 = jsonSerializer3.isEmpty(serializerProvider7, (java.lang.Object) shortSerializer8);
        boolean boolean20 = jsonSerializer3.isEmpty((java.lang.Object) false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = jsonSerializer3.getDelegatee();
        boolean boolean23 = jsonSerializer3.isEmpty((java.lang.Short) (short) 1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer25 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean29 = shortSerializer27.isEmpty((java.lang.Short) (short) 0);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor30 = shortSerializer27.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer32 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer33 = shortSerializer32.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer34 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer35 = shortSerializer32.unwrappingSerializer(nameTransformer34);
        java.lang.Class<?> wildcardClass36 = shortJsonSerializer35.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = shortSerializer27.getSchema(serializerProvider31, (java.lang.reflect.Type) wildcardClass36, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = shortSerializer25.getSchema(serializerProvider26, (java.lang.reflect.Type) wildcardClass36);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer41 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass44 = intLikeSerializer43.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = integerSerializer41.getSchema(serializerProvider42, (java.lang.reflect.Type) wildcardClass44);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass48 = intLikeSerializer47.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = integerSerializer41.getSchema(serializerProvider46, (java.lang.reflect.Type) wildcardClass48);
        java.lang.Class<java.lang.Object> objClass50 = integerSerializer41.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty54 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer55 = intLikeSerializer52.createContextual(serializerProvider53, beanProperty54);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = null;
        boolean boolean58 = intLikeSerializer52.isEmpty(serializerProvider56, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer60 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider61 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer62 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider63 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer64 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass65 = intLikeSerializer64.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = floatSerializer62.getSchema(serializerProvider63, (java.lang.reflect.Type) wildcardClass65);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = shortSerializer60.getSchema(serializerProvider61, (java.lang.reflect.Type) wildcardClass65);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer69 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean70 = shortSerializer69.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        boolean boolean73 = shortSerializer69.isEmpty(serializerProvider71, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer75 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean77 = shortSerializer75.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider78 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer79 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider80 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer81 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass82 = intLikeSerializer81.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = floatSerializer79.getSchema(serializerProvider80, (java.lang.reflect.Type) wildcardClass82);
        com.fasterxml.jackson.databind.JsonNode jsonNode84 = shortSerializer75.getSchema(serializerProvider78, (java.lang.reflect.Type) wildcardClass82);
        com.fasterxml.jackson.databind.JsonNode jsonNode86 = shortSerializer69.getSchema(serializerProvider74, (java.lang.reflect.Type) wildcardClass82, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode88 = shortSerializer60.getSchema(serializerProvider68, (java.lang.reflect.Type) wildcardClass82, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = intLikeSerializer52.getSchema(serializerProvider59, (java.lang.reflect.Type) wildcardClass82);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = integerSerializer41.getSchema(serializerProvider51, (java.lang.reflect.Type) wildcardClass82);
        com.fasterxml.jackson.databind.JsonNode jsonNode92 = shortSerializer25.getSchema(serializerProvider40, (java.lang.reflect.Type) wildcardClass82, true);
        boolean boolean93 = jsonSerializer3.isEmpty(serializerProvider24, (java.lang.Object) true);
        boolean boolean95 = jsonSerializer3.isEmpty((java.lang.Number) 100L);
        boolean boolean96 = jsonSerializer3.usesObjectId();
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatSerializer12);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor30);
        org.junit.Assert.assertNull(wildcardJsonSerializer33);
        org.junit.Assert.assertNotNull(shortJsonSerializer35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(intLikeSerializer43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(intLikeSerializer47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertNotNull(objClass50);
        org.junit.Assert.assertNotNull(intLikeSerializer52);
        org.junit.Assert.assertNotNull(jsonSerializer55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(floatSerializer62);
        org.junit.Assert.assertNotNull(intLikeSerializer64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(floatSerializer79);
        org.junit.Assert.assertNotNull(intLikeSerializer81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(jsonNode83);
        org.junit.Assert.assertNotNull(jsonNode84);
        org.junit.Assert.assertNotNull(jsonNode86);
        org.junit.Assert.assertNotNull(jsonNode88);
        org.junit.Assert.assertNotNull(jsonNode89);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNotNull(jsonNode92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        java.lang.Class<java.lang.Object> objClass1 = longSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer4 = longSerializer0.createContextual(serializerProvider2, beanProperty3);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer8 = intLikeSerializer5.createContextual(serializerProvider6, beanProperty7);
        boolean boolean9 = jsonSerializer8.usesObjectId();
        boolean boolean11 = jsonSerializer8.isEmpty((java.lang.Number) (-1.0f));
        boolean boolean13 = jsonSerializer8.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer15 = jsonSerializer8.unwrappingSerializer(nameTransformer14);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = jsonSerializer8.properties();
        boolean boolean17 = jsonSerializer4.isEmpty((java.lang.Object) jsonSerializer8);
        boolean boolean18 = jsonSerializer8.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer19 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor20 = shortSerializer19.properties();
        boolean boolean22 = shortSerializer19.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer24 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer28 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass29 = intLikeSerializer28.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = floatSerializer26.getSchema(serializerProvider27, (java.lang.reflect.Type) wildcardClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = shortSerializer24.getSchema(serializerProvider25, (java.lang.reflect.Type) wildcardClass29);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = shortSerializer19.getSchema(serializerProvider23, (java.lang.reflect.Type) wildcardClass29);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer33 = shortSerializer19.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer36 = shortSerializer19.createContextual(serializerProvider34, beanProperty35);
        boolean boolean37 = shortSerializer19.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty41 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer42 = intLikeSerializer39.createContextual(serializerProvider40, beanProperty41);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        boolean boolean45 = intLikeSerializer39.isEmpty(serializerProvider43, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass48 = intLikeSerializer47.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = intLikeSerializer39.getSchema(serializerProvider46, (java.lang.reflect.Type) wildcardClass48);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer50 = intLikeSerializer39.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer52 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider53 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer54 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass55 = intLikeSerializer54.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = integerSerializer52.getSchema(serializerProvider53, (java.lang.reflect.Type) wildcardClass55);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider57 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer58 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass59 = intLikeSerializer58.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = integerSerializer52.getSchema(serializerProvider57, (java.lang.reflect.Type) wildcardClass59);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = intLikeSerializer39.getSchema(serializerProvider51, (java.lang.reflect.Type) wildcardClass59);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = shortSerializer19.getSchema(serializerProvider38, (java.lang.reflect.Type) wildcardClass59);
        boolean boolean63 = shortSerializer19.usesObjectId();
        boolean boolean64 = jsonSerializer8.isEmpty((java.lang.Object) boolean63);
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(jsonSerializer4);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(jsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer15);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatSerializer26);
        org.junit.Assert.assertNotNull(intLikeSerializer28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNull(wildcardJsonSerializer33);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer39);
        org.junit.Assert.assertNotNull(jsonSerializer42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertNull(wildcardJsonSerializer50);
        org.junit.Assert.assertNotNull(intLikeSerializer54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertNotNull(intLikeSerializer58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        java.lang.String str8 = shortSerializer0._schemaType;
        boolean boolean9 = shortSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = shortSerializer0.createContextual(serializerProvider11, beanProperty12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer15 = shortSerializer0.unwrappingSerializer(nameTransformer14);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = shortJsonSerializer15.getDelegatee();
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "number" + "'", str8, "number");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(shortJsonSerializer15);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean4 = intLikeSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer10 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass13 = intLikeSerializer12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = integerSerializer10.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass13);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass17 = intLikeSerializer16.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = integerSerializer10.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = floatSerializer8.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = shortSerializer6.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass17);
        java.lang.Class<java.lang.Short> shortClass21 = shortSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = intLikeSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) shortClass21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty24 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer25 = intLikeSerializer0.createContextual(serializerProvider23, beanProperty24);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer29 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass30 = intLikeSerializer29.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = integerSerializer27.getSchema(serializerProvider28, (java.lang.reflect.Type) wildcardClass30);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass34 = intLikeSerializer33.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = integerSerializer27.getSchema(serializerProvider32, (java.lang.reflect.Type) wildcardClass34);
        java.lang.Class<java.lang.Object> objClass36 = integerSerializer27.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = intLikeSerializer0.getSchema(serializerProvider26, (java.lang.reflect.Type) objClass36);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer39 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty41 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer42 = longSerializer39.createContextual(serializerProvider40, beanProperty41);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty44 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer45 = longSerializer39.createContextual(serializerProvider43, beanProperty44);
        java.lang.Class<java.lang.Object> objClass46 = longSerializer39.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = intLikeSerializer0.getSchema(serializerProvider38, (java.lang.reflect.Type) objClass46, true);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper49 = null;
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper49, javaType50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortSerializer6);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(shortClass21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(objClass36);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(longSerializer39);
        org.junit.Assert.assertNotNull(jsonSerializer42);
        org.junit.Assert.assertNotNull(jsonSerializer45);
        org.junit.Assert.assertNotNull(objClass46);
        org.junit.Assert.assertNotNull(jsonNode48);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = integerSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer6 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean8 = shortSerializer6.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer10 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass13 = intLikeSerializer12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = floatSerializer10.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass13);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = shortSerializer6.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass13);
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = integerSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass13);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty19 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer20 = intLikeSerializer17.createContextual(serializerProvider18, beanProperty19);
        boolean boolean22 = jsonSerializer20.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = jsonSerializer20.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer25 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean27 = shortSerializer25.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer29 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass32 = intLikeSerializer31.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = floatSerializer29.getSchema(serializerProvider30, (java.lang.reflect.Type) wildcardClass32);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = shortSerializer25.getSchema(serializerProvider28, (java.lang.reflect.Type) wildcardClass32);
        boolean boolean35 = jsonSerializer20.isEmpty(serializerProvider24, (java.lang.Object) shortSerializer25);
        boolean boolean37 = jsonSerializer20.isEmpty((java.lang.Object) false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = jsonSerializer20.getDelegatee();
        boolean boolean39 = jsonSerializer20.usesObjectId();
        boolean boolean41 = jsonSerializer20.isEmpty((java.lang.Short) (short) 1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer42 = jsonSerializer20.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider43 = null;
        boolean boolean45 = jsonSerializer20.isEmpty(serializerProvider43, (java.lang.Short) (short) -1);
        boolean boolean47 = jsonSerializer20.isEmpty((java.lang.Short) (short) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer50 = null;
        // The following exception was thrown during execution in test generation
        try {
            integerSerializer0.serializeWithType((java.lang.Object) (short) -1, jsonGenerator48, serializerProvider49, typeSerializer50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatSerializer10);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(jsonSerializer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatSerializer29);
        org.junit.Assert.assertNotNull(intLikeSerializer31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = longSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer6 = longSerializer0.createContextual(serializerProvider4, beanProperty5);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty8 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer9 = longSerializer0.createContextual(serializerProvider7, beanProperty8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer14 = longSerializer11.createContextual(serializerProvider12, beanProperty13);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer17 = longSerializer11.createContextual(serializerProvider15, beanProperty16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.reflect.Type type19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = longSerializer11.getSchema(serializerProvider18, type19);
        java.lang.Class<?> wildcardClass21 = jsonNode20.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = longSerializer0.getSchema(serializerProvider10, (java.lang.reflect.Type) wildcardClass21);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = longSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty25 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer26 = longSerializer0.createContextual(serializerProvider24, beanProperty25);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer29 = longSerializer0.createContextual(serializerProvider27, beanProperty28);
        org.junit.Assert.assertNotNull(longSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertNotNull(jsonSerializer6);
        org.junit.Assert.assertNotNull(jsonSerializer9);
        org.junit.Assert.assertNotNull(longSerializer11);
        org.junit.Assert.assertNotNull(jsonSerializer14);
        org.junit.Assert.assertNotNull(jsonSerializer17);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
        org.junit.Assert.assertNotNull(jsonSerializer26);
        org.junit.Assert.assertNotNull(jsonSerializer29);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        java.lang.String str8 = shortSerializer0._schemaType;
        boolean boolean9 = shortSerializer0.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType10 = shortSerializer0._numberType;
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = shortSerializer0.properties();
        boolean boolean12 = shortSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer17 = intLikeSerializer14.createContextual(serializerProvider15, beanProperty16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        boolean boolean20 = intLikeSerializer14.isEmpty(serializerProvider18, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer22 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass27 = intLikeSerializer26.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = floatSerializer24.getSchema(serializerProvider25, (java.lang.reflect.Type) wildcardClass27);
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = shortSerializer22.getSchema(serializerProvider23, (java.lang.reflect.Type) wildcardClass27);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer31 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean32 = shortSerializer31.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        boolean boolean35 = shortSerializer31.isEmpty(serializerProvider33, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer37 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean39 = shortSerializer37.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider40 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer41 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass44 = intLikeSerializer43.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = floatSerializer41.getSchema(serializerProvider42, (java.lang.reflect.Type) wildcardClass44);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = shortSerializer37.getSchema(serializerProvider40, (java.lang.reflect.Type) wildcardClass44);
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = shortSerializer31.getSchema(serializerProvider36, (java.lang.reflect.Type) wildcardClass44, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = shortSerializer22.getSchema(serializerProvider30, (java.lang.reflect.Type) wildcardClass44, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = intLikeSerializer14.getSchema(serializerProvider21, (java.lang.reflect.Type) wildcardClass44);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty53 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer54 = intLikeSerializer14.createContextual(serializerProvider52, beanProperty53);
        boolean boolean55 = intLikeSerializer14.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer57 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        java.lang.Class<java.lang.Object> objClass58 = floatSerializer57.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer60 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider61 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer62 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass63 = intLikeSerializer62.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = floatSerializer60.getSchema(serializerProvider61, (java.lang.reflect.Type) wildcardClass63);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer66 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer67 = shortSerializer66.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        java.lang.reflect.Type type69 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = shortSerializer66.getSchema(serializerProvider68, type69, true);
        java.lang.Class<java.lang.Short> shortClass72 = shortSerializer66.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = floatSerializer60.getSchema(serializerProvider65, (java.lang.reflect.Type) shortClass72);
        com.fasterxml.jackson.databind.JsonNode jsonNode74 = floatSerializer57.getSchema(serializerProvider59, (java.lang.reflect.Type) shortClass72);
        java.lang.Class<java.lang.Object> objClass75 = floatSerializer57.handledType();
        java.lang.Class<java.lang.Object> objClass76 = floatSerializer57.handledType();
        java.lang.Class<?> wildcardClass77 = floatSerializer57.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = intLikeSerializer14.getSchema(serializerProvider56, (java.lang.reflect.Type) wildcardClass77, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode81 = shortSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass77, false);
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "number" + "'", str8, "number");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + numberType10 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType10.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(propertyWriterItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer14);
        org.junit.Assert.assertNotNull(jsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatSerializer24);
        org.junit.Assert.assertNotNull(intLikeSerializer26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatSerializer41);
        org.junit.Assert.assertNotNull(intLikeSerializer43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(jsonNode51);
        org.junit.Assert.assertNotNull(jsonSerializer54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(floatSerializer57);
        org.junit.Assert.assertNotNull(objClass58);
        org.junit.Assert.assertNotNull(floatSerializer60);
        org.junit.Assert.assertNotNull(intLikeSerializer62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertNull(wildcardJsonSerializer67);
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNotNull(shortClass72);
        org.junit.Assert.assertNotNull(jsonNode73);
        org.junit.Assert.assertNotNull(jsonNode74);
        org.junit.Assert.assertNotNull(objClass75);
        org.junit.Assert.assertNotNull(objClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(jsonNode79);
        org.junit.Assert.assertNotNull(jsonNode81);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean2 = shortSerializer0.isEmpty((java.lang.Short) (short) 0);
        boolean boolean3 = shortSerializer0._isInt;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = shortSerializer0.properties();
        boolean boolean3 = shortSerializer0.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer5 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass8 = intLikeSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = integerSerializer5.getSchema(serializerProvider6, (java.lang.reflect.Type) wildcardClass8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer11 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass12 = intLikeSerializer11.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = integerSerializer5.getSchema(serializerProvider10, (java.lang.reflect.Type) wildcardClass12);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = shortSerializer0.getSchema(serializerProvider4, (java.lang.reflect.Type) wildcardClass12, false);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType17 = shortSerializer0._numberType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            shortSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(intLikeSerializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
        org.junit.Assert.assertTrue("'" + numberType17 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType17.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = shortSerializer0.getSchema(serializerProvider2, type3, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean8 = shortSerializer0.isEmpty(serializerProvider6, (java.lang.Short) (short) 0);
        java.lang.String str9 = shortSerializer0._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = shortSerializer0.createContextual(serializerProvider10, beanProperty11);
        java.lang.Class<java.lang.Short> shortClass13 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = shortSerializer15.properties();
        boolean boolean18 = shortSerializer15.isEmpty((java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer20 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass23 = intLikeSerializer22.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = integerSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) wildcardClass23);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer26 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass27 = intLikeSerializer26.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = integerSerializer20.getSchema(serializerProvider25, (java.lang.reflect.Type) wildcardClass27);
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = shortSerializer15.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass27, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = shortSerializer0.getSchema(serializerProvider14, (java.lang.reflect.Type) wildcardClass27, true);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer34 = shortSerializer0.unwrappingSerializer(nameTransformer33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty36 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer37 = shortSerializer0.createContextual(serializerProvider35, beanProperty36);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer38 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean40 = shortSerializer38.isEmpty((java.lang.Short) (short) 0);
        java.lang.Class<java.lang.Short> shortClass41 = shortSerializer38.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer43 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer45 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer47 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass48 = intLikeSerializer47.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = integerSerializer45.getSchema(serializerProvider46, (java.lang.reflect.Type) wildcardClass48);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider50 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer51 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass52 = intLikeSerializer51.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = integerSerializer45.getSchema(serializerProvider50, (java.lang.reflect.Type) wildcardClass52);
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = floatSerializer43.getSchema(serializerProvider44, (java.lang.reflect.Type) wildcardClass52);
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = shortSerializer38.getSchema(serializerProvider42, (java.lang.reflect.Type) wildcardClass52, false);
        java.lang.Class<java.lang.Short> shortClass57 = shortSerializer38.handledType();
        java.lang.Class<java.lang.Short> shortClass58 = shortSerializer38.handledType();
        boolean boolean60 = shortSerializer38.isEmpty((java.lang.Short) (short) -1);
        boolean boolean61 = shortSerializer38.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider62 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer63 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider64 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer65 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass66 = intLikeSerializer65.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = floatSerializer63.getSchema(serializerProvider64, (java.lang.reflect.Type) wildcardClass66);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer69 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer70 = shortSerializer69.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider71 = null;
        java.lang.reflect.Type type72 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode74 = shortSerializer69.getSchema(serializerProvider71, type72, true);
        java.lang.Class<java.lang.Short> shortClass75 = shortSerializer69.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = floatSerializer63.getSchema(serializerProvider68, (java.lang.reflect.Type) shortClass75);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor77 = floatSerializer63.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider78 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty79 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer80 = floatSerializer63.createContextual(serializerProvider78, beanProperty79);
        boolean boolean81 = floatSerializer63.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider82 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer83 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer84 = shortSerializer83.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer85 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer86 = shortSerializer83.unwrappingSerializer(nameTransformer85);
        java.lang.String str87 = shortSerializer83._schemaType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider88 = null;
        boolean boolean90 = shortSerializer83.isEmpty(serializerProvider88, (java.lang.Short) (short) -1);
        java.lang.Class<?> wildcardClass91 = shortSerializer83.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode92 = floatSerializer63.getSchema(serializerProvider82, (java.lang.reflect.Type) wildcardClass91);
        com.fasterxml.jackson.databind.JsonNode jsonNode93 = shortSerializer38.getSchema(serializerProvider62, (java.lang.reflect.Type) wildcardClass91);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer94 = shortSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short>) shortSerializer38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "number" + "'", str9, "number");
        org.junit.Assert.assertNotNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(shortClass13);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(intLikeSerializer26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(shortJsonSerializer34);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shortClass41);
        org.junit.Assert.assertNotNull(intLikeSerializer47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertNotNull(intLikeSerializer51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertNotNull(jsonNode56);
        org.junit.Assert.assertNotNull(shortClass57);
        org.junit.Assert.assertNotNull(shortClass58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(floatSerializer63);
        org.junit.Assert.assertNotNull(intLikeSerializer65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNull(wildcardJsonSerializer70);
        org.junit.Assert.assertNotNull(jsonNode74);
        org.junit.Assert.assertNotNull(shortClass75);
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertNotNull(propertyWriterItor77);
        org.junit.Assert.assertNotNull(jsonSerializer80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer84);
        org.junit.Assert.assertNotNull(shortJsonSerializer86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "number" + "'", str87, "number");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(jsonNode92);
        org.junit.Assert.assertNotNull(jsonNode93);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer4 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass5 = intLikeSerializer4.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = floatSerializer2.getSchema(serializerProvider3, (java.lang.reflect.Type) wildcardClass5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = shortSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass5);
        java.lang.String str8 = shortSerializer0._schemaType;
        java.lang.Class<java.lang.Short> shortClass9 = shortSerializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer11 = shortSerializer0.unwrappingSerializer(nameTransformer10);
        boolean boolean12 = shortSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer18 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass19 = intLikeSerializer18.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = floatSerializer16.getSchema(serializerProvider17, (java.lang.reflect.Type) wildcardClass19);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = shortSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass19);
        java.lang.String str22 = shortSerializer14._schemaType;
        java.lang.Class<java.lang.Short> shortClass23 = shortSerializer14.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = shortSerializer0.getSchema(serializerProvider13, (java.lang.reflect.Type) shortClass23, false);
        boolean boolean26 = shortSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer29 = shortSerializer0.createContextual(serializerProvider27, beanProperty28);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer31 = shortSerializer0.unwrappingSerializer(nameTransformer30);
        org.junit.Assert.assertNotNull(floatSerializer2);
        org.junit.Assert.assertNotNull(intLikeSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "number" + "'", str8, "number");
        org.junit.Assert.assertNotNull(shortClass9);
        org.junit.Assert.assertNotNull(shortJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatSerializer16);
        org.junit.Assert.assertNotNull(intLikeSerializer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "number" + "'", str22, "number");
        org.junit.Assert.assertNotNull(shortClass23);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer29);
        org.junit.Assert.assertNotNull(shortJsonSerializer31);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = intLikeSerializer0.createContextual(serializerProvider1, beanProperty2);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean6 = intLikeSerializer0.isEmpty(serializerProvider4, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = intLikeSerializer0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = intLikeSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = intLikeSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Throwable throwable11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer12 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer14 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass17 = intLikeSerializer16.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = floatSerializer14.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = shortSerializer12.getSchema(serializerProvider13, (java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer21 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean22 = shortSerializer21.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        boolean boolean25 = shortSerializer21.isEmpty(serializerProvider23, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean29 = shortSerializer27.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer31 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer33 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass34 = intLikeSerializer33.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = floatSerializer31.getSchema(serializerProvider32, (java.lang.reflect.Type) wildcardClass34);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = shortSerializer27.getSchema(serializerProvider30, (java.lang.reflect.Type) wildcardClass34);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = shortSerializer21.getSchema(serializerProvider26, (java.lang.reflect.Type) wildcardClass34, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = shortSerializer12.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass34, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider41 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty42 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer43 = shortSerializer12.createContextual(serializerProvider41, beanProperty42);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer45 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = shortSerializer45.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        java.lang.reflect.Type type48 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = shortSerializer45.getSchema(serializerProvider47, type48, true);
        java.lang.Class<java.lang.Short> shortClass51 = shortSerializer45.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = shortSerializer12.getSchema(serializerProvider44, (java.lang.reflect.Type) shortClass51, false);
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.wrapAndThrow(serializerProvider10, throwable11, (java.lang.Object) serializerProvider44, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNotNull(floatSerializer14);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatSerializer31);
        org.junit.Assert.assertNotNull(intLikeSerializer33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer43);
        org.junit.Assert.assertNull(wildcardJsonSerializer46);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(shortClass51);
        org.junit.Assert.assertNotNull(jsonNode53);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        java.lang.Class<java.lang.Object> objClass1 = floatSerializer0.handledType();
        boolean boolean2 = floatSerializer0.isUnwrappingSerializer();
        boolean boolean3 = floatSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer5 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer8 = intLikeSerializer5.createContextual(serializerProvider6, beanProperty7);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = intLikeSerializer5.isEmpty(serializerProvider9, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer15 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer17 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass18 = intLikeSerializer17.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = floatSerializer15.getSchema(serializerProvider16, (java.lang.reflect.Type) wildcardClass18);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = shortSerializer13.getSchema(serializerProvider14, (java.lang.reflect.Type) wildcardClass18);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer22 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean23 = shortSerializer22.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        boolean boolean26 = shortSerializer22.isEmpty(serializerProvider24, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer28 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean30 = shortSerializer28.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer34 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass35 = intLikeSerializer34.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = floatSerializer32.getSchema(serializerProvider33, (java.lang.reflect.Type) wildcardClass35);
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = shortSerializer28.getSchema(serializerProvider31, (java.lang.reflect.Type) wildcardClass35);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = shortSerializer22.getSchema(serializerProvider27, (java.lang.reflect.Type) wildcardClass35, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = shortSerializer13.getSchema(serializerProvider21, (java.lang.reflect.Type) wildcardClass35, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = intLikeSerializer5.getSchema(serializerProvider12, (java.lang.reflect.Type) wildcardClass35);
        boolean boolean43 = floatSerializer0.isEmpty(serializerProvider4, (java.lang.Object) jsonNode42);
        java.lang.Class<java.lang.Object> objClass44 = floatSerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor45 = floatSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty47 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer48 = floatSerializer0.createContextual(serializerProvider46, beanProperty47);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper49 = null;
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        // The following exception was thrown during execution in test generation
        try {
            floatSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper49, javaType50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer5);
        org.junit.Assert.assertNotNull(jsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(floatSerializer15);
        org.junit.Assert.assertNotNull(intLikeSerializer17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(floatSerializer32);
        org.junit.Assert.assertNotNull(intLikeSerializer34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objClass44);
        org.junit.Assert.assertNotNull(propertyWriterItor45);
        org.junit.Assert.assertNotNull(jsonSerializer48);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = floatSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer6 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = shortSerializer6.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.reflect.Type type9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = shortSerializer6.getSchema(serializerProvider8, type9, true);
        java.lang.Class<java.lang.Short> shortClass12 = shortSerializer6.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = floatSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) shortClass12);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = floatSerializer0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer17 = floatSerializer0.createContextual(serializerProvider15, beanProperty16);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer18 = jsonSerializer17.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = jsonSerializer17.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer21 = jsonSerializer17.unwrappingSerializer(nameTransformer20);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        boolean boolean24 = jsonSerializer17.isEmpty(serializerProvider22, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer25 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer27 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = shortSerializer27.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.reflect.Type type30 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = shortSerializer27.getSchema(serializerProvider29, type30, true);
        java.lang.Class<java.lang.Short> shortClass33 = shortSerializer27.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = longSerializer25.getSchema(serializerProvider26, (java.lang.reflect.Type) shortClass33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty36 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer37 = longSerializer25.createContextual(serializerProvider35, beanProperty36);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer38 = longSerializer25.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty40 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer41 = longSerializer25.createContextual(serializerProvider39, beanProperty40);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty43 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer44 = longSerializer25.createContextual(serializerProvider42, beanProperty43);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer45 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer46 = jsonSerializer44.unwrappingSerializer(nameTransformer45);
        boolean boolean47 = jsonSerializer17.isEmpty((java.lang.Object) shortJsonSerializer46);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer48 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer50 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer52 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass53 = intLikeSerializer52.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = floatSerializer50.getSchema(serializerProvider51, (java.lang.reflect.Type) wildcardClass53);
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = shortSerializer48.getSchema(serializerProvider49, (java.lang.reflect.Type) wildcardClass53);
        java.lang.String str56 = shortSerializer48._schemaType;
        boolean boolean57 = shortSerializer48.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer58 = shortSerializer48.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty60 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer61 = shortSerializer48.createContextual(serializerProvider59, beanProperty60);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Number> numberJsonSerializer62 = jsonSerializer17.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short>) shortSerializer48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatSerializer0);
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(shortClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
        org.junit.Assert.assertNotNull(jsonSerializer17);
        org.junit.Assert.assertNull(wildcardJsonSerializer18);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(shortJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(shortClass33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonSerializer37);
        org.junit.Assert.assertNull(wildcardJsonSerializer38);
        org.junit.Assert.assertNotNull(jsonSerializer41);
        org.junit.Assert.assertNotNull(jsonSerializer44);
        org.junit.Assert.assertNotNull(shortJsonSerializer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(floatSerializer50);
        org.junit.Assert.assertNotNull(intLikeSerializer52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "number" + "'", str56, "number");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer58);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer61);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer2 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass3 = intLikeSerializer2.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = integerSerializer0.getSchema(serializerProvider1, (java.lang.reflect.Type) wildcardClass3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass7 = intLikeSerializer6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = integerSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer10 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean11 = shortSerializer10.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean14 = shortSerializer10.isEmpty(serializerProvider12, (java.lang.Short) (short) 100);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean18 = shortSerializer16.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer20 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer22 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass23 = intLikeSerializer22.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = floatSerializer20.getSchema(serializerProvider21, (java.lang.reflect.Type) wildcardClass23);
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = shortSerializer16.getSchema(serializerProvider19, (java.lang.reflect.Type) wildcardClass23);
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = shortSerializer10.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass23, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = integerSerializer0.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass23);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer30 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer32 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass33 = intLikeSerializer32.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = doubleSerializer30.getSchema(serializerProvider31, (java.lang.reflect.Type) wildcardClass33);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = integerSerializer0.getSchema(serializerProvider29, (java.lang.reflect.Type) wildcardClass33);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty37 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer38 = integerSerializer0.createContextual(serializerProvider36, beanProperty37);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty40 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer41 = integerSerializer0.createContextual(serializerProvider39, beanProperty40);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty43 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer44 = integerSerializer0.createContextual(serializerProvider42, beanProperty43);
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer45 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer46 = shortSerializer45.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer47 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer48 = shortSerializer45.unwrappingSerializer(nameTransformer47);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer49 = shortSerializer45.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider50 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer51 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty53 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer54 = intLikeSerializer51.createContextual(serializerProvider52, beanProperty53);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider55 = null;
        boolean boolean57 = intLikeSerializer51.isEmpty(serializerProvider55, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider58 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer59 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer61 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider62 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer63 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider64 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer65 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass66 = intLikeSerializer65.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = integerSerializer63.getSchema(serializerProvider64, (java.lang.reflect.Type) wildcardClass66);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer69 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass70 = intLikeSerializer69.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = integerSerializer63.getSchema(serializerProvider68, (java.lang.reflect.Type) wildcardClass70);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = floatSerializer61.getSchema(serializerProvider62, (java.lang.reflect.Type) wildcardClass70);
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = shortSerializer59.getSchema(serializerProvider60, (java.lang.reflect.Type) wildcardClass70);
        com.fasterxml.jackson.databind.JsonNode jsonNode74 = intLikeSerializer51.getSchema(serializerProvider58, (java.lang.reflect.Type) wildcardClass70);
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = shortSerializer45.getSchema(serializerProvider50, (java.lang.reflect.Type) wildcardClass70, true);
        boolean boolean77 = shortSerializer45.usesObjectId();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType78 = shortSerializer45._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider79 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer80 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider81 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty82 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer83 = intLikeSerializer80.createContextual(serializerProvider81, beanProperty82);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider84 = null;
        boolean boolean86 = intLikeSerializer80.isEmpty(serializerProvider84, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider87 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer88 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass89 = intLikeSerializer88.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = intLikeSerializer80.getSchema(serializerProvider87, (java.lang.reflect.Type) wildcardClass89);
        java.lang.Class<java.lang.Number> numberClass91 = intLikeSerializer80.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode93 = shortSerializer45.getSchema(serializerProvider79, (java.lang.reflect.Type) numberClass91, false);
        boolean boolean94 = shortSerializer45.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer95 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer96 = shortSerializer45.unwrappingSerializer(nameTransformer95);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator97 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider98 = null;
        // The following exception was thrown during execution in test generation
        try {
            integerSerializer0.serialize((java.lang.Object) shortJsonSerializer96, jsonGenerator97, serializerProvider98);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer cannot be cast to class java.lang.Integer (com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intLikeSerializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(intLikeSerializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatSerializer20);
        org.junit.Assert.assertNotNull(intLikeSerializer22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertNotNull(doubleSerializer30);
        org.junit.Assert.assertNotNull(intLikeSerializer32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(jsonSerializer38);
        org.junit.Assert.assertNotNull(jsonSerializer41);
        org.junit.Assert.assertNotNull(jsonSerializer44);
        org.junit.Assert.assertNull(wildcardJsonSerializer46);
        org.junit.Assert.assertNotNull(shortJsonSerializer48);
        org.junit.Assert.assertNull(wildcardJsonSerializer49);
        org.junit.Assert.assertNotNull(intLikeSerializer51);
        org.junit.Assert.assertNotNull(jsonSerializer54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(shortSerializer59);
        org.junit.Assert.assertNotNull(intLikeSerializer65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNotNull(intLikeSerializer69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertNotNull(jsonNode73);
        org.junit.Assert.assertNotNull(jsonNode74);
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + numberType78 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType78.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(intLikeSerializer80);
        org.junit.Assert.assertNotNull(jsonSerializer83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNotNull(numberClass91);
        org.junit.Assert.assertNotNull(jsonNode93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer96);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer1 = shortSerializer0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        java.lang.reflect.Type type3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = shortSerializer0.getSchema(serializerProvider2, type3, true);
        java.lang.Class<java.lang.Short> shortClass6 = shortSerializer0.handledType();
        java.lang.Class<java.lang.Short> shortClass7 = shortSerializer0.handledType();
        boolean boolean8 = shortSerializer0._isInt;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean11 = shortSerializer0.isEmpty(serializerProvider9, (java.lang.Short) (short) 1);
        org.junit.Assert.assertNull(wildcardJsonSerializer1);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(shortClass6);
        org.junit.Assert.assertNotNull(shortClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer longSerializer0 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = longSerializer0.createContextual(serializerProvider1, beanProperty2);
        java.lang.Class<java.lang.Object> objClass4 = longSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer6 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer10 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer12 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass13 = intLikeSerializer12.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = integerSerializer10.getSchema(serializerProvider11, (java.lang.reflect.Type) wildcardClass13);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer16 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass17 = intLikeSerializer16.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = integerSerializer10.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = floatSerializer8.getSchema(serializerProvider9, (java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = shortSerializer6.getSchema(serializerProvider7, (java.lang.reflect.Type) wildcardClass17);
        java.lang.Class<java.lang.Short> shortClass21 = shortSerializer6.handledType();
        boolean boolean22 = shortSerializer6.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer24 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty26 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer27 = intLikeSerializer24.createContextual(serializerProvider25, beanProperty26);
        boolean boolean28 = jsonSerializer27.usesObjectId();
        boolean boolean30 = jsonSerializer27.isEmpty((java.lang.Number) (-1.0f));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = null;
        boolean boolean33 = jsonSerializer27.isEmpty(serializerProvider31, (java.lang.Number) 10.0d);
        boolean boolean35 = jsonSerializer27.isEmpty((java.lang.Short) (short) 10);
        boolean boolean36 = jsonSerializer27.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer38 = jsonSerializer27.unwrappingSerializer(nameTransformer37);
        java.lang.Class<?> wildcardClass39 = shortJsonSerializer38.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = shortSerializer6.getSchema(serializerProvider23, (java.lang.reflect.Type) wildcardClass39, false);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = longSerializer0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass39);
        org.junit.Assert.assertNotNull(longSerializer0);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertNotNull(objClass4);
        org.junit.Assert.assertNotNull(shortSerializer6);
        org.junit.Assert.assertNotNull(intLikeSerializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(intLikeSerializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(shortClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer24);
        org.junit.Assert.assertNotNull(jsonSerializer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(jsonNode42);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor1 = shortSerializer0.properties();
        boolean boolean3 = shortSerializer0.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = shortSerializer0.properties();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = shortSerializer0._numberType;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer8 = shortSerializer0.createContextual(serializerProvider6, beanProperty7);
        boolean boolean10 = shortSerializer0.isEmpty((java.lang.Short) (short) -1);
        org.junit.Assert.assertNotNull(propertyWriterItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertTrue("'" + numberType5 + "' != '" + com.fasterxml.jackson.core.JsonParser.NumberType.INT + "'", numberType5.equals(com.fasterxml.jackson.core.JsonParser.NumberType.INT));
        org.junit.Assert.assertNotNull(jsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider1 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty2 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer3 = doubleSerializer0.createContextual(serializerProvider1, beanProperty2);
        boolean boolean5 = jsonSerializer3.isEmpty((java.lang.Number) (-1.0d));
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer6 = jsonSerializer3.getDelegatee();
        boolean boolean8 = jsonSerializer3.isEmpty((java.lang.Short) (short) -1);
        boolean boolean9 = jsonSerializer3.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer11 = jsonSerializer3.unwrappingSerializer(nameTransformer10);
        boolean boolean13 = shortJsonSerializer11.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer15 = shortJsonSerializer11.unwrappingSerializer(nameTransformer14);
        org.junit.Assert.assertNotNull(jsonSerializer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer15);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer0 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer();
        java.lang.Class<java.lang.Number> numberClass1 = intLikeSerializer0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer4 = intLikeSerializer0.createContextual(serializerProvider2, beanProperty3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Throwable throwable6 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer7 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        boolean boolean9 = shortSerializer7.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer11 = shortSerializer7.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer13 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer16 = intLikeSerializer13.createContextual(serializerProvider14, beanProperty15);
        boolean boolean18 = jsonSerializer16.isEmpty((java.lang.Short) (short) 100);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = jsonSerializer16.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer21 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        boolean boolean23 = shortSerializer21.isEmpty((java.lang.Short) (short) 0);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer25 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer27 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass28 = intLikeSerializer27.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = floatSerializer25.getSchema(serializerProvider26, (java.lang.reflect.Type) wildcardClass28);
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = shortSerializer21.getSchema(serializerProvider24, (java.lang.reflect.Type) wildcardClass28);
        boolean boolean31 = jsonSerializer16.isEmpty(serializerProvider20, (java.lang.Object) shortSerializer21);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer doubleSerializer33 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider34 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer35 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty37 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer38 = intLikeSerializer35.createContextual(serializerProvider36, beanProperty37);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        boolean boolean41 = intLikeSerializer35.isEmpty(serializerProvider39, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer43 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass44 = intLikeSerializer43.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = intLikeSerializer35.getSchema(serializerProvider42, (java.lang.reflect.Type) wildcardClass44);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = doubleSerializer33.getSchema(serializerProvider34, (java.lang.reflect.Type) wildcardClass44);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider47 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer48 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer();
        java.lang.Class<java.lang.Number> numberClass49 = intLikeSerializer48.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = doubleSerializer33.getSchema(serializerProvider47, (java.lang.reflect.Type) numberClass49);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty52 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer53 = doubleSerializer33.createContextual(serializerProvider51, beanProperty52);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider54 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer55 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer56 = shortSerializer55.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer57 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Short> shortJsonSerializer58 = shortSerializer55.unwrappingSerializer(nameTransformer57);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer59 = shortSerializer55.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer61 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider62 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty63 = null;
        com.fasterxml.jackson.databind.JsonSerializer jsonSerializer64 = intLikeSerializer61.createContextual(serializerProvider62, beanProperty63);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = null;
        boolean boolean67 = intLikeSerializer61.isEmpty(serializerProvider65, (java.lang.Number) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider68 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer shortSerializer69 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider70 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer floatSerializer71 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider72 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer integerSerializer73 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider74 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer75 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass76 = intLikeSerializer75.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = integerSerializer73.getSchema(serializerProvider74, (java.lang.reflect.Type) wildcardClass76);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider78 = null;
        com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer intLikeSerializer79 = com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer.instance;
        java.lang.Class<?> wildcardClass80 = intLikeSerializer79.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode81 = integerSerializer73.getSchema(serializerProvider78, (java.lang.reflect.Type) wildcardClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode82 = floatSerializer71.getSchema(serializerProvider72, (java.lang.reflect.Type) wildcardClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = shortSerializer69.getSchema(serializerProvider70, (java.lang.reflect.Type) wildcardClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode84 = intLikeSerializer61.getSchema(serializerProvider68, (java.lang.reflect.Type) wildcardClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode86 = shortSerializer55.getSchema(serializerProvider60, (java.lang.reflect.Type) wildcardClass80, true);
        com.fasterxml.jackson.databind.JsonNode jsonNode87 = doubleSerializer33.getSchema(serializerProvider54, (java.lang.reflect.Type) wildcardClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode88 = shortSerializer21.getSchema(serializerProvider32, (java.lang.reflect.Type) wildcardClass80);
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = shortSerializer7.getSchema(serializerProvider12, (java.lang.reflect.Type) wildcardClass80);
        // The following exception was thrown during execution in test generation
        try {
            intLikeSerializer0.wrapAndThrow(serializerProvider5, throwable6, (java.lang.Object) wildcardClass80, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberClass1);
        org.junit.Assert.assertNotNull(jsonSerializer4);
        org.junit.Assert.assertNotNull(shortSerializer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortJsonSerializer11);
        org.junit.Assert.assertNotNull(intLikeSerializer13);
        org.junit.Assert.assertNotNull(jsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatSerializer25);
        org.junit.Assert.assertNotNull(intLikeSerializer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer35);
        org.junit.Assert.assertNotNull(jsonSerializer38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intLikeSerializer43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNotNull(numberClass49);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(jsonSerializer53);
        org.junit.Assert.assertNull(wildcardJsonSerializer56);
        org.junit.Assert.assertNotNull(shortJsonSerializer58);
        org.junit.Assert.assertNull(wildcardJsonSerializer59);
        org.junit.Assert.assertNotNull(intLikeSerializer61);
        org.junit.Assert.assertNotNull(jsonSerializer64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(shortSerializer69);
        org.junit.Assert.assertNotNull(intLikeSerializer75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertNotNull(intLikeSerializer79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(jsonNode81);
        org.junit.Assert.assertNotNull(jsonNode82);
        org.junit.Assert.assertNotNull(jsonNode83);
        org.junit.Assert.assertNotNull(jsonNode84);
        org.junit.Assert.assertNotNull(jsonNode86);
        org.junit.Assert.assertNotNull(jsonNode87);
        org.junit.Assert.assertNotNull(jsonNode88);
        org.junit.Assert.assertNotNull(jsonNode89);
    }
}

