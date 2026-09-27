package com.fasterxml.jackson.databind.deser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        java.lang.Boolean boolean9 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = booleanDeserializer0.deserialize(jsonParser10, deserializationContext11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = booleanDeserializer0.getObjectIdReader();
        java.lang.Boolean boolean10 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Boolean boolean12 = booleanDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer13 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass14 = characterDeserializer13.getValueClass();
        java.util.Collection<java.lang.Object> objCollection15 = characterDeserializer13.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection16 = characterDeserializer13.getKnownPropertyNames();
        java.lang.Character char17 = characterDeserializer13.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer19 = characterDeserializer13.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = characterDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer22 = characterDeserializer13.unwrappingDeserializer(nameTransformer21);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = booleanDeserializer0.replaceDelegatee(charJsonDeserializer22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(characterDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer20);
        org.junit.Assert.assertNotNull(charJsonDeserializer22);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        com.fasterxml.jackson.databind.JavaType javaType10 = numberDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection11 = numberDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = numberDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = bigIntegerDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger5);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = integerDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer12 = byteDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = byteDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass14 = byteDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
        org.junit.Assert.assertNotNull(byteJsonDeserializer12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
            java.lang.Byte byte9 = byteDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Byte) (byte) -1);
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer5 = shortDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortJsonDeserializer5.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(shortJsonDeserializer5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass6 = characterDeserializer5.getValueClass();
        java.lang.Class<?> wildcardClass7 = characterDeserializer5.getValueClass();
        java.lang.Character char8 = characterDeserializer5._nullValue;
        java.lang.Class<?> wildcardClass9 = characterDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer5.unwrappingDeserializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = characterDeserializer5.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = integerDeserializer0.getObjectIdReader();
        boolean boolean6 = integerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = longDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long10 = longDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer2.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer2.getObjectIdReader();
        boolean boolean5 = characterDeserializer2._primitive;
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer2.getValueType();
        java.lang.Class<?> wildcardClass7 = characterDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer2.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Character char11 = characterDeserializer2.getEmptyValue(deserializationContext10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(characterDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer4 = booleanDeserializer0.unwrappingDeserializer(nameTransformer3);
        boolean boolean5 = booleanJsonDeserializer4.isCachable();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int6 = integerDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = booleanDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = bigDecimalDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer4 = booleanDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass6 = characterDeserializer5.getValueClass();
        java.lang.Class<?> wildcardClass7 = characterDeserializer5.getValueClass();
        java.lang.Character char8 = characterDeserializer5._nullValue;
        java.lang.Class<?> wildcardClass9 = characterDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer5.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer5.getDelegatee();
        java.lang.Class<?> wildcardClass13 = characterDeserializer5.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Character char15 = characterDeserializer5.getEmptyValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer4);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatJsonDeserializer2.getObjectIdReader();
        java.lang.Float float4 = floatJsonDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean8 = characterDeserializer7.isCachable();
        java.lang.Character char9 = characterDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Character char12 = characterDeserializer7.getNullValue(deserializationContext11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = floatJsonDeserializer2.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = numberDeserializer0.getNullValue();
        java.lang.Object obj9 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = numberDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType13 = characterDeserializer12.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType14 = characterDeserializer12.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = objJsonDeserializer11.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Short short6 = shortDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short8 = shortDeserializer0.getNullValue(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char5 = characterDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double10 = doubleDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
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
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short10 = shortDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = floatDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = floatDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long4 = longDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = shortDeserializer0.getObjectIdReader();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short9 = shortDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Short) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Short (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer4 = integerDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = integerDeserializer0.getObjectIdReader();
        boolean boolean8 = integerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(intJsonDeserializer4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        boolean boolean6 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer10 = byteDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = byteDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double10 = doubleDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass4 = characterDeserializer3.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer3.getValueType();
        java.lang.Character char7 = characterDeserializer3._nullValue;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = wildcardJsonDeserializer2.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        java.lang.Long long2 = longDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatJsonDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer5 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = floatJsonDeserializer5.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(floatJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer3 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer3);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer2 = byteDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(byteJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float6 = floatDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = shortDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer10 = byteDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer12 = byteJsonDeserializer10.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Byte byte14 = byteJsonDeserializer12.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer15 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType16 = characterDeserializer15.getValueType();
        java.lang.Character char17 = characterDeserializer15.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection18 = characterDeserializer15.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = characterDeserializer15.getObjectIdReader();
        java.lang.Class<?> wildcardClass20 = characterDeserializer15.getValueClass();
        java.lang.Class<?> wildcardClass21 = characterDeserializer15.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = byteJsonDeserializer12.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
        org.junit.Assert.assertNotNull(byteJsonDeserializer12);
        org.junit.Assert.assertNull(byte14);
        org.junit.Assert.assertNotNull(characterDeserializer15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass4 = characterDeserializer3.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer3.getValueClass();
        java.lang.Character char6 = characterDeserializer3._nullValue;
        java.lang.Class<?> wildcardClass7 = characterDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer3.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = characterDeserializer3.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer12 = characterDeserializer3.unwrappingDeserializer(nameTransformer11);
        java.lang.Character char13 = characterDeserializer3.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Short short8 = shortDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short11 = shortDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(short8);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Float float8 = floatDeserializer0.getNullValue(deserializationContext7);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(float8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean4 = booleanDeserializer0.getNullValue();
        java.lang.Boolean boolean5 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = booleanDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = longDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = bigDecimalDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass9 = bigDecimalDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = byteDeserializer0.deserializeWithType(jsonParser14, deserializationContext15, typeDeserializer16);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byte13);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.deserialize(jsonParser3, deserializationContext4, bigInteger5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection7 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer8.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = characterDeserializer8.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        java.lang.Object obj16 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Object obj18 = numberDeserializer0.getEmptyValue(deserializationContext17);
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
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.lang.Short short5 = shortDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = shortDeserializer0.handledType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Byte byte8 = byteDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = byteDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(byte8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = integerDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = integerDeserializer0.getClass();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = integerDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = numberDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = numberDeserializer0.getValueType();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        java.lang.Class<?> wildcardClass14 = byteDeserializer0.getValueClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType3 = integerDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = integerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer5 = floatDeserializer0.unwrappingDeserializer(nameTransformer4);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(floatJsonDeserializer5);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.instance;
        java.util.Collection<java.lang.Object> objCollection1 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = numberDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer3 = byteDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer5 = byteJsonDeserializer3.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer6.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer6.unwrappingDeserializer(nameTransformer10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = byteJsonDeserializer5.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNotNull(byteJsonDeserializer5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType8 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short11 = shortDeserializer0.getNullValue(deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer7 = doubleDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType9 = doubleDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer7.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = characterDeserializer7.getObjectIdReader();
        boolean boolean10 = characterDeserializer7._primitive;
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer7.getValueType();
        java.lang.Class<?> wildcardClass12 = characterDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer14 = characterDeserializer7.unwrappingDeserializer(nameTransformer13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = numberDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(charJsonDeserializer14);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.math.BigInteger bigInteger3 = bigIntegerJsonDeserializer2.getNullValue();
        java.math.BigInteger bigInteger4 = bigIntegerJsonDeserializer2.getEmptyValue();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(bigInteger4);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        boolean boolean4 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Character char6 = characterDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Character char8 = characterDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Character char9 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer11 = doubleDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Double double13 = doubleJsonDeserializer11.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer11);
        org.junit.Assert.assertNull(double13);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass9 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType7 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = bigIntegerDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = integerDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = longDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short7 = shortDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer9 = shortJsonDeserializer7.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = shortJsonDeserializer9.isCachable();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertNotNull(shortJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = bigIntegerDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long7 = longDeserializer0.getNullValue(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Double double2 = doubleDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(double2);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = booleanDeserializer0.getObjectIdReader();
        java.lang.Boolean boolean6 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Boolean boolean8 = booleanDeserializer0.getEmptyValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = booleanDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float9 = floatDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Float) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = characterDeserializer6.getDelegatee();
        java.lang.Character char9 = characterDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = characterDeserializer6.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = byteDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType6 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = booleanDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = charJsonDeserializer3.deserialize(jsonParser4, deserializationContext5, (java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = shortDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = numberDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = numberDeserializer0.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Short short3 = shortDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short7 = shortDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = floatDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = floatDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue();
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer10 = bigDecimalJsonDeserializer8.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        boolean boolean1 = shortDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = shortDeserializer0.getKnownPropertyNames();
        boolean boolean3 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short5 = shortDeserializer0.getNullValue(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        boolean boolean3 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = shortDeserializer0.handledType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        boolean boolean8 = bigDecimalDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean5 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = booleanDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection7 = booleanDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = booleanDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        java.lang.Long long1 = longDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long5 = longDeserializer0.deserialize(jsonParser2, deserializationContext3, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.JavaType javaType10 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.math.BigInteger bigInteger12 = bigIntegerDeserializer0.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer14 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer13);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(bigInteger9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer14);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = shortDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = shortDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double7 = doubleJsonDeserializer3.deserialize(jsonParser4, deserializationContext5, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer7.getValueType();
        java.lang.Character char9 = characterDeserializer7.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = characterDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = characterDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass13 = characterDeserializer7.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = integerDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection2 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Short short8 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short12 = shortDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Short) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Short (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        java.lang.Integer int6 = integerDeserializer0.getNullValue();
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean6 = characterDeserializer5.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Character char8 = characterDeserializer5.getEmptyValue(deserializationContext7);
        boolean boolean9 = characterDeserializer5.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection4 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = characterDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = integerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Integer int10 = integerDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = integerDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Character char6 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Byte byte1 = byteDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(byte1);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer6 = byteDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer7.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = characterDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = characterDeserializer7.handledType();
        java.lang.Class<?> wildcardClass11 = characterDeserializer7.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Character char13 = characterDeserializer7.getEmptyValue(deserializationContext12);
        boolean boolean14 = characterDeserializer7.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Character char16 = characterDeserializer7.getEmptyValue(deserializationContext15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = byteDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = characterDeserializer0.getNullValue(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        boolean boolean5 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Character char8 = characterDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Character char9 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Byte byte5 = byteDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Object obj3 = numberDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = numberDeserializer0.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = charJsonDeserializer6.deserialize(jsonParser7, deserializationContext8, (java.lang.Character) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = integerDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection10 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int11 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = integerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        java.lang.Byte byte1 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass2 = byteDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte6 = byteDeserializer0.deserialize(jsonParser3, deserializationContext4, (java.lang.Byte) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Character char5 = characterDeserializer0._nullValue;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Double double6 = doubleDeserializer0.getNullValue();
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        boolean boolean8 = doubleDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = doubleDeserializer0.handledType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        boolean boolean3 = integerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.JavaType javaType11 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean13 = characterDeserializer12.isCachable();
        java.lang.Character char14 = characterDeserializer12.getNullValue();
        java.lang.Character char15 = characterDeserializer12._nullValue;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Character char17 = characterDeserializer12.getEmptyValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNull(char17);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.JavaType javaType11 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal12 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer14 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = bigDecimalDeserializer0.deserializeWithType(jsonParser15, deserializationContext16, typeDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer14);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer10 = byteDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer11 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass12 = characterDeserializer11.getValueClass();
        boolean boolean13 = characterDeserializer11._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = byteJsonDeserializer10.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
        org.junit.Assert.assertNotNull(characterDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty2 = longDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = booleanDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = booleanDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = booleanDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean5 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = booleanDeserializer0.getDelegatee();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        java.lang.Boolean boolean8 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean12 = booleanDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Float float6 = floatDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = longDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long10 = longDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = integerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        java.util.Collection<java.lang.Object> objCollection14 = booleanDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(objCollection14);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = bigIntegerDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(bigInteger6);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        boolean boolean7 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = characterDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = shortDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = shortDeserializer0.handledType();
        java.lang.Short short3 = shortDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(short3);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = bigIntegerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(bigInteger8);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        boolean boolean11 = numberDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.deserialize(jsonParser3, deserializationContext4, bigDecimal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer3 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerJsonDeserializer3.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Character char10 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = floatDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
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
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int6 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer7.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = characterDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = characterDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass11 = characterDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = characterDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass13 = characterDeserializer7.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Short short5 = shortDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = shortDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte5 = byteDeserializer0.deserialize(jsonParser2, deserializationContext3, (java.lang.Byte) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Object obj7 = objJsonDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = objJsonDeserializer6.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objJsonDeserializer6.replaceDelegatee(charJsonDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Short short5 = shortDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Short short8 = shortJsonDeserializer7.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection9 = shortJsonDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short13 = shortJsonDeserializer7.deserialize(jsonParser10, deserializationContext11, (java.lang.Short) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Short (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.lang.Class<?> wildcardClass10 = characterDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer8.getValueType();
        java.lang.Class<?> wildcardClass12 = characterDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer14 = characterDeserializer8.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer16 = characterDeserializer8.unwrappingDeserializer(nameTransformer15);
        boolean boolean17 = characterDeserializer8.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType18 = characterDeserializer8.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(charJsonDeserializer14);
        org.junit.Assert.assertNotNull(charJsonDeserializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(javaType18);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = longDeserializer0.handledType();
        java.lang.Long long7 = longDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = longDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer4 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer4.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = bigIntegerDeserializer4.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = bigIntegerDeserializer4.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = bigIntegerDeserializer4.getValueType();
        java.math.BigInteger bigInteger10 = bigIntegerDeserializer4.getEmptyValue();
        boolean boolean11 = bigIntegerDeserializer4.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = numberDeserializer0.deserialize(jsonParser2, deserializationContext3, (java.lang.Object) bigIntegerDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = floatDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass4 = characterDeserializer3.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer3.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = characterDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
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
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = numberDeserializer0.getNullValue();
        java.lang.Object obj9 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = numberDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = objJsonDeserializer11.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer5 = byteDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte11 = byteDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNotNull(byteJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Character char10 = characterDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Boolean boolean10 = booleanDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer12 = booleanDeserializer0.unwrappingDeserializer(nameTransformer11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = booleanDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer12);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = bigDecimalDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = bigDecimalDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        boolean boolean5 = longDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer7 = longDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = longDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = characterDeserializer0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = floatDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = integerDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = bigDecimalDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection6 = bigIntegerDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = bigIntegerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        java.lang.Long long4 = longDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getNullValue(deserializationContext9);
        java.math.BigDecimal bigDecimal11 = bigDecimalDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer11 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass12 = characterDeserializer11.getValueClass();
        java.lang.Class<?> wildcardClass13 = characterDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType14 = characterDeserializer11.getValueType();
        java.lang.Class<?> wildcardClass15 = characterDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer17 = characterDeserializer11.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer19 = characterDeserializer11.unwrappingDeserializer(nameTransformer18);
        boolean boolean20 = characterDeserializer11.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNotNull(characterDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charJsonDeserializer17);
        org.junit.Assert.assertNotNull(charJsonDeserializer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        java.lang.Class<?> wildcardClass14 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = numberDeserializer0.getNullValue(deserializationContext15);
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = byteDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer5 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer7 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = bigDecimalJsonDeserializer7.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Byte byte7 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte9);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        java.lang.Integer int5 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer8.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer13 = characterDeserializer8.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Character char15 = characterDeserializer8.getEmptyValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(charJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        boolean boolean6 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer8 = doubleDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer10 = doubleJsonDeserializer8.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer12 = doubleJsonDeserializer10.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer8);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer10);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer12);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue();
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double10 = doubleDeserializer0.deserialize(jsonParser8, deserializationContext9);
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
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Character char10 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass13 = characterDeserializer12.getValueClass();
        java.lang.Class<?> wildcardClass14 = characterDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType15 = characterDeserializer12.getValueType();
        java.lang.Class<?> wildcardClass16 = characterDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = characterDeserializer12.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Character char19 = characterDeserializer12.getEmptyValue(deserializationContext18);
        java.lang.Character char20 = characterDeserializer12.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = bigDecimalDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = bigDecimalDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getNullValue();
        java.lang.Long long4 = longDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Character char4 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char6 = characterDeserializer0.getNullValue(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = characterDeserializer0.getValueClass();
        boolean boolean11 = characterDeserializer0._primitive;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = characterDeserializer0.deserialize(jsonParser12, deserializationContext13);
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
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Character char8 = characterDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = integerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.handledType();
        boolean boolean9 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Integer int11 = integerDeserializer0.getNullValue(deserializationContext10);
        java.lang.Integer int12 = integerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        boolean boolean9 = characterDeserializer7._primitive;
        java.lang.Character char10 = characterDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer7.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = bigIntegerDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer7.getKnownPropertyNames();
        java.lang.Character char10 = characterDeserializer7._nullValue;
        java.lang.Character char11 = characterDeserializer7.getEmptyValue();
        boolean boolean12 = characterDeserializer7.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = characterDeserializer7.getObjectIdReader();
        java.lang.Character char14 = characterDeserializer7.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = characterDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        java.lang.Class<?> wildcardClass12 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Byte byte14 = byteDeserializer0.getEmptyValue(deserializationContext13);
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
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(byte14);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte6 = byteDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte3);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Character char10 = characterDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = characterDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer9 = shortDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short12 = shortDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer9);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        java.lang.Double double4 = doubleDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = doubleDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer7.getKnownPropertyNames();
        java.lang.Character char10 = characterDeserializer7._nullValue;
        java.lang.Character char11 = characterDeserializer7.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = integerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer12 = byteDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer14 = byteJsonDeserializer12.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer16 = byteJsonDeserializer14.unwrappingDeserializer(nameTransformer15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty18 = byteJsonDeserializer16.findBackReference("");
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
        org.junit.Assert.assertNotNull(byteJsonDeserializer12);
        org.junit.Assert.assertNotNull(byteJsonDeserializer14);
        org.junit.Assert.assertNotNull(byteJsonDeserializer16);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = longDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        boolean boolean6 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer8 = shortDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Short short10 = shortDeserializer0.getEmptyValue(deserializationContext9);
        boolean boolean11 = shortDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        boolean boolean5 = numberDeserializer0.isCachable();
        java.lang.Object obj6 = numberDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = numberDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = numberDeserializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = charJsonDeserializer6.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Long long8 = longDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        boolean boolean4 = characterDeserializer0._primitive;
        boolean boolean5 = characterDeserializer0._primitive;
        java.util.Collection<java.lang.Object> objCollection6 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getNullValue(deserializationContext7);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer8 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = bigIntegerJsonDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = bigIntegerJsonDeserializer8.deserialize(jsonParser10, deserializationContext11, bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = floatDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Float float10 = floatDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.JavaType javaType11 = floatDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(float10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = integerDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = integerDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        boolean boolean9 = characterDeserializer7._primitive;
        java.lang.Character char10 = characterDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer7.getValueType();
        java.lang.Character char12 = characterDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = characterDeserializer7.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean9 = doubleDeserializer0.isCachable();
        java.lang.Double double10 = doubleDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(double10);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = bigIntegerDeserializer0.replaceDelegatee(charJsonDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = integerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.handledType();
        boolean boolean9 = integerDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection10 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = integerDeserializer0.deserialize(jsonParser11, deserializationContext12, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer4 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalJsonDeserializer4.unwrappingDeserializer(nameTransformer5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Long long2 = longDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = longJsonDeserializer4.getObjectIdReader();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(longJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float9 = floatDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Double double11 = doubleDeserializer0.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(double11);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection7 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = integerDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer9 = booleanDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType11 = booleanDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType7 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = bigIntegerDeserializer0.deserialize(jsonParser8, deserializationContext9, bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = shortDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = shortDeserializer0.handledType();
        java.lang.Short short3 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = shortDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(short3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = bigDecimalDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean8 = characterDeserializer7.isCachable();
        java.lang.Class<?> wildcardClass9 = characterDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer7.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer14 = doubleDeserializer0.unwrappingDeserializer(nameTransformer13);
        java.lang.Double double15 = doubleJsonDeserializer14.getEmptyValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer14);
        org.junit.Assert.assertNull(double15);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = numberDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = numberDeserializer0.deserialize(jsonParser9, deserializationContext10);
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
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue();
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.math.BigDecimal bigDecimal9 = bigDecimalJsonDeserializer8.getNullValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        com.fasterxml.jackson.databind.JavaType javaType10 = numberDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass11 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass13 = characterDeserializer12.getValueClass();
        java.lang.Class<?> wildcardClass14 = characterDeserializer12.getValueClass();
        java.lang.Character char15 = characterDeserializer12._nullValue;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = characterDeserializer12.getObjectIdReader();
        java.lang.Character char17 = characterDeserializer12.getEmptyValue();
        java.lang.Character char18 = characterDeserializer12._nullValue;
        com.fasterxml.jackson.databind.JavaType javaType19 = characterDeserializer12.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = numberDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer12);
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
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNull(javaType19);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Integer int3 = integerDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = characterDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Character char14 = characterDeserializer10.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer16 = characterDeserializer10.unwrappingDeserializer(nameTransformer15);
        java.lang.Class<?> wildcardClass17 = characterDeserializer10.handledType();
        boolean boolean18 = characterDeserializer10.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(byte6);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Float float5 = floatJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float9 = floatJsonDeserializer4.deserialize(jsonParser6, deserializationContext7, (java.lang.Float) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNull(float5);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer2 = byteDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteJsonDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte7 = byteJsonDeserializer2.deserialize(jsonParser4, deserializationContext5, (java.lang.Byte) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(byteJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue(deserializationContext4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(bigInteger5);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Character char2 = characterDeserializer0.getEmptyValue(deserializationContext1);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer12 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.math.BigDecimal bigDecimal13 = bigDecimalJsonDeserializer12.getEmptyValue();
        boolean boolean14 = bigDecimalJsonDeserializer12.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer12);
        org.junit.Assert.assertNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = bigIntegerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Short short3 = shortDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean5 = characterDeserializer4.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer4.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = characterDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass9 = characterDeserializer4.getValueClass();
        java.lang.Character char10 = characterDeserializer4.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = byteDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Short short8 = shortDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass9 = shortDeserializer0.handledType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = byteDeserializer0.getValueType();
        java.lang.Byte byte10 = byteDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(byte10);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection7 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Boolean boolean10 = booleanDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection8 = bigIntegerDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Short short8 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer10 = shortDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer12 = shortDeserializer0.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
        org.junit.Assert.assertNotNull(shortJsonDeserializer12);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = floatDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean7 = characterDeserializer6.isCachable();
        java.lang.Character char8 = characterDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Character char10 = characterDeserializer6.getNullValue(deserializationContext9);
        boolean boolean11 = characterDeserializer6._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = characterDeserializer0.getNullValue(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = longDeserializer0.handledType();
        boolean boolean7 = longDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = longDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        boolean boolean2 = characterDeserializer0._primitive;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = characterDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = floatJsonDeserializer8.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNotNull(floatJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = shortDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = bigIntegerDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(bigInteger6);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Double double7 = doubleDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = doubleDeserializer0.getValueClass();
        boolean boolean9 = doubleDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = bigDecimalDeserializer0.getObjectIdReader();
        boolean boolean9 = bigDecimalDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = bigDecimalDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = longDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Object obj7 = objJsonDeserializer6.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = objJsonDeserializer6.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Long long7 = longDeserializer0.getEmptyValue(deserializationContext6);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Byte byte7 = byteDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte11 = byteDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Byte) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(byte7);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = booleanDeserializer0.getObjectIdReader();
        java.lang.Boolean boolean10 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType12 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass13 = booleanDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        boolean boolean6 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = numberDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection8 = bigIntegerDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer11 = doubleDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double14 = doubleDeserializer0.deserialize(jsonParser12, deserializationContext13);
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
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer11);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long6 = longDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = longDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        java.util.Collection<java.lang.Object> objCollection10 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Byte byte12 = byteDeserializer0.getEmptyValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = byteDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(byte12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = bigIntegerJsonDeserializer7.isCachable();
        java.util.Collection<java.lang.Object> objCollection9 = bigIntegerJsonDeserializer7.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Boolean boolean4 = booleanDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        boolean boolean10 = characterDeserializer8._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        java.lang.Character char1 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = shortDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType11 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = byteDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = byteDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType6 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Boolean boolean8 = booleanDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = booleanDeserializer0.handledType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
        java.lang.Short short8 = shortDeserializer0.getEmptyValue();
        java.lang.Short short9 = shortDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = shortDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer3 = shortDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortJsonDeserializer3.getDelegatee();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(shortJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigDecimalDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = bigIntegerDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = numberDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objJsonDeserializer5.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = objJsonDeserializer5.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long5 = longDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long7 = longDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(objCollection3);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer9 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.math.BigDecimal bigDecimal10 = bigDecimalJsonDeserializer9.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer9);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = byteDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        java.util.Collection<java.lang.Object> objCollection10 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = numberDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection12 = numberDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection13 = numberDeserializer0.getKnownPropertyNames();
        boolean boolean14 = numberDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = floatDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        com.fasterxml.jackson.databind.JavaType javaType11 = booleanDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer12 = byteDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer14 = byteJsonDeserializer12.unwrappingDeserializer(nameTransformer13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty16 = byteJsonDeserializer14.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
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
        org.junit.Assert.assertNotNull(byteJsonDeserializer12);
        org.junit.Assert.assertNotNull(byteJsonDeserializer14);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = numberDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = numberDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection9 = byteDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Byte byte11 = byteDeserializer8.getEmptyValue(deserializationContext10);
        java.lang.Byte byte12 = byteDeserializer8.getNullValue();
        java.lang.Class<?> wildcardClass13 = byteDeserializer8.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer15 = byteDeserializer8.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Byte byte17 = byteDeserializer8.getEmptyValue(deserializationContext16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Byte byte19 = byteDeserializer8.getEmptyValue(deserializationContext18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = numberDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Object) byte19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(byteDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(byte11);
        org.junit.Assert.assertNull(byte12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(byteJsonDeserializer15);
        org.junit.Assert.assertNull(byte17);
        org.junit.Assert.assertNull(byte19);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Float float11 = floatDeserializer0.getEmptyValue(deserializationContext10);
        java.lang.Float float12 = floatDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(float9);
        org.junit.Assert.assertNull(float11);
        org.junit.Assert.assertNull(float12);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = objJsonDeserializer6.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objJsonDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = objJsonDeserializer6.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = longDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.util.Collection<java.lang.Object> objCollection7 = bigDecimalJsonDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = bigDecimalJsonDeserializer6.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Long long2 = longDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType12 = characterDeserializer9.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer14 = characterDeserializer9.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Character char16 = characterDeserializer9.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = characterDeserializer9.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection18 = characterDeserializer9.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(charJsonDeserializer14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(objCollection18);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer6 = byteDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = byteDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        boolean boolean4 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        boolean boolean4 = characterDeserializer0.isCachable();
        boolean boolean5 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        java.lang.Character char8 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = booleanDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer9 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.math.BigInteger bigInteger10 = bigIntegerJsonDeserializer9.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection11 = bigIntegerJsonDeserializer9.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer9);
        org.junit.Assert.assertNull(bigInteger10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double10 = doubleDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = longDeserializer0.getNullValue(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        boolean boolean6 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer8 = shortDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = shortDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        java.lang.Class<?> wildcardClass11 = byteDeserializer0.handledType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = integerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = integerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.math.BigInteger bigInteger1 = bigIntegerDeserializer0.getNullValue();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = bigIntegerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bigInteger1);
        org.junit.Assert.assertNull(bigInteger2);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer2 = shortDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = characterDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.handledType();
        boolean boolean4 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType5 = doubleDeserializer0.getValueType();
        java.lang.Double double6 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double10 = doubleDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(double6);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short6 = shortDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Short short5 = shortDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = shortJsonDeserializer7.isCachable();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double10 = doubleDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = bigIntegerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(byte4);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = longDeserializer0.handledType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = booleanDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean3 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer5 = booleanDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer5);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = bigIntegerDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        java.lang.Boolean boolean11 = booleanJsonDeserializer10.getEmptyValue();
        java.lang.Boolean boolean12 = booleanJsonDeserializer10.getEmptyValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.handledType();
        boolean boolean4 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType5 = doubleDeserializer0.getValueType();
        java.lang.Double double6 = doubleDeserializer0.getNullValue();
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.lang.Double double8 = doubleDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(double8);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        java.lang.Class<?> wildcardClass13 = booleanDeserializer0.handledType();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        boolean boolean3 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean5 = characterDeserializer4.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer4.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = characterDeserializer4.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Character char10 = characterDeserializer4.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Character char12 = characterDeserializer4.getEmptyValue(deserializationContext11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Double double10 = doubleDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = doubleDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(double10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.handledType();
        boolean boolean6 = bigIntegerDeserializer0.isCachable();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = bigDecimalDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        java.lang.Character char9 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = booleanDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte12 = byteDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Byte) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = characterDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(char4);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        boolean boolean3 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer5 = shortDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = booleanDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection9 = booleanDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass10 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean11 = booleanDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = booleanDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        boolean boolean5 = floatDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getEmptyValue();
        boolean boolean7 = bigIntegerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = bigIntegerDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Short short8 = shortDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Short short9 = shortDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        java.lang.Object obj7 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = numberDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer11 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection12 = integerDeserializer11.getKnownPropertyNames();
        boolean boolean13 = integerDeserializer11.isCachable();
        boolean boolean14 = integerDeserializer11.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType15 = integerDeserializer11.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = integerDeserializer11.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Integer int18 = integerDeserializer11.getEmptyValue(deserializationContext17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = numberDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Object) deserializationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(integerDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        java.lang.Integer int10 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Integer int12 = integerDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intJsonDeserializer9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = shortDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = shortDeserializer0.getObjectIdReader();
        java.lang.Short short10 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = shortDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = characterDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
        boolean boolean8 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer9.getKnownPropertyNames();
        java.lang.Character char12 = characterDeserializer9._nullValue;
        java.lang.Character char13 = characterDeserializer9.getEmptyValue();
        boolean boolean14 = characterDeserializer9.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = characterDeserializer9.getObjectIdReader();
        java.lang.Character char16 = characterDeserializer9.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = doubleDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = doubleDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = integerDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger10 = bigIntegerDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(bigInteger10);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = numberDeserializer0.getNullValue();
        java.lang.Object obj9 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = numberDeserializer0.unwrappingDeserializer(nameTransformer10);
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
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = bigIntegerDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer4.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer8 = floatJsonDeserializer6.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNotNull(floatJsonDeserializer8);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Float float6 = floatDeserializer0.getNullValue(deserializationContext5);
        boolean boolean7 = floatDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = numberDeserializer0.getNullValue(deserializationContext4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        boolean boolean5 = longDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long11 = longDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        boolean boolean6 = bigDecimalDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = bigDecimalDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        java.lang.Double double4 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Short short8 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer10 = shortDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Short short11 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Short short13 = shortDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = numberDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        java.lang.Object obj4 = numberDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = numberDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Object obj9 = numberDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = numberDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer7.unwrappingDeserializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = characterDeserializer7.getValueClass();
        java.lang.Character char13 = characterDeserializer7.getNullValue();
        java.lang.Class<?> wildcardClass14 = characterDeserializer7.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        java.lang.Double double6 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double13 = doubleDeserializer0.deserialize(jsonParser10, deserializationContext11, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer9.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass12 = characterDeserializer9.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short11 = shortJsonDeserializer7.deserialize(jsonParser8, deserializationContext9, (java.lang.Short) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Short (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = characterDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double7 = doubleDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = byteDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int11 = integerDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = longDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigDecimal bigDecimal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.deserialize(jsonParser5, deserializationContext6, bigDecimal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Short short5 = shortDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer9 = shortDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(shortJsonDeserializer9);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = bigIntegerDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = floatJsonDeserializer6.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = bigIntegerDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Byte byte7 = byteDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte10 = byteDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(byte7);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer10 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer10);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = characterDeserializer0.getNullValue(deserializationContext7);
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = doubleDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = doubleDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = doubleDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = doubleDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = numberDeserializer0.handledType();
        java.lang.Object obj7 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = numberDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = bigIntegerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(bigInteger6);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType3 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = integerDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.util.Collection<java.lang.Object> objCollection10 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Byte byte12 = byteDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Byte byte14 = byteDeserializer0.getEmptyValue(deserializationContext13);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(byte12);
        org.junit.Assert.assertNull(byte14);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass7 = integerDeserializer0.getValueClass();
        boolean boolean8 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        java.lang.Class<?> wildcardClass11 = characterDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType12 = characterDeserializer9.getValueType();
        boolean boolean13 = characterDeserializer9._primitive;
        java.lang.Character char14 = characterDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Character char16 = characterDeserializer9.getEmptyValue(deserializationContext15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = floatDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        boolean boolean5 = longDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer7 = longDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = longJsonDeserializer7.getDelegatee();
        java.lang.Long long9 = longJsonDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer11 = longJsonDeserializer7.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = longJsonDeserializer11.getDelegatee();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = floatDeserializer0.getValueType();
        java.lang.Float float7 = floatDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = floatDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float12 = floatDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = floatDeserializer0.getValueType();
        java.lang.Float float7 = floatDeserializer0.getNullValue();
        java.lang.Float float8 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float11 = floatDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(float8);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer11 = shortDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(shortJsonDeserializer11);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getNullValue(deserializationContext6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = integerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte9 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = byteDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(byte9);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objJsonDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = wildcardJsonDeserializer8.getEmptyValue(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double9 = doubleDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.Class<?> wildcardClass11 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = numberDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = bigDecimalDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = bigDecimalDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = bigDecimalDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float7 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Boolean boolean10 = booleanDeserializer0.getNullValue(deserializationContext9);
        java.util.Collection<java.lang.Object> objCollection11 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Boolean boolean13 = booleanDeserializer0.getNullValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = booleanDeserializer0.getClass();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer5 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer7 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = bigDecimalDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer7);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType6 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Byte byte11 = byteDeserializer0.getEmptyValue(deserializationContext10);
        boolean boolean12 = byteDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass13 = byteDeserializer0.handledType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        boolean boolean6 = characterDeserializer0.isCachable();
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = floatDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Character char7 = charJsonDeserializer6.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = bigIntegerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.getValueClass();
        boolean boolean6 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = numberDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = numberDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        boolean boolean6 = byteDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = booleanDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer1 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass2 = characterDeserializer1.getValueClass();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer1.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection4 = characterDeserializer1.getKnownPropertyNames();
        java.lang.Character char5 = characterDeserializer1.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(characterDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = shortJsonDeserializer7.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Float float10 = floatDeserializer0.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(float10);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Short short5 = shortDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = shortDeserializer0.getValueType();
        java.lang.Short short9 = shortDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = shortDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer4.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float10 = floatJsonDeserializer4.deserialize(jsonParser7, deserializationContext8, (java.lang.Float) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = longDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection3 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = byteDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerJsonDeserializer7.getNullValue(deserializationContext8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger9);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = integerDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer4 = byteDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = byteDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer10 = integerDeserializer0.unwrappingDeserializer(nameTransformer9);
        boolean boolean11 = integerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass12 = integerDeserializer0.handledType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(intJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getEmptyValue(deserializationContext5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger6);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = longDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer4 = booleanDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = booleanJsonDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = booleanJsonDeserializer4.getDelegatee();
        boolean boolean7 = booleanJsonDeserializer4.isCachable();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(double8);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = characterDeserializer5.getObjectIdReader();
        boolean boolean8 = characterDeserializer5._primitive;
        com.fasterxml.jackson.databind.JavaType javaType9 = characterDeserializer5.getValueType();
        java.lang.Class<?> wildcardClass10 = characterDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer12 = characterDeserializer5.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Character char14 = characterDeserializer5.getEmptyValue(deserializationContext13);
        java.lang.Class<?> wildcardClass15 = characterDeserializer5.getValueClass();
        boolean boolean16 = characterDeserializer5._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(charJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer4.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer4.getObjectIdReader();
        boolean boolean7 = characterDeserializer4._primitive;
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer4.getValueType();
        java.lang.Class<?> wildcardClass9 = characterDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer4.unwrappingDeserializer(nameTransformer10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = longDeserializer0.replaceDelegatee(charJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Character char6 = characterDeserializer0.getEmptyValue(deserializationContext5);
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = objJsonDeserializer6.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objJsonDeserializer6.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = wildcardJsonDeserializer9.getObjectIdReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.math.BigDecimal bigDecimal12 = bigDecimalDeserializer0.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = bigDecimalDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(bigDecimal12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = numberDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.handledType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = booleanDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = booleanDeserializer0.handledType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.lang.Double double9 = doubleDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass10 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer11 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass12 = characterDeserializer11.getValueClass();
        java.util.Collection<java.lang.Object> objCollection13 = characterDeserializer11.getKnownPropertyNames();
        boolean boolean14 = characterDeserializer11._primitive;
        java.lang.Class<?> wildcardClass15 = characterDeserializer11.getValueClass();
        java.lang.Character char16 = characterDeserializer11.getEmptyValue();
        java.lang.Class<?> wildcardClass17 = characterDeserializer11.getValueClass();
        boolean boolean18 = characterDeserializer11.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(characterDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = integerDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        boolean boolean5 = floatDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = floatDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Float float10 = floatDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = floatDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(float10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = longDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        boolean boolean4 = characterDeserializer0.isCachable();
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer9 = shortJsonDeserializer7.unwrappingDeserializer(nameTransformer8);
        java.lang.Short short10 = shortJsonDeserializer7.getEmptyValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertNotNull(shortJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = numberDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = wildcardJsonDeserializer7.isCachable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getEmptyValue();
        boolean boolean7 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer12 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer12);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean5 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = booleanDeserializer0.getDelegatee();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer10 = booleanDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = booleanJsonDeserializer10.getDelegatee();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(double9);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = characterDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = characterDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        java.util.Collection<java.lang.Object> objCollection12 = byteDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = longDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = longDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short7 = shortDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Short) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Short (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        java.lang.Integer int5 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = integerDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        boolean boolean2 = characterDeserializer0._primitive;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char6 = characterDeserializer0.deserialize(jsonParser3, deserializationContext4, (java.lang.Character) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer10 = integerDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer12 = integerDeserializer0.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(intJsonDeserializer10);
        org.junit.Assert.assertNotNull(intJsonDeserializer12);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double8 = doubleDeserializer0.deserialize(jsonParser6, deserializationContext7);
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
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        boolean boolean4 = characterDeserializer0._primitive;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Character char8 = characterDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass9 = integerDeserializer0.handledType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue(deserializationContext2);
        boolean boolean4 = bigDecimalDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double7 = doubleDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = integerDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = charJsonDeserializer8.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = charJsonDeserializer8.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigDecimalDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = bigDecimalDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = bigDecimalDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = integerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int11 = integerDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = floatDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Float float10 = floatDeserializer0.getEmptyValue(deserializationContext9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = floatDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(float10);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double5 = doubleDeserializer0.deserialize(jsonParser2, deserializationContext3, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Float float9 = floatDeserializer0.getEmptyValue(deserializationContext8);
        java.util.Collection<java.lang.Object> objCollection10 = floatDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(float9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        java.lang.Byte byte10 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer11 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass12 = characterDeserializer11.getValueClass();
        java.lang.Class<?> wildcardClass13 = characterDeserializer11.getValueClass();
        java.lang.Class<?> wildcardClass14 = characterDeserializer11.handledType();
        java.lang.Class<?> wildcardClass15 = characterDeserializer11.getValueClass();
        java.lang.Character char16 = characterDeserializer11._nullValue;
        java.lang.Character char17 = characterDeserializer11.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = byteDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNotNull(characterDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = numberDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = numberDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType8 = bigIntegerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer9.getDelegatee();
        java.lang.Character char11 = characterDeserializer9._nullValue;
        java.lang.Character char12 = characterDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType13 = characterDeserializer9.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType14 = characterDeserializer9.getValueType();
        java.lang.Character char15 = characterDeserializer9._nullValue;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(char15);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Character char7 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double6 = doubleDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = floatDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = floatDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = longDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection4 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Short short6 = shortDeserializer0.getEmptyValue(deserializationContext5);
        boolean boolean7 = shortDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = booleanDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0._nullValue;
        boolean boolean5 = characterDeserializer0._primitive;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = characterDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Short short6 = shortDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(short6);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float6 = floatDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = bigDecimalDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = bigDecimalDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer3 = longDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = longJsonDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = longJsonDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer7 = longJsonDeserializer3.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = longJsonDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        java.lang.Class<?> wildcardClass11 = characterDeserializer9.getValueClass();
        java.lang.Class<?> wildcardClass12 = characterDeserializer9.handledType();
        java.lang.Class<?> wildcardClass13 = characterDeserializer9.getValueClass();
        java.lang.Character char14 = characterDeserializer9._nullValue;
        java.lang.Character char15 = characterDeserializer9.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = longJsonDeserializer3.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(longJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(longJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.getValueClass();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = bigIntegerDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(bigInteger5);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        java.lang.Character char8 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = booleanDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.getValueClass();
        java.lang.Integer int6 = integerDeserializer0.getNullValue();
        boolean boolean7 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType8 = integerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = booleanDeserializer0.getObjectIdReader();
        java.lang.Boolean boolean10 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Boolean boolean12 = booleanDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = characterDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatJsonDeserializer2.getObjectIdReader();
        java.lang.Float float4 = floatJsonDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float10 = floatJsonDeserializer2.deserialize(jsonParser7, deserializationContext8, (java.lang.Float) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = longDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }
}

