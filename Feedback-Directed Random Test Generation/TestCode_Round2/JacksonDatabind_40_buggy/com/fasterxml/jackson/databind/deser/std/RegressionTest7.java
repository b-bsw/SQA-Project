package com.fasterxml.jackson.databind.deser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = numberDeserializer0.getEmptyValue(deserializationContext3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = numberDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer9 = doubleDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer11 = doubleJsonDeserializer9.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer13 = doubleJsonDeserializer9.unwrappingDeserializer(nameTransformer12);
        boolean boolean14 = doubleJsonDeserializer13.isCachable();
        boolean boolean15 = doubleJsonDeserializer13.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = doubleJsonDeserializer13.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer9);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer11);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectIdReader16);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Long long2 = longDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Long long3 = longDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = longDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Character char4 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = characterDeserializer0.getNullValue(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        boolean boolean2 = characterDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objCollection3);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        java.lang.Object obj7 = numberDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = numberDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = numberDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Double double2 = doubleDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(double2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Boolean boolean1 = booleanDeserializer0.getEmptyValue();
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = booleanDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(objCollection3);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = characterDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer8 = doubleDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer10 = doubleJsonDeserializer8.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer8);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer10);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer9 = integerDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = integerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = doubleDeserializer0.getObjectIdReader();
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = doubleDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Short short8 = shortDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection9 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Short short11 = shortDeserializer0.getEmptyValue(deserializationContext10);
        java.lang.Short short12 = shortDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer8 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass10 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue(deserializationContext3);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = numberDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objJsonDeserializer2.getObjectIdReader();
        org.junit.Assert.assertNotNull(numberDeserializer0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Long long6 = longDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer8 = longDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer10 = longDeserializer0.unwrappingDeserializer(nameTransformer9);
        boolean boolean11 = longDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer8);
        org.junit.Assert.assertNotNull(longJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = booleanDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = longDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = longDeserializer0.handledType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue(deserializationContext2);
        boolean boolean4 = characterDeserializer0.isCachable();
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        java.lang.Character char6 = characterDeserializer0._nullValue;
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatJsonDeserializer2.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer8 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = floatJsonDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer11 = floatJsonDeserializer8.unwrappingDeserializer(nameTransformer10);
        java.util.Collection<java.lang.Object> objCollection12 = floatJsonDeserializer11.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNotNull(floatJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(floatJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        boolean boolean4 = longDeserializer0.isCachable();
        boolean boolean5 = longDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = longDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer9 = longDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = longDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(longJsonDeserializer9);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = longDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = longDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerDeserializer0.getObjectIdReader();
        java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(bigInteger7);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer10 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.math.BigDecimal bigDecimal11 = bigDecimalJsonDeserializer10.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = bigDecimalJsonDeserializer10.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer10);
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = longDeserializer0.getValueClass();
        java.lang.Long long6 = longDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long9 = longDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer5 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = bigDecimalDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer10 = booleanDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer12 = booleanJsonDeserializer10.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer12);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        java.lang.Float float7 = floatDeserializer0.getEmptyValue();
        java.lang.Float float8 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Float float10 = floatDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Float float12 = floatDeserializer0.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JavaType javaType13 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float16 = floatDeserializer0.deserialize(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(float8);
        org.junit.Assert.assertNull(float10);
        org.junit.Assert.assertNull(float12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = numberDeserializer0.getValueType();
        java.lang.Object obj7 = numberDeserializer0.getNullValue();
        boolean boolean8 = numberDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = bigDecimalDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = byteDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = byteDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        java.lang.Character char5 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = floatJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer5 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = floatJsonDeserializer5.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(floatJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Character char10 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = characterDeserializer0.getDelegatee();
        java.lang.Character char12 = characterDeserializer0.getEmptyValue();
        boolean boolean13 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer3 = byteDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Byte byte5 = byteDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Byte byte7 = byteDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getNullValue(deserializationContext8);
        java.lang.Byte byte10 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Byte byte12 = byteDeserializer0.getNullValue(deserializationContext11);
        java.lang.Byte byte13 = byteDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass14 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Byte byte16 = byteDeserializer0.getEmptyValue(deserializationContext15);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNull(byte12);
        org.junit.Assert.assertNull(byte13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(byte16);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = integerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = integerDeserializer0.handledType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatJsonDeserializer2.getObjectIdReader();
        java.lang.Float float4 = floatJsonDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = floatJsonDeserializer2.isCachable();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = floatDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float10 = floatDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        boolean boolean7 = doubleDeserializer0.isCachable();
        java.lang.Double double8 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Double double10 = doubleDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double14 = doubleDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(double10);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = shortDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        boolean boolean8 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer10 = booleanDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer12 = booleanDeserializer0.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer12);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = characterDeserializer0.getNullValue(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = bigDecimalDeserializer0.handledType();
        boolean boolean6 = bigDecimalDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Long long6 = longDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer8 = longDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = longJsonDeserializer8.getObjectIdReader();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        boolean boolean4 = integerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer8 = integerDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(intJsonDeserializer8);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.handledType();
        boolean boolean3 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Boolean boolean5 = booleanDeserializer0.getNullValue(deserializationContext4);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getEmptyValue();
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer9 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer9);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = bigDecimalDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getEmptyValue(deserializationContext6);
        boolean boolean8 = bigDecimalDeserializer0.isCachable();
        boolean boolean9 = bigDecimalDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatJsonDeserializer2.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer8 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = floatJsonDeserializer2.getDelegatee();
        java.lang.Float float10 = floatJsonDeserializer2.getEmptyValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNotNull(floatJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(float10);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Boolean boolean8 = booleanDeserializer0.getNullValue();
        java.lang.Boolean boolean9 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass11 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean12 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = booleanDeserializer0.getObjectIdReader();
        java.lang.Boolean boolean15 = booleanDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Character char6 = characterDeserializer0._nullValue;
        java.lang.Character char7 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = characterDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue();
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = shortDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = shortDeserializer0.handledType();
        java.lang.Short short3 = shortDeserializer0.getEmptyValue();
        java.lang.Short short4 = shortDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.handledType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(short3);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        boolean boolean6 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer7.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = characterDeserializer7.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = numberDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = longDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Long long7 = longDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Long long8 = longDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal3);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        boolean boolean9 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigInteger bigInteger11 = bigIntegerDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bigInteger11);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = numberDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = numberDeserializer0.getValueType();
        java.lang.Object obj9 = numberDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer4 = byteDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = byteDeserializer0.getValueType();
        boolean boolean6 = byteDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = numberDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection9 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = numberDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.JavaType javaType12 = numberDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass13 = numberDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection14 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer15 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass16 = characterDeserializer15.getValueClass();
        java.util.Collection<java.lang.Object> objCollection17 = characterDeserializer15.getKnownPropertyNames();
        boolean boolean18 = characterDeserializer15._primitive;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer20 = characterDeserializer15.unwrappingDeserializer(nameTransformer19);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = charJsonDeserializer20.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        java.lang.Character char23 = charJsonDeserializer20.getEmptyValue(deserializationContext22);
        java.util.Collection<java.lang.Object> objCollection24 = charJsonDeserializer20.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = numberDeserializer0.replaceDelegatee(charJsonDeserializer20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(characterDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charJsonDeserializer20);
        org.junit.Assert.assertNull(wildcardJsonDeserializer21);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNull(objCollection24);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = integerDeserializer0.getValueType();
        java.lang.Integer int7 = integerDeserializer0.getNullValue();
        java.lang.Integer int8 = integerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = integerDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection8 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Integer int10 = integerDeserializer0.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = bigIntegerDeserializer0.getObjectIdReader();
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(bigInteger8);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = doubleDeserializer0.getValueType();
        java.lang.Double double10 = doubleDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass11 = doubleDeserializer0.handledType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(double10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer0.getValueType();
        boolean boolean9 = characterDeserializer0.isCachable();
        java.lang.Character char10 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass11 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType12 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer.instance;
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer5 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer4);
        org.junit.Assert.assertNotNull(bigDecimalDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer5);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer9 = doubleDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = doubleDeserializer0.getValueType();
        boolean boolean11 = doubleDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection12 = doubleDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        boolean boolean9 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int13 = integerDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte6 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Byte byte8 = byteDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(byte8);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.JavaType javaType10 = byteDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = doubleDeserializer0.getValueType();
        java.lang.Double double10 = doubleDeserializer0.getEmptyValue();
        java.lang.Double double11 = doubleDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(double10);
        org.junit.Assert.assertNull(double11);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int5 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = integerDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = floatJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = floatJsonDeserializer2.getDelegatee();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer6 = byteDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer10 = byteDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = byteDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = byteDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = characterDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = booleanDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = booleanDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigDecimalDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer3.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = characterDeserializer3.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = characterDeserializer3.getObjectIdReader();
        java.lang.Character char8 = characterDeserializer3._nullValue;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = bigIntegerDeserializer0.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = doubleDeserializer0.getObjectIdReader();
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = doubleDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        boolean boolean5 = floatDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float8 = floatDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer10 = floatDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(float8);
        org.junit.Assert.assertNotNull(floatJsonDeserializer10);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Long long5 = longDeserializer0.getEmptyValue();
        boolean boolean6 = longDeserializer0.isCachable();
        boolean boolean7 = longDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = longDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = numberDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection9 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = numberDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.JavaType javaType12 = numberDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass13 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = numberDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass15 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType16 = numberDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.JavaType javaType6 = longDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType7 = longDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerJsonDeserializer2.getDelegatee();
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getEmptyValue();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(bigInteger5);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Byte byte8 = byteDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = byteDeserializer0.getValueType();
        java.lang.Byte byte10 = byteDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(byte8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(byte10);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType2 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Long long6 = longDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = longDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer7 = doubleDeserializer0.unwrappingDeserializer(nameTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = doubleJsonDeserializer7.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer7);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigDecimal bigDecimal9 = bigDecimalDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean11 = characterDeserializer10.isCachable();
        java.lang.Character char12 = characterDeserializer10.getNullValue();
        java.lang.Class<?> wildcardClass13 = characterDeserializer10.getValueClass();
        java.util.Collection<java.lang.Object> objCollection14 = characterDeserializer10.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(bigDecimal9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objCollection14);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = doubleDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        boolean boolean6 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Boolean boolean8 = booleanDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = booleanDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = booleanDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass11 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean13 = characterDeserializer12.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Character char15 = characterDeserializer12.getEmptyValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(char15);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = byteDeserializer0.getObjectIdReader();
        boolean boolean7 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getNullValue(deserializationContext8);
        java.lang.Byte byte10 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Float float4 = floatDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = booleanDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = booleanDeserializer0.handledType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigDecimal bigDecimal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = bigDecimalDeserializer0.deserialize(jsonParser9, deserializationContext10, bigDecimal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.JavaType javaType11 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = bigDecimalDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.handledType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatJsonDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float7 = floatJsonDeserializer2.deserialize(jsonParser4, deserializationContext5, (java.lang.Float) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Character char6 = characterDeserializer0.getEmptyValue(deserializationContext5);
        boolean boolean7 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Character char12 = characterDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Character char14 = characterDeserializer0.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Character char16 = characterDeserializer0.getEmptyValue(deserializationContext15);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        boolean boolean4 = longDeserializer0.isCachable();
        boolean boolean5 = longDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = longDeserializer0.replaceDelegatee(charJsonDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        boolean boolean4 = longDeserializer0.isCachable();
        java.lang.Long long5 = longDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = longDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = longDeserializer0.handledType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerDeserializer0.getNullValue(deserializationContext8);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(bigInteger9);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer4 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean7 = characterDeserializer6.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer6.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = characterDeserializer6.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Character char12 = characterDeserializer6.getNullValue(deserializationContext11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigIntegerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer6.getDelegatee();
        java.lang.Character char8 = characterDeserializer6._nullValue;
        java.lang.Character char9 = characterDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = characterDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer6.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Character char13 = characterDeserializer6.getEmptyValue(deserializationContext12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer4 = booleanDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer6 = booleanJsonDeserializer4.unwrappingDeserializer(nameTransformer5);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer4);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer6);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char6 = characterDeserializer0.getNullValue(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = integerDeserializer0.getValueClass();
        boolean boolean10 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType11 = integerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = byteDeserializer0.getObjectIdReader();
        boolean boolean7 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Byte byte10 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte13 = byteDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = byteDeserializer0.getObjectIdReader();
        boolean boolean7 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getNullValue(deserializationContext8);
        java.lang.Byte byte10 = byteDeserializer0.getNullValue();
        boolean boolean11 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Byte byte13 = byteDeserializer0.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer16 = byteDeserializer0.unwrappingDeserializer(nameTransformer15);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byte13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNotNull(byteJsonDeserializer16);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.math.BigInteger bigInteger3 = bigIntegerJsonDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerJsonDeserializer5.getObjectIdReader();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char5 = characterDeserializer0.getNullValue(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        boolean boolean6 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = characterDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        boolean boolean4 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        java.lang.Float float7 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Float float9 = floatDeserializer0.getNullValue(deserializationContext8);
        java.lang.Float float10 = floatDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(float9);
        org.junit.Assert.assertNull(float10);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = shortDeserializer0.getDelegatee();
        boolean boolean7 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Short short9 = shortDeserializer0.getNullValue(deserializationContext8);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(short9);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        java.lang.Double double6 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Double double11 = doubleDeserializer0.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(double11);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = byteDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType6 = byteDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double11 = doubleDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(double8);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = floatDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        boolean boolean4 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass6 = characterDeserializer5.getValueClass();
        java.util.Collection<java.lang.Object> objCollection7 = characterDeserializer5.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer5.getKnownPropertyNames();
        java.lang.Character char9 = characterDeserializer5.getNullValue();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer5.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = characterDeserializer5.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        boolean boolean4 = longDeserializer0.isCachable();
        java.lang.Long long5 = longDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = longDeserializer0.getValueClass();
        boolean boolean7 = longDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection8 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = longDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = doubleDeserializer0.handledType();
        boolean boolean9 = doubleDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass9 = characterDeserializer7.getValueClass();
        boolean boolean10 = characterDeserializer7._primitive;
        java.lang.Class<?> wildcardClass11 = characterDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer7.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection13 = characterDeserializer7.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Boolean boolean9 = booleanDeserializer0.getNullValue(deserializationContext8);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.getValueClass();
        java.lang.Float float4 = floatDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = bigDecimalJsonDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigDecimal bigDecimal9 = bigDecimalJsonDeserializer6.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigDecimal bigDecimal11 = bigDecimalJsonDeserializer6.getNullValue(deserializationContext10);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(bigDecimal9);
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        boolean boolean4 = longDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = longDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Byte byte7 = byteDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        java.lang.Byte byte9 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Byte byte11 = byteDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer4 = booleanDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer6 = booleanDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = booleanDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer4);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer9 = floatDeserializer0.unwrappingDeserializer(nameTransformer8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = floatJsonDeserializer9.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(floatJsonDeserializer9);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = numberDeserializer0.getNullValue(deserializationContext8);
        java.util.Collection<java.lang.Object> objCollection10 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj11 = numberDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection12 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass13 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = numberDeserializer0.unwrappingDeserializer(nameTransformer14);
        java.lang.Class<?> wildcardClass16 = numberDeserializer0.handledType();
        java.lang.Object obj17 = numberDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Boolean boolean4 = booleanDeserializer0.getNullValue(deserializationContext3);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = numberDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = numberDeserializer0.unwrappingDeserializer(nameTransformer10);
        java.lang.Object obj12 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType13 = numberDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = numberDeserializer0.getNullValue(deserializationContext8);
        java.lang.Object obj10 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection11 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = numberDeserializer0.deserializeWithType(jsonParser12, deserializationContext13, typeDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = floatDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection9 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Float float11 = floatDeserializer0.getEmptyValue(deserializationContext10);
        java.lang.Float float12 = floatDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(float11);
        org.junit.Assert.assertNull(float12);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = characterDeserializer0.deserialize(jsonParser10, deserializationContext11, (java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = doubleDeserializer0.getObjectIdReader();
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = doubleDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = doubleDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer10 = doubleDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JavaType javaType11 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Double double13 = doubleDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(double13);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double8 = doubleDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float7);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = characterDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer9 = doubleDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = doubleDeserializer0.getValueType();
        java.lang.Double double11 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Double double13 = doubleDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer15 = doubleDeserializer0.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = doubleDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getNullValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = bigDecimalDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = longDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Long long7 = longDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer9 = longDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass11 = characterDeserializer10.getValueClass();
        java.util.Collection<java.lang.Object> objCollection12 = characterDeserializer10.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection13 = characterDeserializer10.getKnownPropertyNames();
        java.lang.Character char14 = characterDeserializer10.getNullValue();
        boolean boolean15 = characterDeserializer10.isCachable();
        java.lang.Character char16 = characterDeserializer10.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = longJsonDeserializer9.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long10 = longDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = characterDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char9 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.lang.Class<?> wildcardClass10 = characterDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer8.getValueType();
        java.lang.Class<?> wildcardClass12 = characterDeserializer8.getValueClass();
        java.lang.Class<?> wildcardClass13 = characterDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType14 = characterDeserializer8.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = numberDeserializer0.handledType();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = characterDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer6.unwrappingDeserializer(nameTransformer10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = numberDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        boolean boolean5 = longDeserializer0.isCachable();
        java.lang.Long long6 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer8 = longDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = longJsonDeserializer8.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer9 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigDecimal bigDecimal11 = bigDecimalJsonDeserializer9.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer9);
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = numberDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection9 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = numberDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.JavaType javaType12 = numberDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass13 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = numberDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass15 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass16 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Object obj18 = numberDeserializer0.getNullValue(deserializationContext17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = characterDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Byte byte7 = byteDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = byteDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = byteDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = longDeserializer0.getObjectIdReader();
        java.lang.Long long6 = longDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(longJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char7 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        boolean boolean4 = longDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection4 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte9 = byteDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Byte) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType2 = floatDeserializer0.getValueType();
        boolean boolean3 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = floatDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = shortDeserializer0.getObjectIdReader();
        java.lang.Short short9 = shortDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatJsonDeserializer2.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer8 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = floatJsonDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float13 = floatJsonDeserializer8.deserialize(jsonParser10, deserializationContext11, (java.lang.Float) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNotNull(floatJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = bigDecimalDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = bigDecimalDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType10 = bigDecimalDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType6 = numberDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = numberDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = numberDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection9 = numberDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.lang.Short short5 = shortDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = shortDeserializer0.getKnownPropertyNames();
        java.lang.Short short8 = shortDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection9 = shortDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = numberDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = numberDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objJsonDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = objJsonDeserializer8.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = characterDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        java.lang.Character char7 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = characterDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerJsonDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = bigIntegerJsonDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerJsonDeserializer2.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer9 = bigIntegerJsonDeserializer2.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer11 = bigIntegerJsonDeserializer9.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer9);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer11);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean5 = booleanDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = booleanDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        java.lang.Character char5 = characterDeserializer0._nullValue;
        java.lang.Character char6 = characterDeserializer0._nullValue;
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer2 = byteDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Byte byte7 = byteDeserializer0.getEmptyValue(deserializationContext6);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(byteJsonDeserializer2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = bigIntegerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Double double5 = doubleDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = doubleDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = longDeserializer0.handledType();
        java.lang.Long long5 = longDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        java.lang.Character char7 = characterDeserializer0._nullValue;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Boolean boolean8 = booleanDeserializer0.getNullValue();
        java.lang.Boolean boolean9 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = booleanDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass11 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType12 = booleanDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = characterDeserializer0.getNullValue(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = numberDeserializer0.handledType();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        boolean boolean6 = numberDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer6 = byteDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = byteDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass9 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        boolean boolean3 = bigIntegerDeserializer0.isCachable();
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = bigIntegerDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bigInteger4);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean4 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.getValueClass();
        java.lang.Character char7 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = characterDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        boolean boolean4 = longDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long7 = longDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer10 = shortDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        java.lang.Character char5 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

