package com.fasterxml.jackson.databind.deser.std;

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
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty2 = nullifyingDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = nullifyingDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue(deserializationContext2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = nullifyingDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = wildcardJsonDeserializer4.getNullValue(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.getClass();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer2 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj3 = nullifyingDeserializer2.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection4 = nullifyingDeserializer2.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(nullifyingDeserializer2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = nullifyingDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection2 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.getClass();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = nullifyingDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = wildcardJsonDeserializer2.getNullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = wildcardJsonDeserializer2.getNullValue(deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj2 = nullifyingDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = nullifyingDeserializer0.deserialize(jsonParser1, deserializationContext2, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Long (by deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getNullValue(deserializationContext1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
        java.lang.Object obj1 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = nullifyingDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
        java.lang.Object obj1 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean2 = nullifyingDeserializer0.isCachable();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection2 = nullifyingDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = nullifyingDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
    }
}

