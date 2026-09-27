package com.fasterxml.jackson.databind.deser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = numberDeserializer0.getNullValue(deserializationContext7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = numberDeserializer0.findBackReference("");
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
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Boolean boolean3 = booleanDeserializer0.getEmptyValue();
        java.lang.Boolean boolean4 = booleanDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        boolean boolean9 = bigIntegerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = numberDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = characterDeserializer5.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = characterDeserializer5.handledType();
        java.lang.Class<?> wildcardClass9 = characterDeserializer5.handledType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objJsonDeserializer2.deserialize(jsonParser3, deserializationContext4, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Class (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer7 = longDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(longJsonDeserializer7);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = booleanDeserializer0.getValueType();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Boolean boolean6 = booleanDeserializer0.getNullValue(deserializationContext5);
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(byte4);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue(deserializationContext2);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass5 = characterDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass6 = characterDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer4.getValueType();
        java.lang.Class<?> wildcardClass8 = characterDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass9 = characterDeserializer4.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer4.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getNullValue(deserializationContext6);
        java.lang.Double double8 = doubleDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(double8);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = bigDecimalDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Double double11 = doubleDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNull(double11);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float8 = floatDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Float) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = numberDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Object obj3 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = numberDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = numberDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberDeserializer0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = booleanJsonDeserializer10.findBackReference("");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer4 = byteDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer4 = booleanDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        java.lang.Character char6 = characterDeserializer5.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer4);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNull(char6);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
        boolean boolean5 = longDeserializer0.isCachable();
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
        org.junit.Assert.assertNotNull(longJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer.instance;
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer3.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer3.getKnownPropertyNames();
        java.lang.Character char6 = characterDeserializer3._nullValue;
        java.lang.Class<?> wildcardClass7 = characterDeserializer3.handledType();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = characterDeserializer3.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float11 = floatDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Float) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer4.unwrappingDeserializer(nameTransformer5);
        java.util.Collection<java.lang.Object> objCollection7 = floatJsonDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float11 = floatJsonDeserializer4.deserialize(jsonParser8, deserializationContext9, (java.lang.Float) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer5 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer7 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer7);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.math.BigInteger bigInteger3 = bigIntegerJsonDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerJsonDeserializer5.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerJsonDeserializer5.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int5 = integerDeserializer0.getEmptyValue();
        boolean boolean6 = integerDeserializer0.isCachable();
        boolean boolean7 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = integerDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer5 = byteDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte9 = byteJsonDeserializer5.deserialize(jsonParser6, deserializationContext7, (java.lang.Byte) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNotNull(byteJsonDeserializer5);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        boolean boolean4 = longDeserializer0.isCachable();
        boolean boolean5 = longDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = longDeserializer0.getValueClass();
        java.lang.Long long7 = longDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        boolean boolean10 = characterDeserializer8._primitive;
        java.lang.Character char11 = characterDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = characterDeserializer8.getValueType();
        java.lang.Character char13 = characterDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = characterDeserializer8.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = longDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = numberDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = numberDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Object obj5 = numberDeserializer0.getNullValue();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.math.BigInteger bigInteger6 = bigIntegerJsonDeserializer5.getNullValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Boolean boolean8 = booleanDeserializer0.getNullValue(deserializationContext7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = booleanDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection6 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        boolean boolean7 = shortDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection8 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType10 = characterDeserializer9.getValueType();
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer9.getKnownPropertyNames();
        java.lang.Character char12 = characterDeserializer9._nullValue;
        java.lang.Character char13 = characterDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = characterDeserializer9.getObjectIdReader();
        java.lang.Class<?> wildcardClass15 = characterDeserializer9.getValueClass();
        java.util.Collection<java.lang.Object> objCollection16 = characterDeserializer9.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(objCollection16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Short short6 = shortDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(short6);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Character char6 = characterDeserializer0.getEmptyValue(deserializationContext5);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        java.lang.Long long5 = longDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.util.Collection<java.lang.Object> objCollection11 = doubleJsonDeserializer10.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer8);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        java.lang.Boolean boolean10 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = booleanDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = bigDecimalDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = bigDecimalDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = characterDeserializer5.getObjectIdReader();
        boolean boolean8 = characterDeserializer5._primitive;
        com.fasterxml.jackson.databind.JavaType javaType9 = characterDeserializer5.getValueType();
        java.lang.Class<?> wildcardClass10 = characterDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer12 = characterDeserializer5.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = characterDeserializer5.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = characterDeserializer5.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer16 = characterDeserializer5.unwrappingDeserializer(nameTransformer15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(charJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNotNull(charJsonDeserializer16);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = byteDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(byte9);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = numberDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = numberDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer10 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = bigIntegerJsonDeserializer10.getObjectIdReader();
        java.math.BigInteger bigInteger12 = bigIntegerJsonDeserializer10.getEmptyValue();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(bigInteger12);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = booleanJsonDeserializer10.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue(deserializationContext8);
        java.util.Collection<java.lang.Object> objCollection10 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer12 = doubleDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Double double13 = doubleDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer12);
        org.junit.Assert.assertNull(double13);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigDecimalDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = characterDeserializer0.getNullValue(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte6 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer8.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer13 = characterDeserializer8.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Character char15 = characterDeserializer8.getEmptyValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = byteDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(charJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        boolean boolean5 = longDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer7 = longDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Long long8 = longDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass9 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Long long11 = longDeserializer0.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        java.lang.Class<?> wildcardClass10 = booleanDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = byteJsonDeserializer8.getClass();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.getEmptyValue(deserializationContext6);
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigInteger7);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long9 = longDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType2 = longDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(javaType2);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Short short8 = shortDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Short short9 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = shortDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
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
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = booleanDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext6);
        java.math.BigInteger bigInteger8 = bigIntegerJsonDeserializer2.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigInteger bigInteger11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = bigIntegerJsonDeserializer2.deserialize(jsonParser9, deserializationContext10, bigInteger11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNull(bigInteger8);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean5 = characterDeserializer4.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer4.unwrappingDeserializer(nameTransformer6);
        java.lang.Character char8 = characterDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = characterDeserializer4.getDelegatee();
        boolean boolean10 = characterDeserializer4.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = numberDeserializer0.deserialize(jsonParser16, deserializationContext17, obj18);
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
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = longDeserializer0.handledType();
        java.lang.Long long6 = longDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        java.lang.Byte byte11 = byteDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
        org.junit.Assert.assertNull(byte11);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.handledType();
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = bigDecimalDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        boolean boolean4 = characterDeserializer0._primitive;
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = byteDeserializer0.getValueType();
        java.lang.Byte byte8 = byteDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(byte8);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer4 = booleanDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue(deserializationContext7);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        boolean boolean2 = characterDeserializer0._primitive;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue();
        boolean boolean4 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer10 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.math.BigInteger bigInteger11 = bigIntegerJsonDeserializer10.getNullValue();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer10);
        org.junit.Assert.assertNull(bigInteger11);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = integerDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = characterDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        boolean boolean5 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = numberDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Byte byte7 = byteDeserializer0.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = longDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double13 = doubleDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
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
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean6 = doubleDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(double9);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        java.lang.Double double4 = doubleDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = doubleDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = doubleDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = bigDecimalDeserializer0.getValueClass();
        boolean boolean10 = bigDecimalDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass11 = bigDecimalDeserializer0.handledType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer3 = longDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = longJsonDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = longJsonDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer7 = longJsonDeserializer3.unwrappingDeserializer(nameTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = longJsonDeserializer3.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(longJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(longJsonDeserializer7);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        boolean boolean4 = characterDeserializer0._primitive;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Byte byte7 = byteDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(byte7);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = bigIntegerDeserializer0.deserialize(jsonParser6, deserializationContext7, bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger5);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = booleanDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.handledType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer4 = integerDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType8 = integerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(intJsonDeserializer4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer3 = longDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = longJsonDeserializer3.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = longJsonDeserializer3.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(longJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue();
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(bigDecimal7);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getNullValue(deserializationContext5);
        boolean boolean7 = integerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer8 = doubleDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = doubleJsonDeserializer8.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = integerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = integerDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Character char5 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        java.lang.Character char7 = characterDeserializer0._nullValue;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        boolean boolean6 = characterDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Object obj3 = numberDeserializer0.getNullValue();
        boolean boolean4 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = numberDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = numberDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean5 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = booleanDeserializer0.getDelegatee();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = booleanDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = byteDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = floatDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType6 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        boolean boolean7 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Boolean boolean11 = booleanDeserializer0.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        boolean boolean12 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int16 = integerDeserializer0.deserialize(jsonParser13, deserializationContext14, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Boolean boolean3 = booleanDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = bigDecimalDeserializer0.deserialize(jsonParser8, deserializationContext9, bigDecimal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = objJsonDeserializer7.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = objJsonDeserializer7.findBackReference("");
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
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = characterDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean11 = characterDeserializer10.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Character char14 = characterDeserializer10.getEmptyValue(deserializationContext13);
        java.util.Collection<java.lang.Object> objCollection15 = characterDeserializer10.getKnownPropertyNames();
        boolean boolean16 = characterDeserializer10.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Character char18 = characterDeserializer10.getNullValue(deserializationContext17);
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
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(char18);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int5 = integerDeserializer0.getEmptyValue();
        boolean boolean6 = integerDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Integer int10 = integerDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = integerDeserializer0.deserialize(jsonParser11, deserializationContext12, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        java.lang.Long long2 = longDeserializer0.getNullValue();
        boolean boolean3 = longDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = longDeserializer0.handledType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = shortDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = shortDeserializer0.handledType();
        java.lang.Short short3 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = shortDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(short3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer9 = shortJsonDeserializer7.unwrappingDeserializer(nameTransformer8);
        java.lang.Short short10 = shortJsonDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = shortJsonDeserializer7.getDelegatee();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertNotNull(shortJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        java.lang.Character char7 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = integerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        java.lang.Float float10 = floatDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(float10);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer10 = shortDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer12 = shortDeserializer0.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
        org.junit.Assert.assertNotNull(shortJsonDeserializer12);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        boolean boolean2 = characterDeserializer0.isCachable();
        boolean boolean3 = characterDeserializer0._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.lang.Float float1 = floatDeserializer0.getNullValue();
        java.lang.Float float2 = floatDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = numberDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = numberDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.handledType();
        boolean boolean7 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = shortDeserializer0.getValueClass();
        boolean boolean9 = shortDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer3 = byteDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer5 = byteDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = characterDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = characterDeserializer6.handledType();
        java.lang.Class<?> wildcardClass10 = characterDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = characterDeserializer6.getDelegatee();
        java.lang.Character char12 = characterDeserializer6.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = byteJsonDeserializer5.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNotNull(byteJsonDeserializer5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean4 = booleanDeserializer0.getNullValue();
        java.lang.Boolean boolean5 = booleanDeserializer0.getEmptyValue();
        java.lang.Boolean boolean6 = booleanDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = byteDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Byte byte8 = byteDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Byte byte11 = byteDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(byte8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(byte11);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        boolean boolean3 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = shortDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = booleanDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = booleanDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Short short3 = shortDeserializer0.getEmptyValue(deserializationContext2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = shortDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        boolean boolean7 = doubleDeserializer0.isCachable();
        boolean boolean8 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType10 = doubleDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Integer int11 = integerDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = integerDeserializer0.deserialize(jsonParser12, deserializationContext13);
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double12 = doubleDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        java.lang.Character char1 = characterDeserializer0.getEmptyValue();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Short short9 = shortJsonDeserializer7.getEmptyValue(deserializationContext8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = shortJsonDeserializer7.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        boolean boolean12 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = numberDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = booleanDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection7 = booleanDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer3 = byteDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Byte byte4 = byteJsonDeserializer3.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection5 = byteJsonDeserializer3.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = byteJsonDeserializer3.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        boolean boolean11 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType12 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType13 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = bigDecimalDeserializer0.deserialize(jsonParser14, deserializationContext15);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean6 = doubleDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType8 = doubleDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass9 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = doubleDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext6);
        java.math.BigInteger bigInteger8 = bigIntegerJsonDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = bigIntegerJsonDeserializer2.getObjectIdReader();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Boolean boolean13 = booleanDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Boolean boolean16 = booleanDeserializer0.getEmptyValue(deserializationContext15);
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
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        boolean boolean6 = characterDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        java.lang.Boolean boolean13 = booleanDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass14 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean17 = booleanDeserializer0.deserialize(jsonParser15, deserializationContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.lang.Short short5 = shortDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer8 = floatDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNotNull(floatJsonDeserializer8);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean11 = characterDeserializer10.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer13 = characterDeserializer10.unwrappingDeserializer(nameTransformer12);
        boolean boolean14 = characterDeserializer10.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer16 = characterDeserializer10.unwrappingDeserializer(nameTransformer15);
        java.lang.Character char17 = characterDeserializer10.getNullValue();
        boolean boolean18 = characterDeserializer10._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        java.lang.Double double11 = doubleJsonDeserializer8.getEmptyValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer8);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer10);
        org.junit.Assert.assertNull(double11);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = booleanDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char5 = characterDeserializer0._nullValue;
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        boolean boolean5 = longDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = longDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = floatDeserializer0.getValueType();
        java.lang.Float float4 = floatDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = floatDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(float4);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.handledType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char5 = characterDeserializer0.getNullValue(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue(deserializationContext2);
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
        org.junit.Assert.assertNull(bigDecimal3);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Byte byte10 = byteDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Byte byte13 = byteDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(byte13);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer5 = integerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = intJsonDeserializer5.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = intJsonDeserializer5.getDelegatee();
        java.lang.Integer int8 = intJsonDeserializer5.getEmptyValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = integerDeserializer0.deserialize(jsonParser12, deserializationContext13);
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
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Integer int4 = integerDeserializer0.getNullValue(deserializationContext3);
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        java.lang.Character char9 = characterDeserializer8.getNullValue();
        java.lang.Character char10 = characterDeserializer8.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Float float5 = floatDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
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
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = characterDeserializer0.getNullValue(deserializationContext9);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigInteger bigInteger11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = bigIntegerDeserializer0.deserialize(jsonParser9, deserializationContext10, bigInteger11);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        boolean boolean1 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = shortDeserializer0.handledType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Byte byte7 = byteDeserializer0.getNullValue();
        java.lang.Byte byte8 = byteDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte8);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = numberDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer7.getKnownPropertyNames();
        java.lang.Character char10 = characterDeserializer7._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer12 = characterDeserializer7.unwrappingDeserializer(nameTransformer11);
        java.lang.Character char13 = characterDeserializer7.getEmptyValue();
        java.lang.Class<?> wildcardClass14 = characterDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass15 = characterDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = characterDeserializer7.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = numberDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = characterDeserializer0.deserialize(jsonParser10, deserializationContext11, (java.lang.Character) '\000');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Short short8 = shortDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer10 = shortDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short13 = shortDeserializer0.deserialize(jsonParser11, deserializationContext12);
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
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = doubleJsonDeserializer5.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean6 = doubleDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType8 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = doubleDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Character char8 = characterDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.handledType();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = numberDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = numberDeserializer0.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType13 = characterDeserializer12.getValueType();
        java.lang.Character char14 = characterDeserializer12.getEmptyValue();
        boolean boolean15 = characterDeserializer12._primitive;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = characterDeserializer12.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer12);
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
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(objectIdReader16);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean12 = booleanDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.lang.Float float6 = floatDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        boolean boolean3 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer5 = shortDeserializer0.unwrappingDeserializer(nameTransformer4);
        boolean boolean6 = shortDeserializer0.isCachable();
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
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType2 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer4 = integerDeserializer0.unwrappingDeserializer(nameTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = intJsonDeserializer4.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(intJsonDeserializer4);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = integerDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = objJsonDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = objJsonDeserializer7.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer11 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass12 = characterDeserializer11.getValueClass();
        java.util.Collection<java.lang.Object> objCollection13 = characterDeserializer11.getKnownPropertyNames();
        boolean boolean14 = characterDeserializer11._primitive;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = characterDeserializer11.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = objJsonDeserializer7.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer11);
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
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(characterDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char5 = characterDeserializer0.deserialize(jsonParser2, deserializationContext3, (java.lang.Character) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        java.util.Collection<java.lang.Object> objCollection10 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        java.lang.Object obj7 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = numberDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
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
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        boolean boolean4 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean6 = characterDeserializer5.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer5.unwrappingDeserializer(nameTransformer7);
        java.lang.Character char9 = characterDeserializer5._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer5.unwrappingDeserializer(nameTransformer10);
        boolean boolean12 = characterDeserializer5.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue(deserializationContext8);
        java.util.Collection<java.lang.Object> objCollection10 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer12 = doubleDeserializer0.unwrappingDeserializer(nameTransformer11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = doubleJsonDeserializer12.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
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
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer12);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = bigDecimalJsonDeserializer8.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer0.getValueType();
        boolean boolean9 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = bigIntegerDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(bigInteger7);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = bigDecimalDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        java.lang.Class<?> wildcardClass12 = numberDeserializer0.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = bigIntegerDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger6);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.getValueClass();
        boolean boolean8 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        boolean boolean5 = floatDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float8 = floatDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = floatDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(float8);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.handledType();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        java.lang.Byte byte1 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass2 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = byteDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double10 = doubleDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.util.Collection<java.lang.Object> objCollection10 = booleanJsonDeserializer9.getKnownPropertyNames();
        boolean boolean11 = booleanJsonDeserializer9.isCachable();
        java.lang.Boolean boolean12 = booleanJsonDeserializer9.getEmptyValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = doubleDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = doubleDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer6.getValueType();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer6.getKnownPropertyNames();
        java.lang.Character char9 = characterDeserializer6._nullValue;
        java.lang.Character char10 = characterDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = characterDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = characterDeserializer6.getValueClass();
        boolean boolean13 = characterDeserializer6._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Float float4 = floatDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = floatDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer6 = byteDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalJsonDeserializer6.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getEmptyValue(deserializationContext9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = bigDecimalDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int8 = integerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = integerDeserializer0.getDelegatee();
        java.lang.Integer int6 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = integerDeserializer0.deserialize(jsonParser10, deserializationContext11);
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
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean9 = characterDeserializer8.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer8.unwrappingDeserializer(nameTransformer10);
        java.lang.Character char12 = characterDeserializer8.getEmptyValue();
        boolean boolean13 = characterDeserializer8.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        java.util.Collection<java.lang.Object> objCollection10 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = integerDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Integer int4 = integerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = integerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = integerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        java.lang.Boolean boolean14 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = booleanDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Character char5 = characterDeserializer0._nullValue;
        boolean boolean6 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = floatDeserializer0.getObjectIdReader();
        boolean boolean9 = floatDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = floatDeserializer0.findBackReference("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        boolean boolean3 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = floatDeserializer0.getDelegatee();
        java.lang.Float float5 = floatDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.handledType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.lang.Float float1 = floatDeserializer0.getNullValue();
        java.lang.Float float2 = floatDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
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
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = longDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Long long7 = longDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = longDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer9 = floatDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNotNull(floatJsonDeserializer9);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = booleanDeserializer0.getKnownPropertyNames();
        java.lang.Boolean boolean4 = booleanDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = floatDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(float7);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(bigInteger7);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigIntegerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Character char9 = charJsonDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = charJsonDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = charJsonDeserializer8.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        boolean boolean11 = bigDecimalDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass12 = bigDecimalDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass13 = bigDecimalDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = bigDecimalDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objectIdReader14);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer10.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = characterDeserializer10.getObjectIdReader();
        boolean boolean13 = characterDeserializer10._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Character char15 = characterDeserializer10.getEmptyValue(deserializationContext14);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = characterDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = characterDeserializer10.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection18 = characterDeserializer10.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass19 = characterDeserializer10.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
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
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer9 = floatDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(floatJsonDeserializer9);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        boolean boolean5 = longDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        java.lang.Class<?> wildcardClass10 = byteDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection11 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType13 = characterDeserializer12.getValueType();
        java.util.Collection<java.lang.Object> objCollection14 = characterDeserializer12.getKnownPropertyNames();
        java.lang.Character char15 = characterDeserializer12._nullValue;
        java.lang.Character char16 = characterDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Character char18 = characterDeserializer12.getEmptyValue(deserializationContext17);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = byteDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer12);
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
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        boolean boolean7 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Boolean boolean11 = booleanDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Boolean boolean13 = booleanDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        boolean boolean6 = floatDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = floatDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = numberDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
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
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Character char2 = characterDeserializer0.getNullValue();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = doubleDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean12 = booleanDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        boolean boolean5 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType6 = floatDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer2 = byteDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = byteDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(byteJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigInteger bigInteger11 = bigIntegerDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.math.BigInteger bigInteger13 = bigIntegerDeserializer0.getEmptyValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(bigInteger9);
        org.junit.Assert.assertNull(bigInteger11);
        org.junit.Assert.assertNull(bigInteger13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = shortDeserializer0.getValueType();
        java.lang.Short short9 = shortDeserializer0.getEmptyValue();
        java.lang.Short short10 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short12 = shortDeserializer0.getNullValue(deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        java.lang.Boolean boolean10 = booleanDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = characterDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Character) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer7 = integerDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = integerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = integerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(intJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass9 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = shortDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer9 = booleanDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean12 = booleanDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer9);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = characterDeserializer0.isCachable();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = byteDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Byte byte8 = byteDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(byte8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue();
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(bigInteger4);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Boolean boolean12 = booleanDeserializer0.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Boolean boolean14 = booleanDeserializer0.getEmptyValue(deserializationContext13);
        java.lang.Class<?> wildcardClass15 = booleanDeserializer0.handledType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass3 = characterDeserializer2.getValueClass();
        java.util.Collection<java.lang.Object> objCollection4 = characterDeserializer2.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer2.getKnownPropertyNames();
        java.lang.Character char6 = characterDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer2.unwrappingDeserializer(nameTransformer7);
        boolean boolean9 = characterDeserializer2.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(characterDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = charJsonDeserializer8.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
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
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.math.BigInteger bigInteger3 = bigIntegerJsonDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerJsonDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerJsonDeserializer5.getNullValue(deserializationContext8);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger9);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer7 = doubleDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer8.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = characterDeserializer8.handledType();
        java.lang.Class<?> wildcardClass12 = characterDeserializer8.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = characterDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = characterDeserializer6.getValueClass();
        java.lang.Class<?> wildcardClass10 = characterDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = characterDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = characterDeserializer6.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Float float8 = floatDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = floatDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = floatDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(float8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection4 = characterDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(bigInteger4);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        boolean boolean9 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double12 = doubleDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer4 = integerDeserializer0.unwrappingDeserializer(nameTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = integerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(intJsonDeserializer4);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = numberDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer5.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = booleanDeserializer5.getValueClass();
        boolean boolean9 = booleanDeserializer5.isCachable();
        boolean boolean10 = booleanDeserializer5.isCachable();
        java.lang.Boolean boolean11 = booleanDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = booleanDeserializer5.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType13 = booleanDeserializer5.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objJsonDeserializer2.deserialize(jsonParser3, deserializationContext4, (java.lang.Object) javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(booleanDeserializer5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Double double9 = doubleDeserializer0.getNullValue(deserializationContext8);
        java.lang.Double double10 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double13 = doubleDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNull(double10);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = doubleDeserializer0.getValueType();
        boolean boolean7 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer11 = doubleDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer11);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Long long6 = longDeserializer0.getEmptyValue(deserializationContext5);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = characterDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Short short8 = shortDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer10 = shortDeserializer0.unwrappingDeserializer(nameTransformer9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = shortJsonDeserializer10.findBackReference("hi!");
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
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean4 = booleanDeserializer0.getNullValue();
        java.lang.Boolean boolean5 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType7 = booleanDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        boolean boolean3 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = shortDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer0.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = characterDeserializer0._primitive;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = longDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Double double11 = doubleDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = doubleDeserializer0.getDelegatee();
        java.lang.Double double13 = doubleDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(double13);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.handledType();
        boolean boolean7 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = shortDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer10.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = characterDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass13 = characterDeserializer10.handledType();
        java.lang.Class<?> wildcardClass14 = characterDeserializer10.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Character char16 = characterDeserializer10.getEmptyValue(deserializationContext15);
        java.lang.Character char17 = characterDeserializer10.getNullValue();
        boolean boolean18 = characterDeserializer10.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = longDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        boolean boolean11 = booleanDeserializer0.isCachable();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection9 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte12 = byteDeserializer0.deserialize(jsonParser10, deserializationContext11);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Float float6 = floatDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Float float8 = floatDeserializer0.getNullValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = floatDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass11 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(float8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = bigIntegerDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = bigDecimalDeserializer0.getObjectIdReader();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(bigDecimal6);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float4 = floatDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        java.lang.Class<?> wildcardClass10 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = booleanDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = characterDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer9 = shortDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = shortJsonDeserializer9.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(shortJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = shortDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNull(bigInteger9);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = numberDeserializer0.handledType();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = characterDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Object obj3 = numberDeserializer0.getNullValue();
        boolean boolean4 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = numberDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = numberDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = numberDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = numberDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Object obj3 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = numberDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = numberDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer7.getKnownPropertyNames();
        java.lang.Character char10 = characterDeserializer7._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer12 = characterDeserializer7.unwrappingDeserializer(nameTransformer11);
        java.lang.Character char13 = characterDeserializer7.getEmptyValue();
        java.lang.Class<?> wildcardClass14 = characterDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Character char16 = characterDeserializer7.getEmptyValue(deserializationContext15);
        java.lang.Character char17 = characterDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = characterDeserializer7.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = characterDeserializer7.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = numberDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberDeserializer0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(objectIdReader18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue();
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
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
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        boolean boolean6 = integerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = integerDeserializer0.handledType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        boolean boolean7 = doubleDeserializer0.isCachable();
        boolean boolean8 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = doubleDeserializer0.getObjectIdReader();
        boolean boolean10 = doubleDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass11 = doubleDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = integerDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = numberDeserializer0.getObjectIdReader();
        boolean boolean7 = numberDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        java.lang.Boolean boolean13 = booleanDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass14 = booleanDeserializer0.getValueClass();
        boolean boolean15 = booleanDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        java.lang.Character char2 = characterDeserializer0._nullValue;
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = characterDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = characterDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        java.lang.Double double3 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Double double6 = doubleJsonDeserializer5.getEmptyValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNull(double6);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.handledType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue(deserializationContext6);
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = objJsonDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objJsonDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = objJsonDeserializer7.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        boolean boolean5 = longDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Long long7 = longDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long11 = longDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short9 = shortDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        boolean boolean5 = floatDeserializer0.isCachable();
        java.lang.Float float6 = floatDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getNullValue(deserializationContext3);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer4.unwrappingDeserializer(nameTransformer5);
        java.util.Collection<java.lang.Object> objCollection7 = floatJsonDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = floatJsonDeserializer4.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.util.Collection<java.lang.Object> objCollection10 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = floatDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer8 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer8);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getEmptyValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(bigInteger5);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = floatDeserializer0.getDelegatee();
        java.lang.Float float7 = floatDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(float7);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        boolean boolean13 = bigDecimalDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass14 = bigDecimalDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Double double14 = doubleDeserializer0.getNullValue(deserializationContext13);
        java.lang.Double double15 = doubleDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(double14);
        org.junit.Assert.assertNull(double15);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatJsonDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer5 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        boolean boolean6 = floatJsonDeserializer2.isCachable();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(floatJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = numberDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = numberDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = integerDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = integerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigIntegerDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = bigIntegerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = charJsonDeserializer9.deserialize(jsonParser10, deserializationContext11);
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
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNull(byte12);
        org.junit.Assert.assertNull(byte13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = integerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer10 = characterDeserializer6.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = characterDeserializer6.handledType();
        java.util.Collection<java.lang.Object> objCollection12 = characterDeserializer6.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(charJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = bigDecimalDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = bigDecimalDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = charJsonDeserializer5.getEmptyValue(deserializationContext6);
        java.lang.Character char8 = charJsonDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = charJsonDeserializer5.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Byte byte10 = byteDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = byteDeserializer0.handledType();
        java.lang.Byte byte12 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Byte byte14 = byteDeserializer0.getEmptyValue(deserializationContext13);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(byte12);
        org.junit.Assert.assertNull(byte14);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = longDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = longDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        java.lang.Object obj11 = numberDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass12 = numberDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass6 = characterDeserializer5.getValueClass();
        java.lang.Class<?> wildcardClass7 = characterDeserializer5.getValueClass();
        java.lang.Character char8 = characterDeserializer5._nullValue;
        java.lang.Class<?> wildcardClass9 = characterDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer5.unwrappingDeserializer(nameTransformer10);
        java.lang.Character char12 = characterDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer14 = characterDeserializer5.unwrappingDeserializer(nameTransformer13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer14);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        java.lang.Byte byte11 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = byteDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNull(byte11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatJsonDeserializer2.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer8 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer10 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertNotNull(floatJsonDeserializer8);
        org.junit.Assert.assertNotNull(floatJsonDeserializer10);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = floatDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.getValueClass();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Float float6 = floatDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = byteDeserializer0.handledType();
        boolean boolean10 = byteDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = longDeserializer0.handledType();
        java.lang.Long long7 = longDeserializer0.getEmptyValue();
        java.lang.Long long8 = longDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = characterDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer1 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = characterDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer1.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer1.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = characterDeserializer1.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = characterDeserializer1.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(characterDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Byte byte8 = byteDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        java.lang.Class<?> wildcardClass11 = characterDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType12 = characterDeserializer9.getValueType();
        boolean boolean13 = characterDeserializer9._primitive;
        boolean boolean14 = characterDeserializer9._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = byteDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(byte8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = integerDeserializer0.getValueType();
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = integerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass7 = longDeserializer0.handledType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Integer int9 = integerDeserializer0.getNullValue(deserializationContext8);
        boolean boolean10 = integerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Short short2 = shortDeserializer0.getNullValue(deserializationContext1);
        java.lang.Short short3 = shortDeserializer0.getNullValue();
        java.lang.Short short4 = shortDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short3);
        org.junit.Assert.assertNull(short4);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer10 = shortDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Short short11 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean13 = characterDeserializer12.isCachable();
        java.lang.Class<?> wildcardClass14 = characterDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Character char16 = characterDeserializer12.getNullValue(deserializationContext15);
        boolean boolean17 = characterDeserializer12._primitive;
        java.lang.Class<?> wildcardClass18 = characterDeserializer12.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(char16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char3 = characterDeserializer0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean4 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.handledType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        java.math.BigInteger bigInteger12 = bigIntegerDeserializer0.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(bigInteger9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(bigInteger12);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean10 = characterDeserializer9.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Character char12 = characterDeserializer9.getEmptyValue(deserializationContext11);
        boolean boolean13 = characterDeserializer9.isCachable();
        java.lang.Character char14 = characterDeserializer9.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
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
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(char14);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = doubleDeserializer0.handledType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer6 = longDeserializer0.unwrappingDeserializer(nameTransformer5);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer4);
        org.junit.Assert.assertNotNull(longJsonDeserializer6);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType6 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer8.getKnownPropertyNames();
        java.lang.Character char11 = characterDeserializer8._nullValue;
        boolean boolean12 = characterDeserializer8._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        boolean boolean2 = characterDeserializer0._primitive;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        java.lang.Boolean boolean13 = booleanDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection14 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = booleanDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = shortDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Double double5 = doubleDeserializer0.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = doubleDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean6 = doubleDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = doubleDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = doubleDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        java.util.Collection<java.lang.Object> objCollection10 = bigDecimalDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType8 = floatDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Double double4 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer8 = doubleDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer8);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Character char2 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection4 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Character char6 = characterDeserializer0.getNullValue(deserializationContext5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(char6);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer3 = longDeserializer0.unwrappingDeserializer(nameTransformer2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = longDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(longJsonDeserializer3);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        boolean boolean6 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer8 = floatDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = floatJsonDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer10.getValueType();
        java.util.Collection<java.lang.Object> objCollection12 = characterDeserializer10.getKnownPropertyNames();
        java.lang.Character char13 = characterDeserializer10._nullValue;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = floatJsonDeserializer8.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer11 = doubleDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Double double13 = doubleDeserializer0.getNullValue(deserializationContext12);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer11);
        org.junit.Assert.assertNull(double13);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Double double12 = doubleDeserializer0.getNullValue(deserializationContext11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double15 = doubleDeserializer0.deserialize(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(double12);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean16 = booleanDeserializer0.deserializeWithType(jsonParser13, deserializationContext14, typeDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        com.fasterxml.jackson.databind.JavaType javaType11 = shortDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = longDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatJsonDeserializer2.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer6 = floatJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = floatJsonDeserializer6.isCachable();
        boolean boolean8 = floatJsonDeserializer6.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        java.lang.Class<?> wildcardClass11 = characterDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType12 = characterDeserializer9.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = floatJsonDeserializer6.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(floatJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
        boolean boolean6 = longDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long9 = longDeserializer0.getNullValue(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.getNullValue(deserializationContext9);
        java.math.BigDecimal bigDecimal11 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = bigDecimalDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer3 = shortDeserializer0.unwrappingDeserializer(nameTransformer2);
        boolean boolean4 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass6 = characterDeserializer5.getValueClass();
        java.util.Collection<java.lang.Object> objCollection7 = characterDeserializer5.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer5.getKnownPropertyNames();
        java.lang.Character char9 = characterDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer5.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer5.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer14 = characterDeserializer5.unwrappingDeserializer(nameTransformer13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = shortDeserializer0.replaceDelegatee(charJsonDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(shortJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(charJsonDeserializer14);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.math.BigInteger bigInteger8 = bigIntegerJsonDeserializer7.getEmptyValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger8);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        java.lang.Long long2 = longDeserializer0.getNullValue();
        java.lang.Long long3 = longDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Long long7 = longDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Long long9 = longDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger2);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer6 = byteDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        java.lang.Byte byte9 = byteDeserializer0.getEmptyValue();
        boolean boolean10 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte14 = byteDeserializer0.deserialize(jsonParser11, deserializationContext12, (java.lang.Byte) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType9 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = booleanDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer3.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer3.getKnownPropertyNames();
        java.lang.Character char6 = characterDeserializer3._nullValue;
        java.lang.Character char7 = characterDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = characterDeserializer3.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = characterDeserializer3.getValueClass();
        boolean boolean10 = characterDeserializer3._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.math.BigDecimal bigDecimal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = bigDecimalDeserializer0.deserialize(jsonParser10, deserializationContext11, bigDecimal12);
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
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Short short8 = shortJsonDeserializer7.getEmptyValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleJsonDeserializer3.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = doubleJsonDeserializer3.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Byte byte9 = byteDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.JavaType javaType10 = byteDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection11 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer5 = booleanDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        java.lang.Object obj11 = numberDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        boolean boolean2 = characterDeserializer0._primitive;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = charJsonDeserializer6.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = longDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = numberDeserializer0.handledType();
        java.lang.Object obj7 = numberDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double3 = doubleDeserializer0.getNullValue(deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = numberDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.util.Collection<java.lang.Object> objCollection14 = objJsonDeserializer13.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer5 = byteDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte11 = byteDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Byte) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNotNull(byteJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Double double2 = doubleDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer4 = doubleDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = doubleJsonDeserializer4.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = doubleJsonDeserializer4.getDelegatee();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double2);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        boolean boolean11 = byteJsonDeserializer10.isCachable();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        boolean boolean6 = characterDeserializer0.isCachable();
        java.lang.Character char7 = characterDeserializer0.getNullValue();
        java.lang.Character char8 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType10 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short10 = shortDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Short) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Short (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        java.lang.Double double2 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer4 = doubleDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(double2);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        boolean boolean7 = bigIntegerJsonDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = bigIntegerJsonDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigInteger bigInteger10 = bigIntegerJsonDeserializer2.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(bigInteger10);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = characterDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Character) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        java.lang.Double double13 = doubleDeserializer0.getEmptyValue();
        boolean boolean14 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer16 = doubleDeserializer0.unwrappingDeserializer(nameTransformer15);
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
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer16);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        java.lang.Byte byte14 = byteDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(byte14);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = charJsonDeserializer9.getObjectIdReader();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = booleanDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection7 = booleanDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = numberDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        com.fasterxml.jackson.databind.JavaType javaType10 = doubleDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = byteDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = byteDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Float float5 = floatDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Float float7 = floatDeserializer0.getNullValue(deserializationContext6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = floatDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Byte byte9 = byteDeserializer0.getNullValue();
        boolean boolean10 = byteDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = byteDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer5 = shortDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(shortJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean7 = characterDeserializer6.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer6.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = characterDeserializer6.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer12 = characterDeserializer6.unwrappingDeserializer(nameTransformer11);
        java.lang.Character char13 = characterDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Character char15 = characterDeserializer6.getNullValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNull(char15);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Boolean boolean9 = booleanDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Boolean boolean10 = booleanDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = shortDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = shortDeserializer0.handledType();
        java.lang.Short short3 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(short3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getNullValue();
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = bigDecimalDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Long long5 = longDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = longDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        java.lang.Class<?> wildcardClass11 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.math.BigDecimal bigDecimal13 = bigDecimalDeserializer0.getNullValue(deserializationContext12);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(bigDecimal13);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigInteger bigInteger11 = bigIntegerDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer9);
        org.junit.Assert.assertNull(bigInteger11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigInteger bigInteger11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = bigIntegerDeserializer0.deserialize(jsonParser9, deserializationContext10, bigInteger11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long6 = longDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = integerDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = charJsonDeserializer7.deserialize(jsonParser8, deserializationContext9, (java.lang.Character) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = numberDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = numberDeserializer0.deserialize(jsonParser15, deserializationContext16);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        java.lang.Double double14 = doubleJsonDeserializer9.getEmptyValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer9);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer11);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer13);
        org.junit.Assert.assertNull(double14);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = integerDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = booleanJsonDeserializer7.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection9 = booleanJsonDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Boolean boolean11 = booleanJsonDeserializer7.getEmptyValue(deserializationContext10);
        java.lang.Boolean boolean12 = booleanJsonDeserializer7.getEmptyValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        java.lang.Float float7 = floatDeserializer0.getEmptyValue();
        java.lang.Float float8 = floatDeserializer0.getEmptyValue();
        java.lang.Float float9 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = floatDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
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
        org.junit.Assert.assertNull(float9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer5 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = bigDecimalDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer4.getDelegatee();
        java.lang.Character char6 = characterDeserializer4._nullValue;
        java.lang.Character char7 = characterDeserializer4.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = characterDeserializer4.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer4.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = longDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = bigIntegerDeserializer0.getValueClass();
        boolean boolean8 = bigIntegerDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigIntegerDeserializer0.getObjectIdReader();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int7 = integerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.lang.Short short6 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
        boolean boolean8 = shortDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection9 = shortDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType6 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = floatDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer8.getKnownPropertyNames();
        java.lang.Character char11 = characterDeserializer8._nullValue;
        java.lang.Character char12 = characterDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType13 = characterDeserializer8.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer11 = shortJsonDeserializer9.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer9);
        org.junit.Assert.assertNotNull(shortJsonDeserializer11);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        java.lang.Double double11 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Double double13 = doubleDeserializer0.getNullValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = doubleDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass15 = doubleDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = numberDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = numberDeserializer0.unwrappingDeserializer(nameTransformer2);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(objJsonDeserializer3);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(longJsonDeserializer4);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer9 = booleanDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass11 = characterDeserializer10.getValueClass();
        java.lang.Class<?> wildcardClass12 = characterDeserializer10.getValueClass();
        java.lang.Class<?> wildcardClass13 = characterDeserializer10.handledType();
        java.lang.Class<?> wildcardClass14 = characterDeserializer10.getValueClass();
        java.lang.Character char15 = characterDeserializer10._nullValue;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = booleanJsonDeserializer9.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(bigInteger8);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Long long7 = longDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        boolean boolean4 = longDeserializer0.isCachable();
        java.lang.Long long5 = longDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = longDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = longDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Integer int4 = integerDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean6 = integerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        java.lang.Double double11 = doubleDeserializer0.getEmptyValue();
        java.lang.Double double12 = doubleDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertNull(double12);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        org.junit.Assert.assertNotNull(numberDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer3 = byteDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean5 = characterDeserializer4.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer4.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = characterDeserializer4.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = byteJsonDeserializer3.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = booleanDeserializer0.getObjectIdReader();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = integerDeserializer0.getValueType();
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Character char2 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = characterDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = characterDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Character char11 = characterDeserializer7.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer13 = characterDeserializer7.unwrappingDeserializer(nameTransformer12);
        java.lang.Class<?> wildcardClass14 = characterDeserializer7.handledType();
        com.fasterxml.jackson.databind.JavaType javaType15 = characterDeserializer7.getValueType();
        boolean boolean16 = characterDeserializer7.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer7 = integerDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = integerDeserializer0.getObjectIdReader();
        boolean boolean9 = integerDeserializer0.isCachable();
        boolean boolean10 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int13 = integerDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(intJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = bigIntegerDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean3 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Boolean boolean5 = booleanDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = booleanJsonDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer10 = booleanJsonDeserializer7.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Short short5 = shortDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = shortDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Byte byte9 = byteDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNull(byte9);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Double double10 = doubleDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Double double12 = doubleDeserializer0.getNullValue(deserializationContext11);
        java.lang.Double double13 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType14 = doubleDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(double10);
        org.junit.Assert.assertNull(double12);
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean9 = characterDeserializer8.isCachable();
        java.lang.Character char10 = characterDeserializer8.getNullValue();
        java.lang.Character char11 = characterDeserializer8._nullValue;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Character char13 = characterDeserializer8.getEmptyValue(deserializationContext12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Boolean boolean9 = booleanDeserializer0.getNullValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = booleanDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection11 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean15 = booleanDeserializer0.deserialize(jsonParser12, deserializationContext13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        boolean boolean4 = characterDeserializer0._primitive;
        boolean boolean5 = characterDeserializer0._primitive;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = characterDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Character) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.math.BigInteger bigInteger3 = bigIntegerJsonDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerJsonDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerJsonDeserializer7.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = bigIntegerJsonDeserializer7.getObjectIdReader();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        boolean boolean4 = integerDeserializer0.isCachable();
        java.lang.Integer int5 = integerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Double double10 = doubleDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Double double12 = doubleDeserializer0.getNullValue(deserializationContext11);
        java.lang.Double double13 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer15 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType16 = characterDeserializer15.getValueType();
        java.lang.Character char17 = characterDeserializer15.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection18 = characterDeserializer15.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = characterDeserializer15.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(double10);
        org.junit.Assert.assertNull(double12);
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNotNull(characterDeserializer15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNull(objectIdReader19);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = characterDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        boolean boolean7 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = booleanDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

