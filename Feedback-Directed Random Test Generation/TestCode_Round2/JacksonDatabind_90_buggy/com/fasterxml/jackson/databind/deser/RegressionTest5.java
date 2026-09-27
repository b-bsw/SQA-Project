package com.fasterxml.jackson.databind.deser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        java.lang.Class<?> wildcardClass7 = stdValueInstantiator2.getValueClass();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams9);
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stdValueInstantiator2.createFromString(deserializationContext12, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.Class<?> wildcardClass9 = stdValueInstantiator2.getValueClass();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator14 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig12, javaType13);
        boolean boolean15 = stdValueInstantiator14.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = stdValueInstantiator14.getArrayDelegateType(deserializationConfig16);
        java.lang.Class<?> wildcardClass18 = stdValueInstantiator14.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdValueInstantiator2.createUsingDelegate(deserializationContext11, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No delegate constructor for UNKNOWN TYPE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty9 };
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams4, annotatedWithParams5, javaType6, settableBeanPropertyArray7, annotatedWithParams8, settableBeanPropertyArray10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray15 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator19 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig17, javaType18);
        boolean boolean20 = stdValueInstantiator19.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray24 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty26 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray27 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty26 };
        stdValueInstantiator19.configureFromObjectSettings(annotatedWithParams21, annotatedWithParams22, javaType23, settableBeanPropertyArray24, annotatedWithParams25, settableBeanPropertyArray27);
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams12, annotatedWithParams13, javaType14, settableBeanPropertyArray15, annotatedWithParams16, settableBeanPropertyArray27);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams30 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams30);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig32 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray33 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig32);
        boolean boolean34 = stdValueInstantiator2.canCreateUsingDefault();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray7);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray7, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray10);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray10, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray24);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray24, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray27);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray27, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray33);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray33, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = stdValueInstantiator2.getDefaultCreator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDefault();
        java.lang.String str11 = stdValueInstantiator2.getValueTypeDesc();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UNKNOWN TYPE" + "'", str11, "UNKNOWN TYPE");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean9 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig11, javaType12);
        java.lang.String str14 = stdValueInstantiator13.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter15 = stdValueInstantiator13.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = stdValueInstantiator13.getDefaultCreator();
        boolean boolean17 = stdValueInstantiator13.canInstantiate();
        boolean boolean18 = stdValueInstantiator13.canCreateFromBoolean();
        boolean boolean19 = stdValueInstantiator13.canCreateFromBoolean();
        java.lang.String str20 = stdValueInstantiator13.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = null;
        stdValueInstantiator13.configureFromIntCreator(annotatedWithParams21);
        boolean boolean23 = stdValueInstantiator13.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stdValueInstantiator2.createUsingArrayDelegate(deserializationContext10, (java.lang.Object) stdValueInstantiator13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No delegate constructor for UNKNOWN TYPE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UNKNOWN TYPE" + "'", str14, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter15);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UNKNOWN TYPE" + "'", str20, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean7 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean9 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean10 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean11 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray13 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray13);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean4 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean5 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean6 = stdValueInstantiator2.canCreateFromString();
        boolean boolean7 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stdValueInstantiator2.createFromLong(deserializationContext12, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean10 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDelegate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.String str12 = stdValueInstantiator2.getValueTypeDesc();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UNKNOWN TYPE" + "'", str12, "UNKNOWN TYPE");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromString();
        boolean boolean8 = stdValueInstantiator2.canCreateFromDouble();
        java.lang.Class<?> wildcardClass9 = stdValueInstantiator2.getValueClass();
        boolean boolean10 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stdValueInstantiator2.createFromString(deserializationContext11, "UNKNOWN TYPE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        java.lang.Class<?> wildcardClass7 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams8);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean12 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator16 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig14, javaType15);
        java.lang.String str17 = stdValueInstantiator16.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray19 = stdValueInstantiator16.getFromObjectArguments(deserializationConfig18);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = stdValueInstantiator16.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray22 = stdValueInstantiator16.getFromObjectArguments(deserializationConfig21);
        boolean boolean23 = stdValueInstantiator16.canCreateFromDouble();
        boolean boolean24 = stdValueInstantiator16.canCreateUsingDelegate();
        boolean boolean25 = stdValueInstantiator16.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams26 = null;
        stdValueInstantiator16.configureFromBooleanCreator(annotatedWithParams26);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = stdValueInstantiator16.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig29 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray30 = stdValueInstantiator16.getFromObjectArguments(deserializationConfig29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = stdValueInstantiator2.createUsingDelegate(deserializationContext13, (java.lang.Object) stdValueInstantiator16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No delegate constructor for UNKNOWN TYPE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UNKNOWN TYPE" + "'", str17, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray19);
        org.junit.Assert.assertNull(annotatedWithParams20);
        org.junit.Assert.assertNull(settableBeanPropertyArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(annotatedWithParams28);
        org.junit.Assert.assertNull(settableBeanPropertyArray30);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stdValueInstantiator2.createFromLong(deserializationContext11, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getWithArgsCreator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        java.lang.Class<?> wildcardClass6 = stdValueInstantiator2.getValueClass();
        boolean boolean7 = stdValueInstantiator2.canCreateFromString();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter9);
        boolean boolean11 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams13);
        boolean boolean15 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = stdValueInstantiator2.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(annotatedWithParams16);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator14 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig12, javaType13);
        java.lang.String str15 = stdValueInstantiator14.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray18 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator14.configureFromArraySettings(annotatedWithParams16, javaType17, settableBeanPropertyArray18);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator23 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig21, javaType22);
        java.lang.String str24 = stdValueInstantiator23.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter25 = stdValueInstantiator23.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams26 = stdValueInstantiator23.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = stdValueInstantiator23.getDelegateCreator();
        java.lang.Class<?> wildcardClass28 = stdValueInstantiator23.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams29 = null;
        stdValueInstantiator23.configureFromStringCreator(annotatedWithParams29);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams31 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator36 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig34, javaType35);
        boolean boolean37 = stdValueInstantiator36.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams39 = null;
        com.fasterxml.jackson.databind.JavaType javaType40 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray41 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams42 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty43 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray44 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty43 };
        stdValueInstantiator36.configureFromObjectSettings(annotatedWithParams38, annotatedWithParams39, javaType40, settableBeanPropertyArray41, annotatedWithParams42, settableBeanPropertyArray44);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams46 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator49 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig47, javaType48);
        boolean boolean50 = stdValueInstantiator49.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams51 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams52 = null;
        com.fasterxml.jackson.databind.JavaType javaType53 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray54 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams55 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty56 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray57 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty56 };
        stdValueInstantiator49.configureFromObjectSettings(annotatedWithParams51, annotatedWithParams52, javaType53, settableBeanPropertyArray54, annotatedWithParams55, settableBeanPropertyArray57);
        stdValueInstantiator23.configureFromObjectSettings(annotatedWithParams31, annotatedWithParams32, javaType33, settableBeanPropertyArray44, annotatedWithParams46, settableBeanPropertyArray54);
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams9, annotatedWithParams10, javaType11, settableBeanPropertyArray18, annotatedWithParams20, settableBeanPropertyArray54);
        boolean boolean61 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean62 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig63 = null;
        com.fasterxml.jackson.databind.JavaType javaType64 = stdValueInstantiator2.getDelegateType(deserializationConfig63);
        boolean boolean65 = stdValueInstantiator2.canCreateFromInt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UNKNOWN TYPE" + "'", str15, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray18);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray18, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UNKNOWN TYPE" + "'", str24, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter25);
        org.junit.Assert.assertNull(annotatedWithParams26);
        org.junit.Assert.assertNull(annotatedWithParams27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray41);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray41, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray44);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray44, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray54);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray54, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray57);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray57, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(javaType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        java.lang.Class<?> wildcardClass7 = stdValueInstantiator2.getValueClass();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams9);
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean12 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean13 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stdValueInstantiator2.createFromString(deserializationContext10, "UNKNOWN TYPE");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = stdValueInstantiator2.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getArrayDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean9 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stdValueInstantiator2.createFromDouble(deserializationContext10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromDouble();
        java.lang.String str12 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean15 = stdValueInstantiator2.canInstantiate();
        boolean boolean16 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = stdValueInstantiator2.getDefaultCreator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UNKNOWN TYPE" + "'", str12, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertNull(annotatedWithParams18);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stdValueInstantiator2.createFromString(deserializationContext9, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean11 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams14);
        boolean boolean16 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdValueInstantiator2.createUsingArrayDelegate(deserializationContext17, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No delegate constructor for UNKNOWN TYPE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = stdValueInstantiator2.getArrayDelegateCreator();
        java.lang.String str5 = stdValueInstantiator2.getValueTypeDesc();
        java.lang.String str6 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean10 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean12 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator17 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig15, javaType16);
        java.lang.String str18 = stdValueInstantiator17.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = stdValueInstantiator17.getArrayDelegateCreator();
        java.lang.String str20 = stdValueInstantiator17.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator26 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig24, javaType25);
        boolean boolean27 = stdValueInstantiator26.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray31 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams32 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty33 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray34 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty33 };
        stdValueInstantiator26.configureFromObjectSettings(annotatedWithParams28, annotatedWithParams29, javaType30, settableBeanPropertyArray31, annotatedWithParams32, settableBeanPropertyArray34);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams36 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator39 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig37, javaType38);
        boolean boolean40 = stdValueInstantiator39.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams41 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams42 = null;
        com.fasterxml.jackson.databind.JavaType javaType43 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray44 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams45 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty46 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray47 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty46 };
        stdValueInstantiator39.configureFromObjectSettings(annotatedWithParams41, annotatedWithParams42, javaType43, settableBeanPropertyArray44, annotatedWithParams45, settableBeanPropertyArray47);
        stdValueInstantiator17.configureFromObjectSettings(annotatedWithParams21, annotatedWithParams22, javaType23, settableBeanPropertyArray34, annotatedWithParams36, settableBeanPropertyArray47);
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams13, javaType14, settableBeanPropertyArray47);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UNKNOWN TYPE" + "'", str5, "UNKNOWN TYPE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UNKNOWN TYPE" + "'", str6, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UNKNOWN TYPE" + "'", str18, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UNKNOWN TYPE" + "'", str20, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray31);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray31, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray34);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray34, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray44);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray44, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray47);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray47, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNull(javaType52);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean8 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean11 = stdValueInstantiator2.canCreateFromDouble();
        java.lang.String str12 = stdValueInstantiator2.getValueTypeDesc();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UNKNOWN TYPE" + "'", str12, "UNKNOWN TYPE");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams9);
        java.lang.String str11 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean13 = stdValueInstantiator2.canCreateFromObjectWith();
        java.lang.Class<?> wildcardClass14 = stdValueInstantiator2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UNKNOWN TYPE" + "'", str11, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canInstantiate();
        boolean boolean7 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.String str9 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig10);
        boolean boolean12 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean13 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UNKNOWN TYPE" + "'", str9, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean8 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams10);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean14 = stdValueInstantiator2.canCreateUsingDelegate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        java.lang.Class<?> wildcardClass6 = stdValueInstantiator2.getValueClass();
        boolean boolean7 = stdValueInstantiator2.canCreateFromString();
        boolean boolean8 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean9 = stdValueInstantiator2.canCreateFromInt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean9 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean5 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig9, javaType10);
        boolean boolean12 = stdValueInstantiator11.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray16 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty18 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray19 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty18 };
        stdValueInstantiator11.configureFromObjectSettings(annotatedWithParams13, annotatedWithParams14, javaType15, settableBeanPropertyArray16, annotatedWithParams17, settableBeanPropertyArray19);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator24 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig22, javaType23);
        java.lang.String str25 = stdValueInstantiator24.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig26 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray27 = stdValueInstantiator24.getFromObjectArguments(deserializationConfig26);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = stdValueInstantiator24.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig29 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray30 = stdValueInstantiator24.getFromObjectArguments(deserializationConfig29);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams31 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator36 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig34, javaType35);
        java.lang.String str37 = stdValueInstantiator36.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray40 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator36.configureFromArraySettings(annotatedWithParams38, javaType39, settableBeanPropertyArray40);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams42 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig43 = null;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator45 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig43, javaType44);
        java.lang.String str46 = stdValueInstantiator45.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter47 = stdValueInstantiator45.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = stdValueInstantiator45.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams49 = stdValueInstantiator45.getDelegateCreator();
        java.lang.Class<?> wildcardClass50 = stdValueInstantiator45.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams51 = null;
        stdValueInstantiator45.configureFromStringCreator(annotatedWithParams51);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams53 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams54 = null;
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig56 = null;
        com.fasterxml.jackson.databind.JavaType javaType57 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator58 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig56, javaType57);
        boolean boolean59 = stdValueInstantiator58.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams60 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams61 = null;
        com.fasterxml.jackson.databind.JavaType javaType62 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray63 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams64 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty65 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray66 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty65 };
        stdValueInstantiator58.configureFromObjectSettings(annotatedWithParams60, annotatedWithParams61, javaType62, settableBeanPropertyArray63, annotatedWithParams64, settableBeanPropertyArray66);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams68 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig69 = null;
        com.fasterxml.jackson.databind.JavaType javaType70 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator71 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig69, javaType70);
        boolean boolean72 = stdValueInstantiator71.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams73 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams74 = null;
        com.fasterxml.jackson.databind.JavaType javaType75 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray76 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams77 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty78 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray79 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty78 };
        stdValueInstantiator71.configureFromObjectSettings(annotatedWithParams73, annotatedWithParams74, javaType75, settableBeanPropertyArray76, annotatedWithParams77, settableBeanPropertyArray79);
        stdValueInstantiator45.configureFromObjectSettings(annotatedWithParams53, annotatedWithParams54, javaType55, settableBeanPropertyArray66, annotatedWithParams68, settableBeanPropertyArray76);
        stdValueInstantiator24.configureFromObjectSettings(annotatedWithParams31, annotatedWithParams32, javaType33, settableBeanPropertyArray40, annotatedWithParams42, settableBeanPropertyArray76);
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams6, annotatedWithParams7, javaType8, settableBeanPropertyArray16, annotatedWithParams21, settableBeanPropertyArray76);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams84 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig85 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray86 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig85);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams87 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams87);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig89 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray90 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray16);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray16, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray19);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray19, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UNKNOWN TYPE" + "'", str25, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray27);
        org.junit.Assert.assertNull(annotatedWithParams28);
        org.junit.Assert.assertNull(settableBeanPropertyArray30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UNKNOWN TYPE" + "'", str37, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray40);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray40, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UNKNOWN TYPE" + "'", str46, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter47);
        org.junit.Assert.assertNull(annotatedWithParams48);
        org.junit.Assert.assertNull(annotatedWithParams49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray63);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray63, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray66);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray66, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray76);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray76, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray79);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray79, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNull(annotatedWithParams84);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray86);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray86, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray90);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray90, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = stdValueInstantiator2.getDelegateType(deserializationConfig13);
        boolean boolean15 = stdValueInstantiator2.canCreateUsingDefault();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean13 = stdValueInstantiator2.canInstantiate();
        boolean boolean14 = stdValueInstantiator2.canCreateFromObjectWith();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = stdValueInstantiator2.getArrayDelegateCreator();
        java.lang.String str5 = stdValueInstantiator2.getValueTypeDesc();
        java.lang.String str6 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean10 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stdValueInstantiator2.createFromLong(deserializationContext11, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UNKNOWN TYPE" + "'", str5, "UNKNOWN TYPE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UNKNOWN TYPE" + "'", str6, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter9);
        java.lang.String str11 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator15 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig13, javaType14);
        boolean boolean16 = stdValueInstantiator15.canCreateUsingDelegate();
        boolean boolean17 = stdValueInstantiator15.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator23 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig21, javaType22);
        java.lang.String str24 = stdValueInstantiator23.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = stdValueInstantiator23.getArrayDelegateCreator();
        java.lang.String str26 = stdValueInstantiator23.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator32 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig30, javaType31);
        boolean boolean33 = stdValueInstantiator32.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams34 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray37 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty39 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray40 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty39 };
        stdValueInstantiator32.configureFromObjectSettings(annotatedWithParams34, annotatedWithParams35, javaType36, settableBeanPropertyArray37, annotatedWithParams38, settableBeanPropertyArray40);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams42 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig43 = null;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator45 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig43, javaType44);
        boolean boolean46 = stdValueInstantiator45.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams47 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = null;
        com.fasterxml.jackson.databind.JavaType javaType49 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray50 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams51 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty52 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray53 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty52 };
        stdValueInstantiator45.configureFromObjectSettings(annotatedWithParams47, annotatedWithParams48, javaType49, settableBeanPropertyArray50, annotatedWithParams51, settableBeanPropertyArray53);
        stdValueInstantiator23.configureFromObjectSettings(annotatedWithParams27, annotatedWithParams28, javaType29, settableBeanPropertyArray40, annotatedWithParams42, settableBeanPropertyArray53);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams56 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig57 = null;
        com.fasterxml.jackson.databind.JavaType javaType58 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator59 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig57, javaType58);
        boolean boolean60 = stdValueInstantiator59.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams61 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams62 = null;
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray64 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams65 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty66 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray67 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty66 };
        stdValueInstantiator59.configureFromObjectSettings(annotatedWithParams61, annotatedWithParams62, javaType63, settableBeanPropertyArray64, annotatedWithParams65, settableBeanPropertyArray67);
        stdValueInstantiator15.configureFromObjectSettings(annotatedWithParams18, annotatedWithParams19, javaType20, settableBeanPropertyArray40, annotatedWithParams56, settableBeanPropertyArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = stdValueInstantiator2.createFromObjectWith(deserializationContext12, (java.lang.Object[]) settableBeanPropertyArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UNKNOWN TYPE" + "'", str11, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UNKNOWN TYPE" + "'", str24, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UNKNOWN TYPE" + "'", str26, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray37);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray37, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray40);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray40, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray50);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray50, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray53);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray53, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray64);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray64, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray67);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray67, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean8 = stdValueInstantiator2.canCreateFromInt();
        boolean boolean9 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean10 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = stdValueInstantiator2.getIncompleteParameter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator14 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig12, javaType13);
        java.lang.String str15 = stdValueInstantiator14.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray18 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator14.configureFromArraySettings(annotatedWithParams16, javaType17, settableBeanPropertyArray18);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator23 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig21, javaType22);
        java.lang.String str24 = stdValueInstantiator23.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter25 = stdValueInstantiator23.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams26 = stdValueInstantiator23.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = stdValueInstantiator23.getDelegateCreator();
        java.lang.Class<?> wildcardClass28 = stdValueInstantiator23.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams29 = null;
        stdValueInstantiator23.configureFromStringCreator(annotatedWithParams29);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams31 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator36 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig34, javaType35);
        boolean boolean37 = stdValueInstantiator36.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams39 = null;
        com.fasterxml.jackson.databind.JavaType javaType40 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray41 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams42 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty43 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray44 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty43 };
        stdValueInstantiator36.configureFromObjectSettings(annotatedWithParams38, annotatedWithParams39, javaType40, settableBeanPropertyArray41, annotatedWithParams42, settableBeanPropertyArray44);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams46 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator49 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig47, javaType48);
        boolean boolean50 = stdValueInstantiator49.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams51 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams52 = null;
        com.fasterxml.jackson.databind.JavaType javaType53 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray54 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams55 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty56 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray57 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty56 };
        stdValueInstantiator49.configureFromObjectSettings(annotatedWithParams51, annotatedWithParams52, javaType53, settableBeanPropertyArray54, annotatedWithParams55, settableBeanPropertyArray57);
        stdValueInstantiator23.configureFromObjectSettings(annotatedWithParams31, annotatedWithParams32, javaType33, settableBeanPropertyArray44, annotatedWithParams46, settableBeanPropertyArray54);
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams9, annotatedWithParams10, javaType11, settableBeanPropertyArray18, annotatedWithParams20, settableBeanPropertyArray54);
        boolean boolean61 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean62 = stdValueInstantiator2.canCreateFromObjectWith();
        java.lang.String str63 = stdValueInstantiator2.getValueTypeDesc();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UNKNOWN TYPE" + "'", str15, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray18);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray18, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UNKNOWN TYPE" + "'", str24, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter25);
        org.junit.Assert.assertNull(annotatedWithParams26);
        org.junit.Assert.assertNull(annotatedWithParams27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray41);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray41, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray44);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray44, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray54);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray54, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray57);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray57, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UNKNOWN TYPE" + "'", str63, "UNKNOWN TYPE");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator17 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig15, javaType16);
        java.lang.String str18 = stdValueInstantiator17.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray21 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator17.configureFromArraySettings(annotatedWithParams19, javaType20, settableBeanPropertyArray21);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator26 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig24, javaType25);
        java.lang.String str27 = stdValueInstantiator26.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray30 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator26.configureFromArraySettings(annotatedWithParams28, javaType29, settableBeanPropertyArray30);
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams12, annotatedWithParams13, javaType14, settableBeanPropertyArray21, annotatedWithParams23, settableBeanPropertyArray30);
        java.lang.Class<?> wildcardClass33 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams34 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams35 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams35);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = stdValueInstantiator2.createFromInt(deserializationContext37, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UNKNOWN TYPE" + "'", str18, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray21);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray21, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UNKNOWN TYPE" + "'", str27, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray30);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray30, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(annotatedWithParams34);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean11 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = stdValueInstantiator2.getDelegateType(deserializationConfig12);
        java.lang.Class<?> wildcardClass14 = stdValueInstantiator2.getValueClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean11 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams12);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = stdValueInstantiator2.getDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(annotatedWithParams16);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean7 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean9 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean10 = stdValueInstantiator2.canInstantiate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        java.lang.Class<?> wildcardClass7 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean11 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean12 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean13 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean15 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = stdValueInstantiator2.getDelegateType(deserializationConfig16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromDouble();
        java.lang.String str12 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean15 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stdValueInstantiator2.createFromDouble(deserializationContext16, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UNKNOWN TYPE" + "'", str12, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateFromDouble();
        java.lang.Class<?> wildcardClass11 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray13 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(settableBeanPropertyArray13);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean7 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = stdValueInstantiator2.getWithArgsCreator();
        java.lang.Class<?> wildcardClass5 = stdValueInstantiator2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig10, javaType11);
        boolean boolean13 = stdValueInstantiator12.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray17 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty19 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray20 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty19 };
        stdValueInstantiator12.configureFromObjectSettings(annotatedWithParams14, annotatedWithParams15, javaType16, settableBeanPropertyArray17, annotatedWithParams18, settableBeanPropertyArray20);
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams8, javaType9, settableBeanPropertyArray20);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig23 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray24 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig23);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams25);
        boolean boolean27 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator32 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig30, javaType31);
        java.lang.String str33 = stdValueInstantiator32.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig34 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray35 = stdValueInstantiator32.getFromObjectArguments(deserializationConfig34);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams36 = stdValueInstantiator32.getDefaultCreator();
        boolean boolean37 = stdValueInstantiator32.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = null;
        stdValueInstantiator32.configureFromIntCreator(annotatedWithParams38);
        boolean boolean40 = stdValueInstantiator32.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams41 = null;
        com.fasterxml.jackson.databind.JavaType javaType42 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig43 = null;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator45 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig43, javaType44);
        java.lang.String str46 = stdValueInstantiator45.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter47 = stdValueInstantiator45.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = stdValueInstantiator45.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig49 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray50 = stdValueInstantiator45.getFromObjectArguments(deserializationConfig49);
        boolean boolean51 = stdValueInstantiator45.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams52 = null;
        stdValueInstantiator45.configureFromDoubleCreator(annotatedWithParams52);
        boolean boolean54 = stdValueInstantiator45.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams55 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams56 = null;
        com.fasterxml.jackson.databind.JavaType javaType57 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig58 = null;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator60 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig58, javaType59);
        java.lang.String str61 = stdValueInstantiator60.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams62 = null;
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray64 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator60.configureFromArraySettings(annotatedWithParams62, javaType63, settableBeanPropertyArray64);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams66 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator69 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig67, javaType68);
        java.lang.String str70 = stdValueInstantiator69.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams71 = null;
        com.fasterxml.jackson.databind.JavaType javaType72 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray73 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator69.configureFromArraySettings(annotatedWithParams71, javaType72, settableBeanPropertyArray73);
        stdValueInstantiator45.configureFromObjectSettings(annotatedWithParams55, annotatedWithParams56, javaType57, settableBeanPropertyArray64, annotatedWithParams66, settableBeanPropertyArray73);
        stdValueInstantiator32.configureFromArraySettings(annotatedWithParams41, javaType42, settableBeanPropertyArray64);
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams28, javaType29, settableBeanPropertyArray64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray17);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray17, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray20);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray20, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNull(settableBeanPropertyArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UNKNOWN TYPE" + "'", str33, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray35);
        org.junit.Assert.assertNull(annotatedWithParams36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UNKNOWN TYPE" + "'", str46, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter47);
        org.junit.Assert.assertNull(annotatedWithParams48);
        org.junit.Assert.assertNull(settableBeanPropertyArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "UNKNOWN TYPE" + "'", str61, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray64);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray64, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "UNKNOWN TYPE" + "'", str70, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray73);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray73, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromInt();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.String str9 = stdValueInstantiator2.getValueTypeDesc();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UNKNOWN TYPE" + "'", str9, "UNKNOWN TYPE");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig11, javaType12);
        java.lang.String str14 = stdValueInstantiator13.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter15 = stdValueInstantiator13.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = stdValueInstantiator13.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray18 = stdValueInstantiator13.getFromObjectArguments(deserializationConfig17);
        boolean boolean19 = stdValueInstantiator13.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = null;
        stdValueInstantiator13.configureFromDoubleCreator(annotatedWithParams20);
        boolean boolean22 = stdValueInstantiator13.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator28 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig26, javaType27);
        java.lang.String str29 = stdValueInstantiator28.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray32 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator28.configureFromArraySettings(annotatedWithParams30, javaType31, settableBeanPropertyArray32);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams34 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator37 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig35, javaType36);
        java.lang.String str38 = stdValueInstantiator37.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams39 = null;
        com.fasterxml.jackson.databind.JavaType javaType40 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray41 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator37.configureFromArraySettings(annotatedWithParams39, javaType40, settableBeanPropertyArray41);
        stdValueInstantiator13.configureFromObjectSettings(annotatedWithParams23, annotatedWithParams24, javaType25, settableBeanPropertyArray32, annotatedWithParams34, settableBeanPropertyArray41);
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams9, javaType10, settableBeanPropertyArray32);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig45 = null;
        com.fasterxml.jackson.databind.JavaType javaType46 = stdValueInstantiator2.getDelegateType(deserializationConfig45);
        boolean boolean47 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter49 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext50 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator53 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig51, javaType52);
        java.lang.String str54 = stdValueInstantiator53.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig55 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray56 = stdValueInstantiator53.getFromObjectArguments(deserializationConfig55);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams57 = stdValueInstantiator53.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig58 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray59 = stdValueInstantiator53.getFromObjectArguments(deserializationConfig58);
        boolean boolean60 = stdValueInstantiator53.canCreateFromDouble();
        boolean boolean61 = stdValueInstantiator53.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig62 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray63 = stdValueInstantiator53.getFromObjectArguments(deserializationConfig62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = stdValueInstantiator2.createUsingArrayDelegate(deserializationContext50, (java.lang.Object) stdValueInstantiator53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No delegate constructor for UNKNOWN TYPE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UNKNOWN TYPE" + "'", str14, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter15);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertNull(settableBeanPropertyArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UNKNOWN TYPE" + "'", str29, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray32);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray32, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UNKNOWN TYPE" + "'", str38, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray41);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray41, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(annotatedWithParams48);
        org.junit.Assert.assertNull(annotatedParameter49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UNKNOWN TYPE" + "'", str54, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray56);
        org.junit.Assert.assertNull(annotatedWithParams57);
        org.junit.Assert.assertNull(settableBeanPropertyArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray63);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean9 = stdValueInstantiator2.canCreateFromInt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean8 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = stdValueInstantiator2.getDelegateType(deserializationConfig9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator2.getArrayDelegateCreator();
        java.lang.String str15 = stdValueInstantiator2.getValueTypeDesc();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UNKNOWN TYPE" + "'", str15, "UNKNOWN TYPE");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean12 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean13 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertNull(javaType18);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean8 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams10);
        boolean boolean12 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.Class<?> wildcardClass13 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator17 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig15, javaType16);
        java.lang.String str18 = stdValueInstantiator17.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter19 = stdValueInstantiator17.getIncompleteParameter();
        java.lang.Class<?> wildcardClass20 = stdValueInstantiator17.getValueClass();
        boolean boolean21 = stdValueInstantiator17.canCreateUsingDelegate();
        java.lang.String str22 = stdValueInstantiator17.getValueTypeDesc();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stdValueInstantiator2.createUsingArrayDelegate(deserializationContext14, (java.lang.Object) stdValueInstantiator17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No delegate constructor for UNKNOWN TYPE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UNKNOWN TYPE" + "'", str18, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UNKNOWN TYPE" + "'", str22, "UNKNOWN TYPE");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean8 = stdValueInstantiator2.canCreateFromInt();
        boolean boolean9 = stdValueInstantiator2.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass10 = stdValueInstantiator2.getValueClass();
        boolean boolean11 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean12 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams13);
        boolean boolean15 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean9 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stdValueInstantiator2.createFromBoolean(deserializationContext10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams4, javaType5, settableBeanPropertyArray6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig10);
        boolean boolean12 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean13 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean14 = stdValueInstantiator2.canCreateUsingDelegate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray6);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray6, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator2.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromObjectWith();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean11 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean5 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = stdValueInstantiator2.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stdValueInstantiator2.createUsingDefault(deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty9 };
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams4, annotatedWithParams5, javaType6, settableBeanPropertyArray7, annotatedWithParams8, settableBeanPropertyArray10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdValueInstantiator2.createFromString(deserializationContext14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray7);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray7, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray10);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray10, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean5 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig9, javaType10);
        boolean boolean12 = stdValueInstantiator11.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray16 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty18 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray19 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty18 };
        stdValueInstantiator11.configureFromObjectSettings(annotatedWithParams13, annotatedWithParams14, javaType15, settableBeanPropertyArray16, annotatedWithParams17, settableBeanPropertyArray19);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator24 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig22, javaType23);
        java.lang.String str25 = stdValueInstantiator24.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig26 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray27 = stdValueInstantiator24.getFromObjectArguments(deserializationConfig26);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams28 = stdValueInstantiator24.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig29 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray30 = stdValueInstantiator24.getFromObjectArguments(deserializationConfig29);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams31 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator36 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig34, javaType35);
        java.lang.String str37 = stdValueInstantiator36.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray40 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator36.configureFromArraySettings(annotatedWithParams38, javaType39, settableBeanPropertyArray40);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams42 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig43 = null;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator45 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig43, javaType44);
        java.lang.String str46 = stdValueInstantiator45.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter47 = stdValueInstantiator45.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = stdValueInstantiator45.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams49 = stdValueInstantiator45.getDelegateCreator();
        java.lang.Class<?> wildcardClass50 = stdValueInstantiator45.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams51 = null;
        stdValueInstantiator45.configureFromStringCreator(annotatedWithParams51);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams53 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams54 = null;
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig56 = null;
        com.fasterxml.jackson.databind.JavaType javaType57 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator58 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig56, javaType57);
        boolean boolean59 = stdValueInstantiator58.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams60 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams61 = null;
        com.fasterxml.jackson.databind.JavaType javaType62 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray63 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams64 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty65 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray66 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty65 };
        stdValueInstantiator58.configureFromObjectSettings(annotatedWithParams60, annotatedWithParams61, javaType62, settableBeanPropertyArray63, annotatedWithParams64, settableBeanPropertyArray66);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams68 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig69 = null;
        com.fasterxml.jackson.databind.JavaType javaType70 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator71 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig69, javaType70);
        boolean boolean72 = stdValueInstantiator71.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams73 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams74 = null;
        com.fasterxml.jackson.databind.JavaType javaType75 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray76 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams77 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty78 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray79 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty78 };
        stdValueInstantiator71.configureFromObjectSettings(annotatedWithParams73, annotatedWithParams74, javaType75, settableBeanPropertyArray76, annotatedWithParams77, settableBeanPropertyArray79);
        stdValueInstantiator45.configureFromObjectSettings(annotatedWithParams53, annotatedWithParams54, javaType55, settableBeanPropertyArray66, annotatedWithParams68, settableBeanPropertyArray76);
        stdValueInstantiator24.configureFromObjectSettings(annotatedWithParams31, annotatedWithParams32, javaType33, settableBeanPropertyArray40, annotatedWithParams42, settableBeanPropertyArray76);
        stdValueInstantiator2.configureFromObjectSettings(annotatedWithParams6, annotatedWithParams7, javaType8, settableBeanPropertyArray16, annotatedWithParams21, settableBeanPropertyArray76);
        java.lang.Class<?> wildcardClass84 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams85 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext86 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = stdValueInstantiator2.createFromBoolean(deserializationContext86, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray16);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray16, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray19);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray19, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UNKNOWN TYPE" + "'", str25, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray27);
        org.junit.Assert.assertNull(annotatedWithParams28);
        org.junit.Assert.assertNull(settableBeanPropertyArray30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UNKNOWN TYPE" + "'", str37, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray40);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray40, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UNKNOWN TYPE" + "'", str46, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter47);
        org.junit.Assert.assertNull(annotatedWithParams48);
        org.junit.Assert.assertNull(annotatedWithParams49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray63);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray63, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray66);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray66, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray76);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray76, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray79);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray79, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNull(annotatedWithParams85);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams8);
        java.lang.String str10 = stdValueInstantiator2.getValueTypeDesc();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UNKNOWN TYPE" + "'", str10, "UNKNOWN TYPE");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean9 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig11);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator2.getArrayDelegateCreator();
        java.lang.String str14 = stdValueInstantiator2.getValueTypeDesc();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UNKNOWN TYPE" + "'", str14, "UNKNOWN TYPE");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        java.lang.Class<?> wildcardClass7 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = null;
        stdValueInstantiator2.configureFromDoubleCreator(annotatedWithParams10);
        boolean boolean12 = stdValueInstantiator2.canCreateFromBoolean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter11);
        boolean boolean13 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean14 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean8 = stdValueInstantiator2.canCreateFromInt();
        boolean boolean9 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig10);
        boolean boolean12 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = stdValueInstantiator2.getWithArgsCreator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams16);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig10);
        java.lang.Class<?> wildcardClass12 = stdValueInstantiator2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean7 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean9 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig10);
        boolean boolean12 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        java.lang.Class<?> wildcardClass6 = stdValueInstantiator2.getValueClass();
        boolean boolean7 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean12 = stdValueInstantiator2.canCreateFromBoolean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean8 = stdValueInstantiator2.canInstantiate();
        boolean boolean9 = stdValueInstantiator2.canCreateUsingDelegate();
        java.lang.String str10 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stdValueInstantiator2.createUsingDefault(deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UNKNOWN TYPE" + "'", str10, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertNull(annotatedParameter12);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean11 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = stdValueInstantiator2.getDelegateType(deserializationConfig12);
        boolean boolean14 = stdValueInstantiator2.canCreateFromLong();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean13 = stdValueInstantiator2.canCreateFromString();
        java.lang.Class<?> wildcardClass14 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams15);
        boolean boolean17 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdValueInstantiator2.createUsingDefault(deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams11);
        boolean boolean13 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator2.getWithArgsCreator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stdValueInstantiator2.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean5 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean10 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean11 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getDefaultCreator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean6 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass8 = stdValueInstantiator2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass13 = stdValueInstantiator2.getValueClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        java.lang.Class<?> wildcardClass12 = stdValueInstantiator2.getValueClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator2.getDelegateType(deserializationConfig8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean13 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean14 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stdValueInstantiator2.createFromDouble(deserializationContext15, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean7 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean9 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean10 = stdValueInstantiator2.canCreateFromObjectWith();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.Class<?> wildcardClass9 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stdValueInstantiator2.createUsingDefault(deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromIntCreator(annotatedWithParams8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean11 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig11);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stdValueInstantiator2.createFromInt(deserializationContext15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams12);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator2.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = stdValueInstantiator2.getArrayDelegateCreator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertNull(annotatedWithParams15);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig10, javaType11);
        java.lang.String str13 = stdValueInstantiator12.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = stdValueInstantiator12.getArrayDelegateCreator();
        boolean boolean15 = stdValueInstantiator12.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator21 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig19, javaType20);
        boolean boolean22 = stdValueInstantiator21.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray26 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty28 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray29 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty28 };
        stdValueInstantiator21.configureFromObjectSettings(annotatedWithParams23, annotatedWithParams24, javaType25, settableBeanPropertyArray26, annotatedWithParams27, settableBeanPropertyArray29);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams31 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator34 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig32, javaType33);
        java.lang.String str35 = stdValueInstantiator34.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig36 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray37 = stdValueInstantiator34.getFromObjectArguments(deserializationConfig36);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams38 = stdValueInstantiator34.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig39 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray40 = stdValueInstantiator34.getFromObjectArguments(deserializationConfig39);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams41 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams42 = null;
        com.fasterxml.jackson.databind.JavaType javaType43 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator46 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig44, javaType45);
        java.lang.String str47 = stdValueInstantiator46.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = null;
        com.fasterxml.jackson.databind.JavaType javaType49 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray50 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator46.configureFromArraySettings(annotatedWithParams48, javaType49, settableBeanPropertyArray50);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams52 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig53 = null;
        com.fasterxml.jackson.databind.JavaType javaType54 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator55 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig53, javaType54);
        java.lang.String str56 = stdValueInstantiator55.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter57 = stdValueInstantiator55.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams58 = stdValueInstantiator55.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams59 = stdValueInstantiator55.getDelegateCreator();
        java.lang.Class<?> wildcardClass60 = stdValueInstantiator55.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams61 = null;
        stdValueInstantiator55.configureFromStringCreator(annotatedWithParams61);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams63 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams64 = null;
        com.fasterxml.jackson.databind.JavaType javaType65 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig66 = null;
        com.fasterxml.jackson.databind.JavaType javaType67 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator68 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig66, javaType67);
        boolean boolean69 = stdValueInstantiator68.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams70 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams71 = null;
        com.fasterxml.jackson.databind.JavaType javaType72 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray73 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams74 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty75 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray76 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty75 };
        stdValueInstantiator68.configureFromObjectSettings(annotatedWithParams70, annotatedWithParams71, javaType72, settableBeanPropertyArray73, annotatedWithParams74, settableBeanPropertyArray76);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams78 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig79 = null;
        com.fasterxml.jackson.databind.JavaType javaType80 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator81 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig79, javaType80);
        boolean boolean82 = stdValueInstantiator81.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams83 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams84 = null;
        com.fasterxml.jackson.databind.JavaType javaType85 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray86 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams87 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty88 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray89 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty88 };
        stdValueInstantiator81.configureFromObjectSettings(annotatedWithParams83, annotatedWithParams84, javaType85, settableBeanPropertyArray86, annotatedWithParams87, settableBeanPropertyArray89);
        stdValueInstantiator55.configureFromObjectSettings(annotatedWithParams63, annotatedWithParams64, javaType65, settableBeanPropertyArray76, annotatedWithParams78, settableBeanPropertyArray86);
        stdValueInstantiator34.configureFromObjectSettings(annotatedWithParams41, annotatedWithParams42, javaType43, settableBeanPropertyArray50, annotatedWithParams52, settableBeanPropertyArray86);
        stdValueInstantiator12.configureFromObjectSettings(annotatedWithParams16, annotatedWithParams17, javaType18, settableBeanPropertyArray26, annotatedWithParams31, settableBeanPropertyArray86);
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams8, javaType9, settableBeanPropertyArray86);
        boolean boolean95 = stdValueInstantiator2.canCreateFromBoolean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UNKNOWN TYPE" + "'", str13, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray26);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray26, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray29);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray29, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UNKNOWN TYPE" + "'", str35, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray37);
        org.junit.Assert.assertNull(annotatedWithParams38);
        org.junit.Assert.assertNull(settableBeanPropertyArray40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UNKNOWN TYPE" + "'", str47, "UNKNOWN TYPE");
        org.junit.Assert.assertNotNull(settableBeanPropertyArray50);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray50, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UNKNOWN TYPE" + "'", str56, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter57);
        org.junit.Assert.assertNull(annotatedWithParams58);
        org.junit.Assert.assertNull(annotatedWithParams59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray73);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray73, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray76);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray76, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray86);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray86, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray89);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray89, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = stdValueInstantiator2.getIncompleteParameter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        boolean boolean5 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = stdValueInstantiator2.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig8);
        java.lang.String str10 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean11 = stdValueInstantiator2.canCreateFromBoolean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UNKNOWN TYPE" + "'", str10, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = null;
        stdValueInstantiator2.configureFromBooleanCreator(annotatedWithParams9);
        boolean boolean11 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdValueInstantiator2.createUsingDefault(deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stdValueInstantiator2.createFromInt(deserializationContext7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        java.lang.Class<?> wildcardClass5 = stdValueInstantiator2.getValueClass();
        boolean boolean6 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean8 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean9 = stdValueInstantiator2.canCreateFromInt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        java.lang.Class<?> wildcardClass7 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams8);
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean13 = stdValueInstantiator2.canCreateUsingDefault();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        boolean boolean7 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator2.getDelegateType(deserializationConfig8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean13 = stdValueInstantiator2.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator18 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig16, javaType17);
        java.lang.String str19 = stdValueInstantiator18.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig20 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray21 = stdValueInstantiator18.getFromObjectArguments(deserializationConfig20);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = stdValueInstantiator18.getWithArgsCreator();
        boolean boolean23 = stdValueInstantiator18.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator28 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig26, javaType27);
        java.lang.String str29 = stdValueInstantiator28.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig30 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray31 = stdValueInstantiator28.getFromObjectArguments(deserializationConfig30);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams32 = null;
        stdValueInstantiator28.configureFromIntCreator(annotatedWithParams32);
        java.lang.String str34 = stdValueInstantiator28.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams35 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams36 = null;
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator40 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig38, javaType39);
        java.lang.String str41 = stdValueInstantiator40.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter42 = stdValueInstantiator40.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams43 = stdValueInstantiator40.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams44 = stdValueInstantiator40.getDelegateCreator();
        java.lang.Class<?> wildcardClass45 = stdValueInstantiator40.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams46 = null;
        stdValueInstantiator40.configureFromStringCreator(annotatedWithParams46);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams49 = null;
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator53 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig51, javaType52);
        boolean boolean54 = stdValueInstantiator53.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams55 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams56 = null;
        com.fasterxml.jackson.databind.JavaType javaType57 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray58 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams59 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty60 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray61 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty60 };
        stdValueInstantiator53.configureFromObjectSettings(annotatedWithParams55, annotatedWithParams56, javaType57, settableBeanPropertyArray58, annotatedWithParams59, settableBeanPropertyArray61);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams63 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig64 = null;
        com.fasterxml.jackson.databind.JavaType javaType65 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator66 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig64, javaType65);
        boolean boolean67 = stdValueInstantiator66.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams68 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams69 = null;
        com.fasterxml.jackson.databind.JavaType javaType70 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray71 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams72 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty73 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray74 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty73 };
        stdValueInstantiator66.configureFromObjectSettings(annotatedWithParams68, annotatedWithParams69, javaType70, settableBeanPropertyArray71, annotatedWithParams72, settableBeanPropertyArray74);
        stdValueInstantiator40.configureFromObjectSettings(annotatedWithParams48, annotatedWithParams49, javaType50, settableBeanPropertyArray61, annotatedWithParams63, settableBeanPropertyArray71);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams77 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray78 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        stdValueInstantiator28.configureFromObjectSettings(annotatedWithParams35, annotatedWithParams36, javaType37, settableBeanPropertyArray71, annotatedWithParams77, settableBeanPropertyArray78);
        stdValueInstantiator18.configureFromArraySettings(annotatedWithParams24, javaType25, settableBeanPropertyArray71);
        stdValueInstantiator2.configureFromArraySettings(annotatedWithParams14, javaType15, settableBeanPropertyArray71);
        java.lang.Class<?> wildcardClass82 = stdValueInstantiator2.getValueClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UNKNOWN TYPE" + "'", str19, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray21);
        org.junit.Assert.assertNull(annotatedWithParams22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UNKNOWN TYPE" + "'", str29, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UNKNOWN TYPE" + "'", str34, "UNKNOWN TYPE");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UNKNOWN TYPE" + "'", str41, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter42);
        org.junit.Assert.assertNull(annotatedWithParams43);
        org.junit.Assert.assertNull(annotatedWithParams44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray58);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray58, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray61);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray61, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray71);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray71, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray74);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray74, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertNotNull(settableBeanPropertyArray78);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray78, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = stdValueInstantiator2.getDelegateType(deserializationConfig12);
        boolean boolean14 = stdValueInstantiator2.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = stdValueInstantiator2.getArrayDelegateCreator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(annotatedWithParams15);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        java.lang.Class<?> wildcardClass7 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams8);
        boolean boolean10 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stdValueInstantiator2.createFromBoolean(deserializationContext11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        java.lang.Class<?> wildcardClass6 = stdValueInstantiator2.getValueClass();
        boolean boolean7 = stdValueInstantiator2.canCreateFromString();
        boolean boolean8 = stdValueInstantiator2.canCreateFromLong();
        boolean boolean9 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean10 = stdValueInstantiator2.canCreateFromLong();
        java.lang.Class<?> wildcardClass11 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getArrayDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        boolean boolean10 = stdValueInstantiator2.canCreateFromObjectWith();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean12 = stdValueInstantiator2.canCreateUsingDefault();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDelegateCreator();
        java.lang.Class<?> wildcardClass7 = stdValueInstantiator2.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams8);
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean13 = stdValueInstantiator2.canInstantiate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean4 = stdValueInstantiator2.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = stdValueInstantiator2.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stdValueInstantiator2.createFromDouble(deserializationContext8, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean13 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean14 = stdValueInstantiator2.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdValueInstantiator2.createUsingDefault(deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = stdValueInstantiator2.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = null;
        stdValueInstantiator2.configureFromLongCreator(annotatedWithParams8);
        java.lang.Class<?> wildcardClass10 = stdValueInstantiator2.getValueClass();
        boolean boolean11 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = stdValueInstantiator2.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = null;
        stdValueInstantiator2.configureFromStringCreator(annotatedWithParams7);
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean11 = stdValueInstantiator2.canCreateUsingDefault();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        boolean boolean3 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getArrayDelegateCreator();
        java.lang.String str7 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = stdValueInstantiator2.getDelegateType(deserializationConfig8);
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDefault();
        boolean boolean11 = stdValueInstantiator2.canCreateFromDouble();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNKNOWN TYPE" + "'", str7, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = stdValueInstantiator2.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = stdValueInstantiator2.getWithArgsCreator();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean9 = stdValueInstantiator2.canCreateFromDouble();
        boolean boolean10 = stdValueInstantiator2.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = stdValueInstantiator2.getFromObjectArguments(deserializationConfig11);
        boolean boolean13 = stdValueInstantiator2.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdValueInstantiator2.createFromLong(deserializationContext14, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = stdValueInstantiator2.getArrayDelegateCreator();
        java.lang.String str5 = stdValueInstantiator2.getValueTypeDesc();
        java.lang.String str6 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = stdValueInstantiator2.getArrayDelegateCreator();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = stdValueInstantiator2.getArrayDelegateType(deserializationConfig11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UNKNOWN TYPE" + "'", str5, "UNKNOWN TYPE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UNKNOWN TYPE" + "'", str6, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator2 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig0, javaType1);
        java.lang.String str3 = stdValueInstantiator2.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = stdValueInstantiator2.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = stdValueInstantiator2.getDefaultCreator();
        boolean boolean6 = stdValueInstantiator2.canInstantiate();
        boolean boolean7 = stdValueInstantiator2.canCreateFromBoolean();
        boolean boolean8 = stdValueInstantiator2.canCreateFromBoolean();
        java.lang.String str9 = stdValueInstantiator2.getValueTypeDesc();
        boolean boolean10 = stdValueInstantiator2.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = null;
        stdValueInstantiator2.configureIncompleteParameter(annotatedParameter11);
        boolean boolean13 = stdValueInstantiator2.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator17 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig15, javaType16);
        java.lang.String str18 = stdValueInstantiator17.getValueTypeDesc();
        boolean boolean19 = stdValueInstantiator17.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = null;
        stdValueInstantiator17.configureFromBooleanCreator(annotatedWithParams20);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator27 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig25, javaType26);
        java.lang.String str28 = stdValueInstantiator27.getValueTypeDesc();
        boolean boolean29 = stdValueInstantiator27.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams30 = stdValueInstantiator27.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams31 = stdValueInstantiator27.getWithArgsCreator();
        boolean boolean32 = stdValueInstantiator27.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator37 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig35, javaType36);
        boolean boolean38 = stdValueInstantiator37.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams39 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray42 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams43 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty44 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray45 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty44 };
        stdValueInstantiator37.configureFromObjectSettings(annotatedWithParams39, annotatedWithParams40, javaType41, settableBeanPropertyArray42, annotatedWithParams43, settableBeanPropertyArray45);
        stdValueInstantiator27.configureFromArraySettings(annotatedWithParams33, javaType34, settableBeanPropertyArray45);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams48 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig49 = null;
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator51 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig49, javaType50);
        java.lang.String str52 = stdValueInstantiator51.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter53 = stdValueInstantiator51.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams54 = stdValueInstantiator51.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams55 = stdValueInstantiator51.getDelegateCreator();
        java.lang.Class<?> wildcardClass56 = stdValueInstantiator51.getValueClass();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams57 = null;
        stdValueInstantiator51.configureFromStringCreator(annotatedWithParams57);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams59 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams60 = null;
        com.fasterxml.jackson.databind.JavaType javaType61 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig62 = null;
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator64 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig62, javaType63);
        boolean boolean65 = stdValueInstantiator64.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams66 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray69 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams70 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty71 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray72 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty71 };
        stdValueInstantiator64.configureFromObjectSettings(annotatedWithParams66, annotatedWithParams67, javaType68, settableBeanPropertyArray69, annotatedWithParams70, settableBeanPropertyArray72);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams74 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig75 = null;
        com.fasterxml.jackson.databind.JavaType javaType76 = null;
        com.fasterxml.jackson.databind.deser.std.StdValueInstantiator stdValueInstantiator77 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(deserializationConfig75, javaType76);
        boolean boolean78 = stdValueInstantiator77.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams79 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams80 = null;
        com.fasterxml.jackson.databind.JavaType javaType81 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray82 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {};
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams83 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty84 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray85 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { settableBeanProperty84 };
        stdValueInstantiator77.configureFromObjectSettings(annotatedWithParams79, annotatedWithParams80, javaType81, settableBeanPropertyArray82, annotatedWithParams83, settableBeanPropertyArray85);
        stdValueInstantiator51.configureFromObjectSettings(annotatedWithParams59, annotatedWithParams60, javaType61, settableBeanPropertyArray72, annotatedWithParams74, settableBeanPropertyArray82);
        stdValueInstantiator17.configureFromObjectSettings(annotatedWithParams22, annotatedWithParams23, javaType24, settableBeanPropertyArray45, annotatedWithParams48, settableBeanPropertyArray82);
        boolean boolean89 = stdValueInstantiator17.canCreateFromString();
        boolean boolean90 = stdValueInstantiator17.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig91 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray92 = stdValueInstantiator17.getFromObjectArguments(deserializationConfig91);
        com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer propertyValueBuffer93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj94 = stdValueInstantiator2.createFromObjectWith(deserializationContext14, settableBeanPropertyArray92, propertyValueBuffer93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN TYPE" + "'", str3, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UNKNOWN TYPE" + "'", str9, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UNKNOWN TYPE" + "'", str18, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UNKNOWN TYPE" + "'", str28, "UNKNOWN TYPE");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(annotatedWithParams30);
        org.junit.Assert.assertNull(annotatedWithParams31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray42);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray42, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray45);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray45, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UNKNOWN TYPE" + "'", str52, "UNKNOWN TYPE");
        org.junit.Assert.assertNull(annotatedParameter53);
        org.junit.Assert.assertNull(annotatedWithParams54);
        org.junit.Assert.assertNull(annotatedWithParams55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray69);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray69, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray72);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray72, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray82);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray82, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
        org.junit.Assert.assertNotNull(settableBeanPropertyArray85);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray85, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] { null });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(settableBeanPropertyArray92);
        org.junit.Assert.assertArrayEquals(settableBeanPropertyArray92, new com.fasterxml.jackson.databind.deser.SettableBeanProperty[] {});
    }
}

