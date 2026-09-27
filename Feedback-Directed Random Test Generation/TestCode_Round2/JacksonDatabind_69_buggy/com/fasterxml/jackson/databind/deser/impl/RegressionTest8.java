package com.fasterxml.jackson.databind.deser.impl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromLong();
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromInt();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla1.getDelegateType(deserializationConfig12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        boolean boolean10 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.String[] strArray15 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromObjectWith(deserializationContext14, (java.lang.Object[]) strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) 'a');
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getWithArgsCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        boolean boolean4 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(2);
        boolean boolean2 = vanilla1.canCreateFromLong();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateUsingDelegate();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        boolean boolean10 = vanilla1.canCreateFromBoolean();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        java.lang.String str2 = vanilla1.getValueTypeDesc();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.Object" + "'", str2, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getArrayDelegateType(deserializationConfig11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromDouble();
        java.lang.Class<?> wildcardClass11 = vanilla1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        boolean boolean8 = vanilla1.canCreateFromLong();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        boolean boolean10 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla1.canCreateFromLong();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        boolean boolean6 = vanilla1.canCreateFromInt();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        boolean boolean9 = vanilla1.canCreateFromString();
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        boolean boolean11 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        java.lang.Class<?> wildcardClass11 = vanilla1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canCreateFromLong();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        boolean boolean9 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.String[] strArray11 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromObjectWith(deserializationContext10, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean8 = vanilla1.canCreateFromLong();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        boolean boolean10 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(2);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) 'a');
        boolean boolean8 = vanilla7.canCreateUsingArrayDelegate();
        boolean boolean9 = vanilla7.canCreateUsingDelegate();
        boolean boolean10 = vanilla7.canCreateFromDouble();
        boolean boolean11 = vanilla7.canCreateFromBoolean();
        boolean boolean12 = vanilla7.canCreateFromInt();
        boolean boolean13 = vanilla7.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla7.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla7.getDefaultCreator();
        java.lang.Object[] objArray16 = new java.lang.Object[] { annotatedWithParams15 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createFromObjectWith(deserializationContext5, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] { null });
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromInt();
        boolean boolean13 = vanilla1.canCreateFromInt();
        boolean boolean14 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter15 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = vanilla1.getArrayDelegateType(deserializationConfig16);
        boolean boolean18 = vanilla1.canCreateFromDouble();
        java.lang.String str19 = vanilla1.getValueTypeDesc();
        boolean boolean20 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(annotatedParameter15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.Object" + "'", str19, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray13 = vanilla1.getFromObjectArguments(deserializationConfig12);
        java.lang.String str14 = vanilla1.getValueTypeDesc();
        boolean boolean15 = vanilla1.canInstantiate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(settableBeanPropertyArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Object" + "'", str14, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateFromLong();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        boolean boolean11 = vanilla1.canCreateFromString();
        boolean boolean12 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromInt(deserializationContext14, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedParameter13);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean9 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDefaultCreator();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getWithArgsCreator();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromBoolean(deserializationContext5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        boolean boolean11 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean11 = vanilla10.canCreateFromBoolean();
        boolean boolean12 = vanilla10.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla10.getIncompleteParameter();
        boolean boolean14 = vanilla10.canCreateFromDouble();
        boolean boolean15 = vanilla10.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla10.getWithArgsCreator();
        boolean boolean17 = vanilla10.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = vanilla10.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = vanilla10.getDelegateType(deserializationConfig19);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray22 = vanilla10.getFromObjectArguments(deserializationConfig21);
        java.lang.String str23 = vanilla10.getValueTypeDesc();
        java.lang.String str24 = vanilla10.getValueTypeDesc();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = vanilla1.createUsingArrayDelegate(deserializationContext8, (java.lang.Object) vanilla10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(annotatedWithParams18);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(settableBeanPropertyArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.Object" + "'", str23, "java.lang.Object");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.Object" + "'", str24, "java.lang.Object");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla1.getFromObjectArguments(deserializationConfig11);
        java.lang.String str13 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Object" + "'", str13, "java.lang.Object");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        boolean boolean10 = vanilla1.canCreateFromInt();
        boolean boolean11 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDefaultCreator();
        boolean boolean11 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canInstantiate();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean12 = vanilla11.canCreateFromBoolean();
        boolean boolean13 = vanilla11.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla11.getArrayDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray17 = vanilla11.getFromObjectArguments(deserializationConfig16);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = vanilla11.getArrayDelegateType(deserializationConfig18);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = vanilla11.getDelegateType(deserializationConfig20);
        java.lang.String str22 = vanilla11.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = vanilla11.getArrayDelegateType(deserializationConfig23);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = vanilla11.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig26 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray27 = vanilla11.getFromObjectArguments(deserializationConfig26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { deserializationConfig26 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = vanilla1.createFromObjectWith(deserializationContext9, objArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(settableBeanPropertyArray17);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.Object" + "'", str22, "java.lang.Object");
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(annotatedWithParams25);
        org.junit.Assert.assertNull(settableBeanPropertyArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] { null });
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean8 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        boolean boolean5 = vanilla1.canCreateFromInt();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla1.getFromObjectArguments(deserializationConfig11);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla16 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean17 = vanilla16.canCreateFromBoolean();
        boolean boolean18 = vanilla16.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter19 = vanilla16.getIncompleteParameter();
        boolean boolean20 = vanilla16.canCreateFromDouble();
        boolean boolean21 = vanilla16.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = vanilla16.getWithArgsCreator();
        boolean boolean23 = vanilla16.canCreateFromString();
        boolean boolean24 = vanilla16.canCreateFromString();
        java.lang.String str25 = vanilla16.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams26 = vanilla16.getDelegateCreator();
        boolean boolean27 = vanilla16.canCreateFromObjectWith();
        boolean boolean28 = vanilla16.canCreateUsingArrayDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = vanilla1.createUsingArrayDelegate(deserializationContext14, (java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(annotatedParameter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(annotatedWithParams22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.Object" + "'", str25, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        boolean boolean9 = vanilla1.canCreateFromLong();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean8 = vanilla1.canCreateFromLong();
        boolean boolean9 = vanilla1.canCreateFromInt();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getArrayDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDelegateCreator();
        boolean boolean12 = vanilla1.canInstantiate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertNull(annotatedWithParams6);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) 'a');
        boolean boolean2 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean3 = vanilla1.canCreateUsingDelegate();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromDouble();
        boolean boolean10 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla1.getFromObjectArguments(deserializationConfig11);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray14 = vanilla1.getFromObjectArguments(deserializationConfig13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertNull(settableBeanPropertyArray14);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = vanilla1.getDelegateType(deserializationConfig2);
        boolean boolean4 = vanilla1.canCreateFromLong();
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromString(deserializationContext9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        boolean boolean5 = vanilla1.canCreateFromInt();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray13 = vanilla1.getFromObjectArguments(deserializationConfig12);
        java.lang.String str14 = vanilla1.getValueTypeDesc();
        boolean boolean15 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertNull(settableBeanPropertyArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Object" + "'", str14, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canInstantiate();
        boolean boolean13 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        boolean boolean12 = vanilla1.canInstantiate();
        boolean boolean13 = vanilla1.canCreateFromInt();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla1.getIncompleteParameter();
        java.lang.String str13 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getDelegateCreator();
        boolean boolean15 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Object" + "'", str13, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(annotatedWithParams16);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getArrayDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getWithArgsCreator();
        boolean boolean14 = vanilla1.canCreateUsingDelegate();
        boolean boolean15 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla1.getDelegateCreator();
        boolean boolean17 = vanilla1.canCreateFromLong();
        boolean boolean18 = vanilla1.canCreateUsingDelegate();
        boolean boolean19 = vanilla1.canCreateFromObjectWith();
        boolean boolean20 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        java.lang.String str12 = vanilla11.getValueTypeDesc();
        boolean boolean13 = vanilla11.canCreateUsingDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingArrayDelegate(deserializationContext9, (java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        boolean boolean10 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateFromInt();
        boolean boolean9 = vanilla1.canCreateFromString();
        boolean boolean10 = vanilla1.canInstantiate();
        boolean boolean11 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray13 = vanilla1.getFromObjectArguments(deserializationConfig12);
        boolean boolean14 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getArrayDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla1.getArrayDelegateType(deserializationConfig15);
        java.lang.String str17 = vanilla1.getValueTypeDesc();
        boolean boolean18 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = vanilla1.createFromDouble(deserializationContext20, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.Object" + "'", str17, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(annotatedWithParams19);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean7 = vanilla1.canInstantiate();
        boolean boolean8 = vanilla1.canCreateFromString();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromDouble(deserializationContext12, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        boolean boolean9 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingArrayDelegate(deserializationContext10, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        boolean boolean10 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(annotatedWithParams15);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) 'a');
        boolean boolean2 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean3 = vanilla1.canCreateUsingDelegate();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean13 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromDouble(deserializationContext5, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedParameter11);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        boolean boolean6 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDelegateCreator();
        boolean boolean12 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray14 = vanilla1.getFromObjectArguments(deserializationConfig13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray14);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getArrayDelegateType(deserializationConfig6);
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        boolean boolean10 = vanilla1.canCreateFromLong();
        boolean boolean11 = vanilla1.canCreateFromString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.String[] strArray11 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromObjectWith(deserializationContext10, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        boolean boolean12 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = vanilla1.getFromObjectArguments(deserializationConfig4);
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter3);
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) 'a');
        boolean boolean2 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean3 = vanilla1.canCreateUsingDelegate();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateFromInt();
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateFromLong();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromInt(deserializationContext10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = annotatedParameter3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(annotatedParameter3);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        boolean boolean10 = vanilla1.canCreateFromInt();
        boolean boolean11 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromBoolean(deserializationContext12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getArrayDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromInt(deserializationContext7, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = vanilla1.getDelegateType(deserializationConfig2);
        boolean boolean4 = vanilla1.canCreateFromLong();
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromBoolean();
        boolean boolean11 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = vanilla1.getDelegateType(deserializationConfig2);
        boolean boolean4 = vanilla1.canCreateFromLong();
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromString(deserializationContext11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createUsingDefault(deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        boolean boolean10 = vanilla1.canCreateFromInt();
        boolean boolean11 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla1.getIncompleteParameter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean8 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        boolean boolean10 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla1.getIncompleteParameter();
        boolean boolean13 = vanilla1.canCreateUsingDelegate();
        boolean boolean14 = vanilla1.canCreateUsingDelegate();
        java.lang.String str15 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = vanilla1.getArrayDelegateType(deserializationConfig16);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Object" + "'", str15, "java.lang.Object");
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(annotatedWithParams18);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromString();
        boolean boolean11 = vanilla1.canCreateFromLong();
        boolean boolean12 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla1.getDefaultCreator();
        boolean boolean16 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter17 = vanilla1.getIncompleteParameter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(annotatedParameter17);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getArrayDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla1.getArrayDelegateType(deserializationConfig15);
        boolean boolean17 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla20 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean21 = vanilla20.canCreateFromBoolean();
        boolean boolean22 = vanilla20.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = vanilla20.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = vanilla20.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = vanilla20.getArrayDelegateCreator();
        boolean boolean26 = vanilla20.canCreateUsingArrayDelegate();
        boolean boolean27 = vanilla20.canCreateFromLong();
        boolean boolean28 = vanilla20.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = vanilla20.getDelegateType(deserializationConfig29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = vanilla1.createUsingArrayDelegate(deserializationContext18, (java.lang.Object) vanilla20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(annotatedWithParams23);
        org.junit.Assert.assertNull(annotatedWithParams24);
        org.junit.Assert.assertNull(annotatedWithParams25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(javaType30);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromInt();
        boolean boolean13 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla1.getDelegateType(deserializationConfig14);
        boolean boolean16 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla1.getArrayDelegateCreator();
        boolean boolean18 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        boolean boolean13 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDelegateCreator();
        boolean boolean11 = vanilla1.canCreateFromInt();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getWithArgsCreator();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        boolean boolean11 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla1.getIncompleteParameter();
        boolean boolean13 = vanilla1.canCreateFromObjectWith();
        boolean boolean14 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateFromInt();
        boolean boolean9 = vanilla1.canCreateFromLong();
        boolean boolean10 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getArrayDelegateType(deserializationConfig11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getArrayDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla1.getDefaultCreator();
        boolean boolean16 = vanilla1.canCreateFromString();
        java.lang.String str17 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.Object" + "'", str17, "java.lang.Object");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = vanilla1.getDelegateType(deserializationConfig2);
        boolean boolean4 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromString();
        boolean boolean9 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDelegateCreator();
        boolean boolean11 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromLong(deserializationContext12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getArrayDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla1.getDefaultCreator();
        boolean boolean16 = vanilla1.canCreateFromBoolean();
        boolean boolean17 = vanilla1.canCreateFromDouble();
        boolean boolean18 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(annotatedWithParams19);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        boolean boolean10 = vanilla1.canCreateFromLong();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        boolean boolean6 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        boolean boolean5 = vanilla1.canCreateFromInt();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromInt(deserializationContext11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromBoolean(deserializationContext4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        boolean boolean10 = vanilla1.canCreateUsingDelegate();
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        boolean boolean12 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray15 = vanilla1.getFromObjectArguments(deserializationConfig14);
        boolean boolean16 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(settableBeanPropertyArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotatedWithParams17);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromInt();
        boolean boolean13 = vanilla1.canCreateUsingDefault();
        boolean boolean14 = vanilla1.canCreateFromInt();
        boolean boolean15 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray5 = vanilla1.getFromObjectArguments(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter3);
        org.junit.Assert.assertNull(settableBeanPropertyArray5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromString();
        boolean boolean9 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromString(deserializationContext13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getArrayDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromLong(deserializationContext9, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromLong();
        boolean boolean8 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createUsingArrayDelegate(deserializationContext9, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromBoolean(deserializationContext10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean7 = vanilla1.canInstantiate();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean12 = vanilla11.canCreateFromDouble();
        boolean boolean13 = vanilla11.canCreateUsingDefault();
        boolean boolean14 = vanilla11.canCreateUsingDelegate();
        boolean boolean15 = vanilla11.canCreateUsingDelegate();
        boolean boolean16 = vanilla11.canInstantiate();
        boolean boolean17 = vanilla11.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = vanilla11.getDelegateType(deserializationConfig18);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = vanilla11.getDefaultCreator();
        boolean boolean21 = vanilla11.canCreateUsingDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(annotatedWithParams20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean11 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla1.getIncompleteParameter();
        boolean boolean14 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = vanilla1.getDelegateType(deserializationConfig17);
        boolean boolean19 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean7 = vanilla1.canInstantiate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromDouble(deserializationContext8, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        boolean boolean9 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDelegateCreator();
        boolean boolean11 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromInt(deserializationContext12, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla1.getFromObjectArguments(deserializationConfig11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromInt(deserializationContext10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromString();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean10 = vanilla1.canCreateFromInt();
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray13 = vanilla1.getFromObjectArguments(deserializationConfig12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromLong(deserializationContext14, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray13);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = vanilla1.getDelegateType(deserializationConfig2);
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingDefault(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        boolean boolean13 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromDouble(deserializationContext14, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromString();
        boolean boolean9 = vanilla1.canCreateFromString();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDelegateCreator();
        boolean boolean12 = vanilla1.canCreateFromObjectWith();
        boolean boolean13 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        boolean boolean8 = vanilla1.canCreateUsingDelegate();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromString();
        boolean boolean11 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromString();
        boolean boolean5 = vanilla1.canCreateUsingArrayDelegate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        boolean boolean10 = vanilla1.canCreateFromInt();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromLong();
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        boolean boolean10 = vanilla1.canCreateFromBoolean();
        boolean boolean11 = vanilla1.canCreateFromInt();
        boolean boolean12 = vanilla1.canCreateFromLong();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromLong();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        boolean boolean9 = vanilla1.canCreateFromLong();
        boolean boolean10 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        boolean boolean10 = vanilla1.canCreateFromDouble();
        boolean boolean11 = vanilla1.canCreateFromString();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        boolean boolean9 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromString();
        boolean boolean13 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromBoolean(deserializationContext14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean12 = vanilla11.canCreateFromBoolean();
        boolean boolean13 = vanilla11.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla11.getArrayDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla11.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = vanilla11.getDelegateType(deserializationConfig17);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = vanilla11.getArrayDelegateType(deserializationConfig19);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = vanilla11.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter22 = vanilla11.getIncompleteParameter();
        boolean boolean23 = vanilla11.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) vanilla11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(annotatedWithParams21);
        org.junit.Assert.assertNull(annotatedParameter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla1.getFromObjectArguments(deserializationConfig11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDefault(deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(8);
        boolean boolean2 = vanilla1.canCreateFromLong();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromInt(deserializationContext4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        boolean boolean11 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla1.getDelegateType(deserializationConfig12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla16 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla16.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = vanilla16.getDelegateType(deserializationConfig18);
        java.lang.String str20 = vanilla16.getValueTypeDesc();
        boolean boolean21 = vanilla16.canCreateUsingDefault();
        boolean boolean22 = vanilla16.canCreateFromInt();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = vanilla1.createUsingArrayDelegate(deserializationContext14, (java.lang.Object) vanilla16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Object" + "'", str20, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean10 = vanilla9.canCreateFromBoolean();
        boolean boolean11 = vanilla9.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla9.getIncompleteParameter();
        boolean boolean13 = vanilla9.canCreateFromDouble();
        boolean boolean14 = vanilla9.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla9.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = vanilla9.getIncompleteParameter();
        boolean boolean17 = vanilla9.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = vanilla9.getDelegateType(deserializationConfig18);
        boolean boolean20 = vanilla9.canCreateUsingDelegate();
        java.lang.Class<?> wildcardClass21 = vanilla9.getClass();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla24 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean25 = vanilla24.canCreateFromDouble();
        boolean boolean26 = vanilla24.canCreateUsingDefault();
        boolean boolean27 = vanilla24.canCreateUsingDelegate();
        boolean boolean28 = vanilla24.canCreateUsingDelegate();
        boolean boolean29 = vanilla24.canInstantiate();
        boolean boolean30 = vanilla24.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = vanilla24.getDelegateType(deserializationConfig31);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig33 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray34 = vanilla24.getFromObjectArguments(deserializationConfig33);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter35 = vanilla24.getIncompleteParameter();
        boolean boolean36 = vanilla24.canCreateUsingDelegate();
        boolean boolean37 = vanilla24.canCreateUsingDelegate();
        java.lang.String str38 = vanilla24.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams39 = vanilla24.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = vanilla24.getArrayDelegateType(deserializationConfig40);
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla43 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean44 = vanilla43.canCreateFromBoolean();
        boolean boolean45 = vanilla43.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = vanilla43.getArrayDelegateType(deserializationConfig46);
        boolean boolean48 = vanilla43.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams49 = vanilla43.getDelegateCreator();
        boolean boolean50 = vanilla43.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams51 = vanilla43.getWithArgsCreator();
        boolean boolean52 = vanilla43.canCreateUsingDefault();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla54 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean55 = vanilla54.canCreateFromBoolean();
        boolean boolean56 = vanilla54.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig57 = null;
        com.fasterxml.jackson.databind.JavaType javaType58 = vanilla54.getArrayDelegateType(deserializationConfig57);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig59 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray60 = vanilla54.getFromObjectArguments(deserializationConfig59);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig61 = null;
        com.fasterxml.jackson.databind.JavaType javaType62 = vanilla54.getArrayDelegateType(deserializationConfig61);
        boolean boolean63 = vanilla54.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams64 = vanilla54.getDelegateCreator();
        java.lang.String str65 = vanilla54.getValueTypeDesc();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla67 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean68 = vanilla67.canCreateFromBoolean();
        boolean boolean69 = vanilla67.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig70 = null;
        com.fasterxml.jackson.databind.JavaType javaType71 = vanilla67.getArrayDelegateType(deserializationConfig70);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig72 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray73 = vanilla67.getFromObjectArguments(deserializationConfig72);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig74 = null;
        com.fasterxml.jackson.databind.JavaType javaType75 = vanilla67.getArrayDelegateType(deserializationConfig74);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig76 = null;
        com.fasterxml.jackson.databind.JavaType javaType77 = vanilla67.getDelegateType(deserializationConfig76);
        java.lang.String str78 = vanilla67.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig79 = null;
        com.fasterxml.jackson.databind.JavaType javaType80 = vanilla67.getArrayDelegateType(deserializationConfig79);
        boolean boolean81 = vanilla67.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams82 = vanilla67.getWithArgsCreator();
        boolean boolean83 = vanilla67.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter84 = vanilla67.getIncompleteParameter();
        java.lang.Class<?> wildcardClass85 = vanilla67.getClass();
        java.lang.Object[] objArray86 = new java.lang.Object[] { vanilla9, (byte) 1, javaType41, vanilla43, str65, wildcardClass85 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = vanilla1.createFromObjectWith(deserializationContext7, objArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertNull(annotatedParameter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(settableBeanPropertyArray34);
        org.junit.Assert.assertNull(annotatedParameter35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.Object" + "'", str38, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams39);
        org.junit.Assert.assertNull(javaType41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(javaType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(annotatedWithParams49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(annotatedWithParams51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(javaType58);
        org.junit.Assert.assertNull(settableBeanPropertyArray60);
        org.junit.Assert.assertNull(javaType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(annotatedWithParams64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang.Object" + "'", str65, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(javaType71);
        org.junit.Assert.assertNull(settableBeanPropertyArray73);
        org.junit.Assert.assertNull(javaType75);
        org.junit.Assert.assertNull(javaType77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.lang.Object" + "'", str78, "java.lang.Object");
        org.junit.Assert.assertNull(javaType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(annotatedWithParams82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(annotatedParameter84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) 'a');
        boolean boolean2 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean3 = vanilla1.canCreateUsingDelegate();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        boolean boolean8 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean7 = vanilla1.canInstantiate();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(8);
        java.lang.Class<?> wildcardClass2 = vanilla1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        boolean boolean11 = vanilla1.canCreateUsingDefault();
        boolean boolean12 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromDouble(deserializationContext8, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canInstantiate();
        boolean boolean8 = vanilla1.canInstantiate();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        boolean boolean10 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getDelegateType(deserializationConfig11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        boolean boolean11 = vanilla1.canCreateFromInt();
        boolean boolean12 = vanilla1.canCreateFromLong();
        boolean boolean13 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        boolean boolean6 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromLong();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromString(deserializationContext12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromDouble();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromString();
        java.lang.Class<?> wildcardClass11 = vanilla1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getWithArgsCreator();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromInt();
        boolean boolean13 = vanilla1.canCreateFromInt();
        boolean boolean14 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter15 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = vanilla1.getArrayDelegateType(deserializationConfig16);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = vanilla1.createFromBoolean(deserializationContext19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(annotatedParameter15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(annotatedWithParams18);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getArrayDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter15 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = vanilla1.getArrayDelegateType(deserializationConfig16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla20 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(2);
        boolean boolean21 = vanilla20.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = vanilla20.getDelegateType(deserializationConfig22);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = vanilla20.getDelegateType(deserializationConfig24);
        boolean boolean26 = vanilla20.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = vanilla1.createUsingArrayDelegate(deserializationContext18, (java.lang.Object) vanilla20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(annotatedParameter15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = vanilla1.getArrayDelegateType(deserializationConfig4);
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray14 = vanilla1.getFromObjectArguments(deserializationConfig13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createFromLong(deserializationContext15, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray14);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getWithArgsCreator();
        boolean boolean7 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        boolean boolean3 = vanilla1.canCreateFromString();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getWithArgsCreator();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        boolean boolean11 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        boolean boolean6 = vanilla1.canInstantiate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }
}

