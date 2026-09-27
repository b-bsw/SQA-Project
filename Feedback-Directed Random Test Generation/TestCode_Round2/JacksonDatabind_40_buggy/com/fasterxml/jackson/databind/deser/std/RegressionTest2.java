package com.fasterxml.jackson.databind.deser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Long long6 = longDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        boolean boolean6 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer8 = shortDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short12 = shortJsonDeserializer8.deserialize(jsonParser9, deserializationContext10, (java.lang.Short) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Short (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortJsonDeserializer8);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = booleanDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        com.fasterxml.jackson.databind.JavaType javaType12 = doubleDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = booleanJsonDeserializer10.deserialize(jsonParser11, deserializationContext12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
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
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        boolean boolean1 = shortDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = shortDeserializer0.getKnownPropertyNames();
        java.lang.Short short3 = shortDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.handledType();
        boolean boolean4 = doubleDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = doubleDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass4 = characterDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer3.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(double11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = numberDeserializer0.findBackReference("");
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
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue(deserializationContext2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = integerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = characterDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Character) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = numberDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = numberDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = booleanDeserializer0.handledType();
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
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte6 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte10 = byteDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Byte) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
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
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.lang.Class<?> wildcardClass10 = characterDeserializer8.getValueClass();
        boolean boolean11 = characterDeserializer8._primitive;
        java.lang.Class<?> wildcardClass12 = characterDeserializer8.handledType();
        java.lang.Class<?> wildcardClass13 = characterDeserializer8.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = byteJsonDeserializer7.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(float9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal9 = bigDecimalDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = bigIntegerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Float float8 = floatDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = floatDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(float8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = bigDecimalDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        boolean boolean4 = longDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType5 = longDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = longDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        java.lang.Long long2 = longDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = booleanDeserializer0.deserialize(jsonParser7, deserializationContext8);
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
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = byteDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = byteDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        boolean boolean7 = shortDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection8 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType10 = shortDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = shortDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer5 = byteDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = byteDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection7 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
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
        org.junit.Assert.assertNotNull(byteJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.math.BigInteger bigInteger3 = bigIntegerJsonDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerJsonDeserializer5.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerJsonDeserializer5.getNullValue(deserializationContext8);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNull(bigInteger9);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        boolean boolean4 = longDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = characterDeserializer9.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection12 = characterDeserializer9.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = characterDeserializer5.getObjectIdReader();
        boolean boolean8 = characterDeserializer5._primitive;
        java.lang.Class<?> wildcardClass9 = characterDeserializer5.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.getValueClass();
        boolean boolean6 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType7 = numberDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        java.lang.Double double4 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = doubleDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer5.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = characterDeserializer5.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = characterDeserializer5.getValueClass();
        java.lang.Character char9 = characterDeserializer5.getEmptyValue();
        java.lang.Character char10 = characterDeserializer5.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.getValueClass();
        boolean boolean6 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = numberDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double9 = doubleDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        java.lang.Double double6 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double12 = doubleDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Double) (-1.0d));
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
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = integerDeserializer0.getValueType();
        java.lang.Integer int8 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Integer int10 = integerDeserializer0.getEmptyValue(deserializationContext9);
        java.util.Collection<java.lang.Object> objCollection11 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int15 = integerDeserializer0.deserializeWithType(jsonParser12, deserializationContext13, typeDeserializer14);
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
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer7.getKnownPropertyNames();
        boolean boolean10 = characterDeserializer7._primitive;
        java.lang.Class<?> wildcardClass11 = characterDeserializer7.getValueClass();
        java.lang.Character char12 = characterDeserializer7.getEmptyValue();
        java.lang.Class<?> wildcardClass13 = characterDeserializer7.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean6 = doubleDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = doubleDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerJsonDeserializer2.getDelegatee();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNull(double7);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer3.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = characterDeserializer3.handledType();
        java.lang.Class<?> wildcardClass7 = characterDeserializer3.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = floatDeserializer0.getValueType();
        java.lang.Float float7 = floatDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = floatDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer6 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigDecimal bigDecimal8 = bigDecimalJsonDeserializer6.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = bigDecimalJsonDeserializer6.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = bigDecimalJsonDeserializer6.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer8 = booleanDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Boolean boolean9 = booleanJsonDeserializer8.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = booleanJsonDeserializer8.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Float float6 = floatDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float10 = floatDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Float) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer4.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer4.getObjectIdReader();
        boolean boolean7 = characterDeserializer4._primitive;
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer4.getValueType();
        java.lang.Class<?> wildcardClass9 = characterDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer4.unwrappingDeserializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = characterDeserializer4.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = characterDeserializer4.getDelegatee();
        java.lang.Character char14 = characterDeserializer4._nullValue;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = floatDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
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
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = booleanDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigDecimal3);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        boolean boolean4 = integerDeserializer0.isCachable();
        java.lang.Integer int5 = integerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = bigIntegerDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        boolean boolean3 = floatDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
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
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass11 = characterDeserializer10.getValueClass();
        java.lang.Class<?> wildcardClass12 = characterDeserializer10.getValueClass();
        boolean boolean13 = characterDeserializer10._primitive;
        boolean boolean14 = characterDeserializer10.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = byteDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int5 = integerDeserializer0.getEmptyValue();
        boolean boolean6 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
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
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(bigInteger4);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.handledType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = doubleDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        boolean boolean5 = floatDeserializer0.isCachable();
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
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = booleanDeserializer0.findBackReference("");
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass6 = characterDeserializer5.getValueClass();
        java.util.Collection<java.lang.Object> objCollection7 = characterDeserializer5.getKnownPropertyNames();
        java.lang.Character char8 = characterDeserializer5.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char5 = characterDeserializer0.deserialize(jsonParser2, deserializationContext3, (java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        java.util.Collection<java.lang.Object> objCollection11 = booleanDeserializer0.getKnownPropertyNames();
        boolean boolean12 = booleanDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer10 = characterDeserializer6.unwrappingDeserializer(nameTransformer9);
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer6.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(charJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer7 = byteDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Byte byte8 = byteDeserializer0.getNullValue();
        java.lang.Byte byte9 = byteDeserializer0.getNullValue();
        java.lang.Byte byte10 = byteDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNotNull(byteJsonDeserializer7);
        org.junit.Assert.assertNull(byte8);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = longDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.Class<java.lang.Integer> intClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer2 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer(intClass0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean6 = booleanDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Boolean boolean9 = booleanDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Boolean boolean11 = booleanDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Float float6 = floatDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = intJsonDeserializer6.getObjectIdReader();
        java.lang.Integer int8 = intJsonDeserializer6.getEmptyValue();
        java.lang.Integer int9 = intJsonDeserializer6.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection10 = intJsonDeserializer6.getKnownPropertyNames();
        java.lang.Integer int11 = intJsonDeserializer6.getEmptyValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = longDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = bigDecimalDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = characterDeserializer0.getNullValue(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer.instance;
        java.util.Collection<java.lang.Object> objCollection1 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer4 = byteDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteJsonDeserializer4);
        org.junit.Assert.assertNull(byte6);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.handledType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        boolean boolean7 = shortDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection8 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = shortDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer8 = longDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(longJsonDeserializer8);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        boolean boolean7 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = shortDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer9 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigDecimal bigDecimal11 = bigDecimalJsonDeserializer9.getEmptyValue(deserializationContext10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = bigDecimalJsonDeserializer9.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer9);
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass5 = characterDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass6 = characterDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer4.getValueType();
        boolean boolean8 = characterDeserializer4._primitive;
        boolean boolean9 = characterDeserializer4._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = floatDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        java.lang.Class<?> wildcardClass12 = bigDecimalDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(bigDecimal10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = integerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = doubleDeserializer0.getValueClass();
        boolean boolean10 = doubleDeserializer0.isCachable();
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
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = characterDeserializer0.getNullValue(deserializationContext11);
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
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer9);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Integer int4 = integerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = integerDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = integerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection9 = doubleDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte12 = byteDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Byte) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = byteDeserializer0.getDelegatee();
        java.lang.Byte byte7 = byteDeserializer0.getEmptyValue();
        java.lang.Byte byte8 = byteDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int2 = integerDeserializer0.getEmptyValue();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer7 = integerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(intJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float8 = floatDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer8 = doubleDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = doubleDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        boolean boolean7 = shortDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection8 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType10 = shortDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection11 = shortDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Short short3 = shortDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer5 = shortDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.lang.Class<java.lang.Short> shortClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer2 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer(shortClass0, (java.lang.Short) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = numberDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Boolean boolean11 = booleanDeserializer9.getEmptyValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = booleanDeserializer9.getValueClass();
        boolean boolean13 = booleanDeserializer9.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = booleanDeserializer9.getDelegatee();
        java.lang.Class<?> wildcardClass15 = booleanDeserializer9.handledType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = numberDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Class (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(booleanDeserializer9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = numberDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean5 = characterDeserializer4.isCachable();
        java.lang.Class<?> wildcardClass6 = characterDeserializer4.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = numberDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = numberDeserializer0.deserialize(jsonParser10, deserializationContext11);
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
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = charJsonDeserializer5.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = charJsonDeserializer5.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass11 = characterDeserializer10.getValueClass();
        java.util.Collection<java.lang.Object> objCollection12 = characterDeserializer10.getKnownPropertyNames();
        java.lang.Character char13 = characterDeserializer10._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer15 = characterDeserializer10.unwrappingDeserializer(nameTransformer14);
        java.lang.Character char16 = characterDeserializer10.getEmptyValue();
        java.lang.Class<?> wildcardClass17 = characterDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Character char19 = characterDeserializer10.getEmptyValue(deserializationContext18);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = charJsonDeserializer5.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = longDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = byteDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = byteDeserializer0.findBackReference("hi!");
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal9 = bigDecimalDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Short short5 = shortDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean7 = characterDeserializer6.isCachable();
        java.lang.Class<?> wildcardClass8 = characterDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Character char10 = characterDeserializer6.getNullValue(deserializationContext9);
        boolean boolean11 = characterDeserializer6._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer2 = byteDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte7 = byteDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Byte) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(byteJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        java.math.BigInteger bigInteger7 = bigIntegerJsonDeserializer2.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = bigIntegerJsonDeserializer2.deserialize(jsonParser8, deserializationContext9, bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(bigInteger7);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = bigDecimalDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = longDeserializer0.handledType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        java.lang.Double double4 = doubleDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue(deserializationContext6);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(double7);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = numberDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = numberDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = numberDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = numberDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = numberDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = integerDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Short short5 = shortDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        java.lang.Class<?> wildcardClass8 = characterDeserializer6.getValueClass();
        java.lang.Character char9 = characterDeserializer6._nullValue;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = characterDeserializer6.getObjectIdReader();
        java.lang.Character char11 = characterDeserializer6.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = shortDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Character char9 = characterDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Float float6 = floatDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = integerDeserializer0.getValueType();
        java.lang.Integer int8 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Integer int10 = integerDeserializer0.getEmptyValue(deserializationContext9);
        java.util.Collection<java.lang.Object> objCollection11 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass12 = integerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer6 = byteDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = byteDeserializer0.findBackReference("");
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
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getClass();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Long long5 = longDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer7.getKnownPropertyNames();
        boolean boolean10 = characterDeserializer7._primitive;
        boolean boolean11 = characterDeserializer7._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = longDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long6 = longDeserializer0.getNullValue(deserializationContext5);
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.handledType();
        boolean boolean8 = characterDeserializer0._primitive;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Short short5 = shortDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        boolean boolean1 = shortDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = shortDeserializer0.getKnownPropertyNames();
        boolean boolean3 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = shortDeserializer0.replaceDelegatee(charJsonDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
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
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Short short8 = shortDeserializer0.getNullValue();
        java.lang.Short short9 = shortDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = shortDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        boolean boolean6 = doubleDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = doubleDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        java.lang.Character char5 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Float float12 = floatDeserializer0.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(float10);
        org.junit.Assert.assertNull(float12);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.math.BigInteger bigInteger3 = bigIntegerJsonDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerJsonDeserializer2.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerJsonDeserializer5.unwrappingDeserializer(nameTransformer6);
        java.math.BigInteger bigInteger8 = bigIntegerJsonDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = bigIntegerJsonDeserializer5.getDelegatee();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer4 = booleanDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = booleanDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer4);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection4 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        java.lang.Class<?> wildcardClass8 = characterDeserializer6.getValueClass();
        java.lang.Character char9 = characterDeserializer6._nullValue;
        java.lang.Class<?> wildcardClass10 = characterDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer12 = characterDeserializer6.unwrappingDeserializer(nameTransformer11);
        java.lang.Character char13 = characterDeserializer6.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = byteDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(charJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer3 = longDeserializer0.unwrappingDeserializer(nameTransformer2);
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
        org.junit.Assert.assertNotNull(longJsonDeserializer3);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(short4);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = doubleDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = doubleDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = longDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = longDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer.instance;
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        boolean boolean7 = bigIntegerJsonDeserializer2.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = bigIntegerJsonDeserializer2.getObjectIdReader();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigDecimal bigDecimal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = bigDecimalDeserializer0.deserialize(jsonParser7, deserializationContext8, bigDecimal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerJsonDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = bigIntegerJsonDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigIntegerJsonDeserializer2.getObjectIdReader();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = booleanDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte6 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = byteDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer10 = byteDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Byte byte12 = byteDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
        org.junit.Assert.assertNull(byte12);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
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
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean3 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Boolean boolean5 = booleanDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = booleanDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Byte byte10 = byteJsonDeserializer8.getEmptyValue(deserializationContext9);
        java.lang.Byte byte11 = byteJsonDeserializer8.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte15 = byteJsonDeserializer8.deserialize(jsonParser12, deserializationContext13, (java.lang.Byte) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNull(byte11);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
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
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = byteDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = doubleDeserializer0.getValueType();
        boolean boolean7 = doubleDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double11 = doubleDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Double) 1.0d);
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
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Object obj3 = numberDeserializer0.getNullValue();
        boolean boolean4 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = numberDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = numberDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = numberDeserializer0.getNullValue(deserializationContext8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer8.getKnownPropertyNames();
        java.lang.Character char11 = characterDeserializer8._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer13 = characterDeserializer8.unwrappingDeserializer(nameTransformer12);
        java.lang.Character char14 = characterDeserializer8.getEmptyValue();
        java.lang.Class<?> wildcardClass15 = characterDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Character char17 = characterDeserializer8.getEmptyValue(deserializationContext16);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = characterDeserializer8.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(objectIdReader18);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = bigDecimalDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = booleanDeserializer0.getKnownPropertyNames();
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer1 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer1.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = characterDeserializer1.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(characterDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer8 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer10 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer8);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer10);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer0.unwrappingDeserializer(nameTransformer7);
        boolean boolean9 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = characterDeserializer0.getNullValue(deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.getValueClass();
        boolean boolean6 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = numberDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short8 = shortDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = byteDeserializer0.getKnownPropertyNames();
        boolean boolean7 = byteDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        boolean boolean4 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = charJsonDeserializer6.deserialize(jsonParser7, deserializationContext8, (java.lang.Character) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Float float6 = floatDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Float float9 = floatDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Float float11 = floatDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(float9);
        org.junit.Assert.assertNull(float11);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        boolean boolean5 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = booleanDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = booleanDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.getValueClass();
        boolean boolean6 = numberDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = numberDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objJsonDeserializer8.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        boolean boolean2 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float6 = floatDeserializer0.deserialize(jsonParser3, deserializationContext4, (java.lang.Float) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.math.BigDecimal bigDecimal9 = bigDecimalDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection2 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass4 = characterDeserializer3.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer3.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = characterDeserializer3.getValueClass();
        java.lang.Character char9 = characterDeserializer3.getNullValue();
        java.lang.Class<?> wildcardClass10 = characterDeserializer3.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getEmptyValue(deserializationContext7);
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = doubleDeserializer0.getValueClass();
        boolean boolean10 = doubleDeserializer0.isCachable();
        boolean boolean11 = doubleDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = floatDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerJsonDeserializer2.getNullValue(deserializationContext6);
        java.math.BigInteger bigInteger8 = bigIntegerJsonDeserializer2.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = bigIntegerJsonDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertNull(bigInteger8);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short4 = shortDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue(deserializationContext2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = characterDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean4 = doubleDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = doubleDeserializer0.getClass();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double4 = doubleDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = floatDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Float float5 = floatDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float5);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer4 = byteDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = byteDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte9 = byteDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Byte) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        boolean boolean3 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = shortDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = bigDecimalDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = booleanDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Character char6 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = characterDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass11 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = byteDeserializer0.getDelegatee();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Character char6 = characterDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = characterDeserializer7.getDelegatee();
        java.lang.Character char9 = characterDeserializer7._nullValue;
        java.lang.Character char10 = characterDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = characterDeserializer7.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection12 = characterDeserializer7.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        boolean boolean2 = characterDeserializer0._primitive;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = characterDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer9 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = bigDecimalDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer9 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigDecimal bigDecimal11 = bigDecimalDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer12 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass13 = characterDeserializer12.getValueClass();
        java.lang.Class<?> wildcardClass14 = characterDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType15 = characterDeserializer12.getValueType();
        java.lang.Class<?> wildcardClass16 = characterDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer18 = characterDeserializer12.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer20 = characterDeserializer12.unwrappingDeserializer(nameTransformer19);
        java.lang.Character char21 = charJsonDeserializer20.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = bigDecimalDeserializer0.replaceDelegatee(charJsonDeserializer20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer9);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNotNull(characterDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(charJsonDeserializer18);
        org.junit.Assert.assertNotNull(charJsonDeserializer20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = characterDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = characterDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.deserialize(jsonParser4, deserializationContext5, bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigInteger3);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Integer int8 = integerDeserializer0.getEmptyValue(deserializationContext7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = integerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Float float5 = floatDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float9 = floatDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Float) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(float5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Float float5 = floatDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer6.getKnownPropertyNames();
        java.lang.Character char9 = characterDeserializer6._nullValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer11 = characterDeserializer6.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = charJsonDeserializer11.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = floatDeserializer0.replaceDelegatee(charJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = integerDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean8 = integerDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        boolean boolean2 = byteDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte6 = byteDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = byteDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer10 = byteDeserializer0.unwrappingDeserializer(nameTransformer9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = byteJsonDeserializer10.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(byteJsonDeserializer10);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.lang.Class<?> wildcardClass11 = booleanDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = shortDeserializer5.getDelegatee();
        boolean boolean7 = shortDeserializer5.isCachable();
        java.lang.Class<?> wildcardClass8 = shortDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Short short10 = shortDeserializer5.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = shortDeserializer5.getValueClass();
        java.lang.Class<?> wildcardClass12 = shortDeserializer5.handledType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = numberDeserializer0.deserialize(jsonParser3, deserializationContext4, (java.lang.Object) shortDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(shortDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer5 = integerDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = integerDeserializer0.handledType();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        java.lang.Character char1 = characterDeserializer0.getNullValue();
        boolean boolean2 = characterDeserializer0._primitive;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = characterDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Long long2 = longDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = longDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = longDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = shortDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass3 = characterDeserializer2.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer2.getValueType();
        java.lang.Class<?> wildcardClass6 = characterDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer2.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer10 = characterDeserializer2.unwrappingDeserializer(nameTransformer9);
        java.lang.Character char11 = charJsonDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = charJsonDeserializer10.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = doubleDeserializer0.replaceDelegatee(charJsonDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(characterDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
        org.junit.Assert.assertNotNull(charJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = floatDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        java.lang.Float float7 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = floatDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = floatDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = booleanDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        java.lang.Integer int6 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = integerDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.Boolean boolean14 = booleanDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = floatDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType8 = floatDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean6 = doubleDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = intJsonDeserializer6.getObjectIdReader();
        java.lang.Integer int8 = intJsonDeserializer6.getEmptyValue();
        java.lang.Integer int9 = intJsonDeserializer6.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection10 = intJsonDeserializer6.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection11 = intJsonDeserializer6.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = numberDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer7 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass8 = characterDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass9 = characterDeserializer7.getValueClass();
        java.lang.Character char10 = characterDeserializer7._nullValue;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = numberDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(characterDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = booleanDeserializer0.getValueType();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection5 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = booleanDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        boolean boolean4 = characterDeserializer0._primitive;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = characterDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Character) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = byteJsonDeserializer12.getDelegatee();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer2 = byteDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = byteDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = byteDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(byteJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = doubleDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Character char5 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = integerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        java.lang.Long long2 = longDeserializer0.getNullValue();
        boolean boolean3 = longDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = characterDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        java.lang.Character char9 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        boolean boolean10 = bigDecimalDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Long long2 = longDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Long long3 = longDeserializer0.getNullValue();
        java.lang.Long long4 = longDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType2 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long6 = longDeserializer0.getNullValue(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Long long3 = longDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = longDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer5 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.JavaType javaType6 = bigDecimalDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer9);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = floatDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(float4);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Character char5 = characterDeserializer0.getNullValue();
        boolean boolean6 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.deserialize(jsonParser4, deserializationContext5, bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = doubleDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = bigDecimalDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = shortDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(short4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.handledType();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = longDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Long long6 = longDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer8 = longDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = longDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = floatDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = shortDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Boolean boolean11 = booleanDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        boolean boolean5 = floatDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = floatDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float10 = floatDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Float) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        java.lang.Class<?> wildcardClass12 = byteDeserializer0.getValueClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection2 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = integerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = javaType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        java.lang.Double double4 = doubleDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = doubleDeserializer0.handledType();
        java.lang.Double double6 = doubleDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(double6);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        com.fasterxml.jackson.databind.JavaType javaType13 = numberDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.lang.Object obj11 = objJsonDeserializer6.getEmptyValue(deserializationContext10);
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
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = characterDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Character) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
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
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection7 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = booleanDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection9 = booleanDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = numberDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer2 = doubleDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double6 = doubleDeserializer0.deserialize(jsonParser3, deserializationContext4, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer2);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        java.lang.Float float3 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Float float6 = floatDeserializer0.getEmptyValue(deserializationContext5);
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
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(float6);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getNullValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = bigDecimalDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection10 = bigDecimalDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = bigDecimalDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = floatDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = floatDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection8 = bigDecimalDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Character char2 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        boolean boolean7 = bigIntegerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        boolean boolean3 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigDecimal bigDecimal8 = bigDecimalDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = bigDecimalDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.math.BigInteger bigInteger8 = bigIntegerJsonDeserializer7.getNullValue();
        boolean boolean9 = bigIntegerJsonDeserializer7.isCachable();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = integerDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = integerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = bigDecimalDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = shortDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = shortDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer5 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean6 = characterDeserializer5.isCachable();
        java.lang.Character char7 = characterDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = characterDeserializer5.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(characterDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = doubleJsonDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer6 = doubleJsonDeserializer3.unwrappingDeserializer(nameTransformer5);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer6);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
        boolean boolean5 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        java.lang.Class<?> wildcardClass8 = characterDeserializer6.getValueClass();
        java.lang.Character char9 = characterDeserializer6._nullValue;
        java.lang.Class<?> wildcardClass10 = characterDeserializer6.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = byteDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNull(byte12);
        org.junit.Assert.assertNull(byte13);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Character char6 = characterDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Character char7 = characterDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Character char4 = characterDeserializer0._nullValue;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer2 = byteDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = byteDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(byteJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer12 = shortJsonDeserializer10.unwrappingDeserializer(nameTransformer11);
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean8 = booleanDeserializer0.getNullValue();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(charJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long4 = longDeserializer0.getNullValue(deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass7 = characterDeserializer6.getValueClass();
        java.util.Collection<java.lang.Object> objCollection8 = characterDeserializer6.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection9 = characterDeserializer6.getKnownPropertyNames();
        java.lang.Character char10 = characterDeserializer6.getNullValue();
        boolean boolean11 = characterDeserializer6.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Long long2 = longDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = longDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = longDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = doubleDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = doubleDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = floatDeserializer0.handledType();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = floatJsonDeserializer2.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection4 = floatJsonDeserializer2.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        java.lang.Object obj12 = numberDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = doubleDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = doubleDeserializer0.findBackReference("");
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getNullValue(deserializationContext2);
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = bigDecimalDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer4 = characterDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Character char6 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = characterDeserializer0.handledType();
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
        org.junit.Assert.assertNotNull(charJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = bigIntegerDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        java.lang.Object obj7 = numberDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = numberDeserializer0.findBackReference("");
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
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Boolean boolean3 = booleanDeserializer0.getNullValue(deserializationContext2);
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = integerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer11 = integerDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(intJsonDeserializer11);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        java.lang.Long long3 = longDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        boolean boolean5 = longDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer7 = longDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer9 = longDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer11 = longJsonDeserializer9.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longJsonDeserializer7);
        org.junit.Assert.assertNotNull(longJsonDeserializer9);
        org.junit.Assert.assertNotNull(longJsonDeserializer11);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.handledType();
        java.lang.Float float4 = floatDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = floatDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float8 = floatDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Double double8 = doubleDeserializer0.getNullValue(deserializationContext7);
        java.lang.Double double9 = doubleDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNull(double8);
        org.junit.Assert.assertNull(double9);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short8 = shortDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        boolean boolean2 = bigDecimalDeserializer0.isCachable();
        boolean boolean3 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer9 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.math.BigDecimal bigDecimal10 = bigDecimalJsonDeserializer9.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer9);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = booleanDeserializer0.findBackReference("hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte7 = byteDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        java.lang.Integer int5 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = integerDeserializer0.handledType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = bigIntegerDeserializer0.getObjectIdReader();
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(bigInteger3);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = longJsonDeserializer3.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer does not support them");
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = bigIntegerDeserializer0.getValueType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer5 = longDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = longDeserializer0.handledType();
        java.lang.Long long7 = longDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = longDeserializer0.handledType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(longJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        boolean boolean6 = doubleDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = doubleDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection8 = doubleDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = characterDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.util.Collection<java.lang.Object> objCollection10 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        java.lang.Integer int4 = integerDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass5 = integerDeserializer0.handledType();
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = integerDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = longDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Long long6 = longDeserializer0.getEmptyValue(deserializationContext5);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Boolean boolean4 = booleanDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        java.lang.Boolean boolean6 = booleanDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer0.unwrappingDeserializer(nameTransformer7);
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer7 = shortDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer8.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer8.getKnownPropertyNames();
        java.lang.Character char12 = characterDeserializer8.getNullValue();
        boolean boolean13 = characterDeserializer8.isCachable();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        java.lang.Double double3 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = numberDeserializer0.getEmptyValue(deserializationContext14);
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
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        java.lang.Byte byte5 = byteDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Boolean boolean12 = booleanDeserializer0.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Character char4 = characterDeserializer0._nullValue;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        boolean boolean6 = characterDeserializer0._primitive;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        boolean boolean4 = integerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = byteDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection11 = byteDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = integerDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer4.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = characterDeserializer4.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = characterDeserializer4.getValueClass();
        java.lang.Character char8 = characterDeserializer4.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = integerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(byte9);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = bigIntegerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = intJsonDeserializer6.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = floatDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        boolean boolean3 = shortDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Short> shortJsonDeserializer5 = shortDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortJsonDeserializer5.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short11 = shortJsonDeserializer5.deserialize(jsonParser8, deserializationContext9, (java.lang.Short) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Short (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass3 = characterDeserializer2.getValueClass();
        java.lang.Class<?> wildcardClass4 = characterDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer2.getValueType();
        java.lang.Class<?> wildcardClass6 = characterDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer2.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer10 = characterDeserializer2.unwrappingDeserializer(nameTransformer9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(characterDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
        org.junit.Assert.assertNotNull(charJsonDeserializer10);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = longDeserializer0.getValueType();
        java.lang.Long long2 = longDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = longDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = longDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = numberDeserializer0.getDelegatee();
        java.lang.Object obj4 = numberDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = numberDeserializer0.getKnownPropertyNames();
        java.lang.Object obj6 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer9 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection10 = bigDecimalDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = bigDecimalDeserializer9.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.math.BigDecimal bigDecimal13 = bigDecimalDeserializer9.getEmptyValue(deserializationContext12);
        java.math.BigDecimal bigDecimal14 = bigDecimalDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.math.BigDecimal bigDecimal16 = bigDecimalDeserializer9.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer18 = bigDecimalDeserializer9.unwrappingDeserializer(nameTransformer17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = numberDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Object) bigDecimalDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(bigDecimal13);
        org.junit.Assert.assertNull(bigDecimal14);
        org.junit.Assert.assertNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer18);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = floatDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = floatDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Object obj2 = numberDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = numberDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigDecimalDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer4.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer4.getObjectIdReader();
        boolean boolean7 = characterDeserializer4._primitive;
        com.fasterxml.jackson.databind.JavaType javaType8 = characterDeserializer4.getValueType();
        java.lang.Class<?> wildcardClass9 = characterDeserializer4.getValueClass();
        java.lang.Character char10 = characterDeserializer4._nullValue;
        java.lang.Character char11 = characterDeserializer4.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = bigDecimalDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        boolean boolean3 = bigIntegerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.handledType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer4 = floatDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection6 = floatDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Float float8 = floatDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNotNull(floatJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(float8);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = bigDecimalDeserializer0.getDelegatee();
        java.math.BigDecimal bigDecimal3 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = bigDecimalDeserializer0.getValueType();
        java.math.BigDecimal bigDecimal5 = bigDecimalDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigDecimalDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(bigDecimal3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = byteDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer6 = byteDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = byteDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = byteDeserializer0.handledType();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = shortDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = shortDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = numberDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Byte byte10 = byteJsonDeserializer8.getEmptyValue(deserializationContext9);
        java.lang.Byte byte11 = byteJsonDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Byte byte13 = byteJsonDeserializer8.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte17 = byteJsonDeserializer8.deserialize(jsonParser14, deserializationContext15, (java.lang.Byte) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Byte (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNull(byte10);
        org.junit.Assert.assertNull(byte11);
        org.junit.Assert.assertNull(byte13);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = shortDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = bigIntegerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = characterDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = numberDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        boolean boolean5 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = booleanJsonDeserializer7.getObjectIdReader();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        boolean boolean6 = floatDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = shortJsonDeserializer10.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(shortJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(shortJsonDeserializer10);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = intJsonDeserializer6.getObjectIdReader();
        java.lang.Integer int8 = intJsonDeserializer6.getEmptyValue();
        java.lang.Integer int9 = intJsonDeserializer6.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection10 = intJsonDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = intJsonDeserializer6.deserialize(jsonParser11, deserializationContext12, (java.lang.Integer) 1);
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
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer3.getObjectIdReader();
        boolean boolean6 = characterDeserializer3._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Character char8 = characterDeserializer3.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = characterDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = characterDeserializer3.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection11 = characterDeserializer3.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass12 = characterDeserializer3.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = booleanDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(characterDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = bigIntegerDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(bigInteger5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(bigInteger8);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer2 = doubleDeserializer0.unwrappingDeserializer(nameTransformer1);
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
        org.junit.Assert.assertNotNull(doubleJsonDeserializer2);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = booleanDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = numberDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = wildcardJsonDeserializer11.getEmptyValue(deserializationContext12);
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
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = numberDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = characterDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = characterDeserializer0.handledType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = doubleDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer6 = longDeserializer0.unwrappingDeserializer(nameTransformer5);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(longJsonDeserializer6);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = longDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = bigIntegerJsonDeserializer7.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.math.BigInteger bigInteger11 = bigIntegerJsonDeserializer7.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNull(bigInteger9);
        org.junit.Assert.assertNull(bigInteger11);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = objJsonDeserializer7.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
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
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer3 = byteDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Byte byte5 = byteDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Byte byte7 = byteDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = byteDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte5);
        org.junit.Assert.assertNull(byte7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        java.lang.Character char3 = characterDeserializer0._nullValue;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = characterDeserializer0._primitive;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer3 = byteDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Byte byte4 = byteJsonDeserializer3.getEmptyValue();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(byteJsonDeserializer3);
        org.junit.Assert.assertNull(byte4);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = bigIntegerDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = bigIntegerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass7 = integerDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int11 = integerDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.primitiveInstance;
        java.lang.Byte byte1 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass2 = byteDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = byteDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = shortDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Short short4 = shortDeserializer0.getNullValue();
        java.lang.Short short5 = shortDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = numberDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer does not support them");
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
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer4 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = bigIntegerJsonDeserializer4.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = integerDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Integer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer10 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass11 = characterDeserializer10.getValueClass();
        java.lang.Class<?> wildcardClass12 = characterDeserializer10.getValueClass();
        java.lang.Character char13 = characterDeserializer10._nullValue;
        java.lang.Class<?> wildcardClass14 = characterDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer16 = characterDeserializer10.unwrappingDeserializer(nameTransformer15);
        boolean boolean17 = characterDeserializer10.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = booleanJsonDeserializer7.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(characterDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(charJsonDeserializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char3 = characterDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = characterDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = bigDecimalDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(bigDecimal10);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = integerDeserializer0.getValueType();
        java.lang.Integer int8 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Integer int10 = integerDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Integer int12 = integerDeserializer0.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Integer int7 = integerDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = integerDeserializer0.getValueType();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigInteger bigInteger6 = bigIntegerDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = bigIntegerDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.handledType();
        boolean boolean9 = bigIntegerDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(bigInteger6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = booleanDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = booleanDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = booleanDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Boolean boolean7 = booleanDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.Class<?> wildcardClass10 = byteDeserializer0.getValueClass();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(byte9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Double double4 = doubleDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer8 = doubleDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer9 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass10 = characterDeserializer9.getValueClass();
        java.lang.Class<?> wildcardClass11 = characterDeserializer9.getValueClass();
        java.lang.Character char12 = characterDeserializer9._nullValue;
        java.lang.Class<?> wildcardClass13 = characterDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer15 = characterDeserializer9.unwrappingDeserializer(nameTransformer14);
        java.lang.Character char16 = characterDeserializer9.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = doubleJsonDeserializer8.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(double4);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer8);
        org.junit.Assert.assertNotNull(characterDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(charJsonDeserializer15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = longDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Long long7 = longDeserializer0.getEmptyValue(deserializationContext6);
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = integerDeserializer0.getValueType();
        java.lang.Integer int8 = integerDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = integerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer3 = longDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long5 = longDeserializer0.getNullValue(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(longJsonDeserializer3);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Integer int3 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean5 = characterDeserializer4.isCachable();
        java.lang.Class<?> wildcardClass6 = characterDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Character char8 = characterDeserializer4.getNullValue(deserializationContext7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(characterDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Integer int5 = integerDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = integerDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.getValueClass();
        boolean boolean7 = characterDeserializer0.isCachable();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Character char2 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = bigIntegerDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = bigIntegerDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = bigIntegerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.math.BigInteger bigInteger9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = bigIntegerDeserializer0.deserialize(jsonParser7, deserializationContext8, bigInteger9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double17 = doubleDeserializer0.deserializeWithType(jsonParser14, deserializationContext15, typeDeserializer16);
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
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertNull(double13);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = longDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection4 = longDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = longDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer8 = characterDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = characterDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Character) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(charJsonDeserializer8);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer8 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.math.BigDecimal bigDecimal9 = bigDecimalJsonDeserializer8.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer8);
        org.junit.Assert.assertNull(bigDecimal9);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer11 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer11.getDelegatee();
        java.lang.Character char13 = characterDeserializer11._nullValue;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = floatDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(float10);
        org.junit.Assert.assertNotNull(characterDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer9 = booleanDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer9);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType2 = bigDecimalDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigDecimal bigDecimal4 = bigDecimalDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = bigDecimalDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = bigDecimalDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = bigDecimalDeserializer0.getValueClass();
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        java.lang.Float float6 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = floatDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(float6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        java.util.Collection<java.lang.Object> objCollection15 = numberDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(objCollection15);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = bigIntegerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer5 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer7 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = bigIntegerDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer5);
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = booleanDeserializer0.getObjectIdReader();
        boolean boolean7 = booleanDeserializer0.isCachable();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer7 = doubleDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double11 = doubleDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer7);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = characterDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char6 = characterDeserializer0.deserialize(jsonParser3, deserializationContext4, (java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Object obj5 = numberDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = numberDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = numberDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        boolean boolean2 = characterDeserializer0._primitive;
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigDecimal> bigDecimalJsonDeserializer3 = bigDecimalDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = bigDecimalDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.math.BigDecimal bigDecimal6 = bigDecimalDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(bigDecimalJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(bigDecimal6);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = doubleDeserializer0.getValueType();
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = doubleDeserializer0.handledType();
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Byte byte1 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = byteDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(byte1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = floatDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = floatDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = floatDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        boolean boolean4 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = characterDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = characterDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        java.util.Collection<java.lang.Object> objCollection1 = longDeserializer0.getKnownPropertyNames();
        java.lang.Long long2 = longDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long> longJsonDeserializer4 = longDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = longDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNotNull(longJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.handledType();
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer3 = characterDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Character char7 = characterDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer longDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = longDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass2 = longDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = longDeserializer0.getObjectIdReader();
        java.lang.Long long4 = longDeserializer0.getEmptyValue();
        boolean boolean5 = longDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = longDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = longDeserializer0.handledType();
        org.junit.Assert.assertNotNull(longDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass3 = characterDeserializer2.getValueClass();
        java.util.Collection<java.lang.Object> objCollection4 = characterDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer6 = characterDeserializer2.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = characterDeserializer2.getValueClass();
        java.lang.Character char8 = characterDeserializer2.getNullValue();
        java.lang.Class<?> wildcardClass9 = characterDeserializer2.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = bigIntegerDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(characterDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(charJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double4 = doubleDeserializer0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = characterDeserializer0.getObjectIdReader();
        boolean boolean3 = characterDeserializer0._primitive;
        com.fasterxml.jackson.databind.JavaType javaType4 = characterDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer7 = characterDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass9 = characterDeserializer8.getValueClass();
        java.lang.Class<?> wildcardClass10 = characterDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType11 = characterDeserializer8.getValueType();
        java.lang.Class<?> wildcardClass12 = characterDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer14 = characterDeserializer8.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer16 = characterDeserializer8.unwrappingDeserializer(nameTransformer15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = charJsonDeserializer7.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
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
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(charJsonDeserializer14);
        org.junit.Assert.assertNotNull(charJsonDeserializer16);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        boolean boolean6 = byteDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = bigIntegerDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Short short3 = shortDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = shortDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = bigIntegerJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = bigIntegerJsonDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = bigIntegerJsonDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.math.BigInteger bigInteger7 = bigIntegerJsonDeserializer2.getEmptyValue(deserializationContext6);
        boolean boolean8 = bigIntegerJsonDeserializer2.isCachable();
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(bigInteger7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean4 = booleanDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = booleanDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = integerDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = integerDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = numberDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        boolean boolean4 = characterDeserializer0._primitive;
        java.lang.Character char5 = characterDeserializer0.getEmptyValue();
        java.lang.Character char6 = characterDeserializer0._nullValue;
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = booleanDeserializer0.getDelegatee();
        boolean boolean6 = booleanDeserializer0.isCachable();
        java.lang.Boolean boolean7 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = booleanDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = booleanDeserializer0.deserialize(jsonParser10, deserializationContext11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Boolean (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer)");
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
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = doubleDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double11 = doubleDeserializer0.deserialize(jsonParser8, deserializationContext9, (java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNull(double7);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = bigIntegerDeserializer0.getDelegatee();
        java.math.BigInteger bigInteger2 = bigIntegerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = bigIntegerDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = bigIntegerDeserializer0.handledType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(bigInteger2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = integerDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = integerDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = shortDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger> bigIntegerJsonDeserializer2 = bigIntegerDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.math.BigInteger bigInteger4 = bigIntegerDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = bigIntegerDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = bigIntegerDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigIntegerJsonDeserializer2);
        org.junit.Assert.assertNull(bigInteger4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        java.lang.Double double1 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = doubleDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = doubleDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer5 = doubleDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer7 = doubleJsonDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Double double9 = doubleJsonDeserializer5.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(double1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer5);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer7);
        org.junit.Assert.assertNull(double9);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.wrapperInstance;
        boolean boolean1 = characterDeserializer0.isCachable();
        java.lang.Character char2 = characterDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = characterDeserializer0.getValueClass();
        java.lang.Character char4 = characterDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(char4);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Float float4 = floatDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Float float5 = floatDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = floatDeserializer0.getValueType();
        java.lang.Float float7 = floatDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = floatDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = floatDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(float4);
        org.junit.Assert.assertNull(float5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(float7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int3 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = integerDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = integerDeserializer0.getObjectIdReader();
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        boolean boolean10 = shortDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Float> floatJsonDeserializer2 = floatDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = floatJsonDeserializer2.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = floatJsonDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNotNull(floatJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection8 = booleanDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = characterDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Character (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        java.lang.Character char4 = characterDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = characterDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        com.fasterxml.jackson.databind.JavaType javaType11 = numberDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Boolean boolean2 = booleanDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = booleanDeserializer0.getValueClass();
        boolean boolean4 = booleanDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = booleanDeserializer0.handledType();
        java.lang.Boolean boolean6 = booleanDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = booleanDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer9 = booleanDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer9);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = byteDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Byte byte6 = byteDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Byte> byteJsonDeserializer8 = byteDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = byteJsonDeserializer8.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(byte6);
        org.junit.Assert.assertNotNull(byteJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer numberDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer();
        java.lang.Class<?> wildcardClass1 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = numberDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = numberDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = numberDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = numberDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType6 = numberDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = numberDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = numberDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = wildcardJsonDeserializer8.getObjectIdReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        boolean boolean2 = shortDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = shortDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = shortDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = shortDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Short short7 = shortDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = shortDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass9 = shortDeserializer0.handledType();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = integerDeserializer0.getKnownPropertyNames();
        boolean boolean2 = integerDeserializer0.isCachable();
        boolean boolean3 = integerDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = integerDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> intJsonDeserializer6 = integerDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = integerDeserializer0.getValueType();
        java.lang.Integer int8 = integerDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = integerDeserializer0.replaceDelegatee(charJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(integerDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(intJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer floatDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Float float2 = floatDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = floatDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = floatDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = floatDeserializer0.getDelegatee();
        boolean boolean6 = floatDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float10 = floatDeserializer0.deserialize(jsonParser7, deserializationContext8, (java.lang.Float) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Float (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatDeserializer0);
        org.junit.Assert.assertNull(float2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = doubleDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = doubleDeserializer0.handledType();
        java.lang.Double double5 = doubleDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double9 = doubleDeserializer0.deserialize(jsonParser6, deserializationContext7, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Double (by deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Double double6 = doubleDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Double double7 = doubleDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer8 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType9 = characterDeserializer8.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = characterDeserializer8.getKnownPropertyNames();
        java.lang.Character char11 = characterDeserializer8._nullValue;
        java.lang.Character char12 = characterDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Character char14 = characterDeserializer8.getEmptyValue(deserializationContext13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = doubleDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer8);
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
        org.junit.Assert.assertNotNull(characterDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = shortDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = shortDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(shortDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = shortDeserializer0.getValueClass();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        java.lang.Short short3 = shortDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(short2);
        org.junit.Assert.assertNull(short3);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer shortDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = shortDeserializer0.getDelegatee();
        java.lang.Short short2 = shortDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Short short4 = shortDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = shortDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Short short8 = shortDeserializer0.getEmptyValue(deserializationContext7);
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
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = byteDeserializer0.getValueClass();
        java.lang.Byte byte2 = byteDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Byte byte4 = byteDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = byteDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = byteDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Byte byte8 = byteDeserializer0.getEmptyValue(deserializationContext7);
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(byte2);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(byte8);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType1 = characterDeserializer0.getValueType();
        java.lang.Character char2 = characterDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection3 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.handledType();
        boolean boolean7 = characterDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer booleanDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = booleanDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = booleanDeserializer0.getValueClass();
        java.lang.Boolean boolean3 = booleanDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Boolean boolean5 = booleanDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Boolean> booleanJsonDeserializer7 = booleanDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Boolean boolean8 = booleanJsonDeserializer7.getEmptyValue();
        org.junit.Assert.assertNotNull(booleanDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(booleanJsonDeserializer7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer byteDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer.wrapperInstance;
        java.util.Collection<java.lang.Object> objCollection1 = byteDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Byte byte3 = byteDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Byte byte4 = byteDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = byteDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte8 = byteDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(byte3);
        org.junit.Assert.assertNull(byte4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = bigDecimalDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = bigDecimalDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection2 = characterDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = characterDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character> charJsonDeserializer5 = characterDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        com.fasterxml.jackson.databind.JavaType javaType7 = characterDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = characterDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = characterDeserializer6.handledType();
        java.lang.Class<?> wildcardClass10 = characterDeserializer6.getValueClass();
        java.lang.Class<?> wildcardClass11 = characterDeserializer6.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = characterDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Character>) characterDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(charJsonDeserializer5);
        org.junit.Assert.assertNotNull(characterDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer();
        java.lang.Class<?> wildcardClass1 = bigDecimalDeserializer0.getValueClass();
        java.math.BigDecimal bigDecimal2 = bigDecimalDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = bigDecimalDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigDecimal2);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer integerDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer.wrapperInstance;
        java.lang.Class<?> wildcardClass1 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = integerDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = integerDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = integerDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Integer int6 = integerDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Integer int7 = integerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int11 = integerDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
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
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer doubleDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer.wrapperInstance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = doubleDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Double> doubleJsonDeserializer3 = doubleDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = doubleDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = doubleDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = doubleDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objCollection6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(doubleJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer characterDeserializer0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer.primitiveInstance;
        java.lang.Class<?> wildcardClass1 = characterDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Character char3 = characterDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = characterDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = characterDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = characterDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(characterDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer();
        java.lang.Class<?> wildcardClass1 = bigIntegerDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.math.BigInteger bigInteger3 = bigIntegerDeserializer0.getNullValue(deserializationContext2);
        java.lang.Class<?> wildcardClass4 = bigIntegerDeserializer0.handledType();
        java.math.BigInteger bigInteger5 = bigIntegerDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(bigInteger3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(bigInteger5);
    }
}

